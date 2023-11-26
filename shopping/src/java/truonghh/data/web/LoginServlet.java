package truonghh.data.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import truonghh.data.dao.Database;
import truonghh.data.model.User;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Login Page");
        req.getRequestDispatcher("./views/login.jsp").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String emailphone = req.getParameter("emailphone");
        String password = req.getParameter("password");
        User user = Database.getUserDao().findUser(emailphone, password);
        if (user == null) {
            req.getSession().setAttribute("error_login", "Your information is incorrect");
            resp.sendRedirect("login");
        } else if (user.getRole().equals("admin")) {
            resp.sendRedirect("admin");
        }
        else{
            req.getSession().setAttribute("user", user);
            req.removeAttribute("error_login");
            resp.sendRedirect("home");
        }

    }

}
