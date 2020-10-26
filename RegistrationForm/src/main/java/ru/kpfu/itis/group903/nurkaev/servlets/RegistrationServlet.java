package ru.kpfu.itis.group903.nurkaev.servlets;

import ru.kpfu.itis.group903.nurkaev.models.User;
import ru.kpfu.itis.group903.nurkaev.exceptions.DbException;
import ru.kpfu.itis.group903.nurkaev.exceptions.DuplicateEntryException;
import ru.kpfu.itis.group903.nurkaev.services.UsersService;
import ru.kpfu.itis.group903.nurkaev.validations.Validator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework
 */

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (Validator.dataIsCorrect(req, resp)) {
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            try {
                User user = new User(name, email, password);
                UsersService.add(user);
                resp.sendRedirect(req.getRequestURI());
                return;
            } catch (DbException e) {
                req.setAttribute("message", "Error with DB has been occurred.");
            } catch (DuplicateEntryException e) {
                req.setAttribute("message", "User with such email already exists.");
            }
        } else {
            req.setAttribute("message", "You entered incorrect data or did not fill in all the fields.");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, resp);
    }
}
