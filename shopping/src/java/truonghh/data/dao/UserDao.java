/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonghh.data.dao;

import truonghh.data.model.User;

/**
 *
 * @author Huu_Truong_1206
 */
public interface UserDao {
    public User findUser(String email, String password);
    public void createUser(String name,String email, String phone, String password);
}