package truonghh.data.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import truonghh.data.dao.Database;
import truonghh.data.model.User;

public class RegServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Register Page");
        req.getRequestDispatcher("./views/register.jsp").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String emailphone = req.getParameter("emailphone");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
        User user = Database.getUserDao().findUser(emailphone, password);
        if (user == null) {
            Database.getUserDao().createUser(name, email, phone, password);
        } else {
            
        }
    }

}
