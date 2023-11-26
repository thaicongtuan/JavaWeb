package truonghh.data.web;


import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import truonghh.data.dao.Database;
import truonghh.data.model.Category;
import truonghh.data.model.Product;

public class HomeServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> lstCategory = Database.getCategoryDao().findAll();
        req.setAttribute("lstCategory", lstCategory);
        List<Product> lstProduct = Database.getProductDao().findAll();
        req.setAttribute("lstProduct", lstProduct);
        req.setAttribute("title", "Home Page");
        req.getRequestDispatcher("./views/home.jsp").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    
}