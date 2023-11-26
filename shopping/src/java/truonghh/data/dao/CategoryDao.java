/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonghh.data.dao;

import java.util.List;
import truonghh.data.model.Category;

/**
 *
 * @author Huu_Truong_1206
 */
public interface CategoryDao {
    public List<Category> findAll();

    public boolean insert(Category category);

    public boolean update(Category category);

    public boolean delete(int id);

    public Category find(int id);
}
