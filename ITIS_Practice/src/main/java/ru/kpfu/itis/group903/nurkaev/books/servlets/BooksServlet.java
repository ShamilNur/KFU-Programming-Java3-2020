package ru.kpfu.itis.group903.nurkaev.books.servlets;

import ru.kpfu.itis.group903.nurkaev.books.repositories.BooksRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework 11
 */

@WebServlet("/books")
public class BooksServlet extends HttpServlet {

    private BooksRepository booksRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext servletContext = config.getServletContext();
        this.booksRepository = (BooksRepository) servletContext.getAttribute("booksRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // hashMap = {"Author" : "Books"}
        HashMap<String, String> hashMap = booksRepository.getAuthorsWithBooks();
        req.getSession().setAttribute("hashMap", hashMap);

        req.getRequestDispatcher("/WEB-INF/views/books.jsp").forward(req, resp);
    }
}
