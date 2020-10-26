package ru.kpfu.itis.group903.nurkaev.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework
 */

@WebFilter("/*")
public class EncodingFilter extends HttpFilter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        req.setCharacterEncoding("UTF-8");

        filterChain.doFilter(servletRequest, servletResponse);
    }
    
}
