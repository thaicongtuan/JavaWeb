/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonghh.data.dao;

import truonghh.data.impl.CategoryImpl;
import truonghh.data.impl.ProductImpl;
import truonghh.data.impl.UserImpl;

/**
 *
 * @author Huu_Truong_1206
 */
public class Database {
   public static CategoryDao getCategoryDao(){
       return new CategoryImpl();
   }
   public static ProductDao getProductDao(){
       return new ProductImpl();
   }
   public static UserDao getUserDao(){
       return new UserImpl();
   }
}
