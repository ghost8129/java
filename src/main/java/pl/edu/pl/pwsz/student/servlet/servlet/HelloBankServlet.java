package pl.edu.pl.pwsz.student.servlet.servlet;

import pl.edu.pl.pwsz.student.servlet.exception.NoSuchResourceException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Student on 2017-02-28.
 */
public class HelloBankServlet extends HttpServlet {

    private void processRequest(HttpServletRequest req,
                                HttpServletResponse resp)
            throws ServletException, IOException {
        User user = new User();
        user.setName("Tomasz");
        user.setLastname("Nowak");
        user.setYearOfbirth(1990);
        user.setSex("Male");
        req.setAttribute("user", user);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/index.jsp");
        rd.forward(req, resp);
    }

    private void foo() throws NoSuchResourceException {
        throw new NoSuchResourceException();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);

    }

    private class IOException extends Exception {
    }
}
