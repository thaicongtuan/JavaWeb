/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonghh.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import truonghh.data.dao.ProductDao;
import truonghh.data.driver.MySQLDriver;
import truonghh.data.model.Product;

/**
 *
 * @author Huu_Truong_1206
 */
public class ProductImpl implements ProductDao{
    Connection con = MySQLDriver.getConnection();
    @Override
    public List<Product> findAll() {
        List<Product> lstProduct = new ArrayList<>(); //Tạo biến lưu trữ danh sách Category
        String sql = "select * from products"; //Câu lệnh truy vấn
        try {
            PreparedStatement sttm = con.prepareStatement(sql); 
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String image = rs.getString("image");
                double price = rs.getDouble("price");
                int qty = rs.getInt("quantity");
                boolean status = rs.getBoolean("status");
                int id_category = rs.getInt("id_category");
                lstProduct.add(new Product(id, name,image, price, qty, status, id_category));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstProduct;
    }
    
}
