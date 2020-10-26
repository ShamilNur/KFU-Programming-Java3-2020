package ru.kpfu.itis.group903.nurkaev.filters;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework
 */

@WebFilter("/registration")
public class BrowserNameFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String userAgent = request.getHeader("User-Agent");
        System.out.println(userAgent);

        if (userAgent.contains("Edg")) {
            try (PrintWriter printWriter = response.getWriter()) {
                printWriter.println("Please change your browser.");
            }
        } else {
            chain.doFilter(request, response);
        }
    }
}
