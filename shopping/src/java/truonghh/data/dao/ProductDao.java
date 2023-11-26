/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonghh.data.dao;

import java.util.List;
import truonghh.data.model.Product;

/**
 *
 * @author Huu_Truong_1206
 */
public interface ProductDao {
    public List<Product> findAll();
    
}
