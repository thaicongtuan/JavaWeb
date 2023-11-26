/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonghh.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import truonghh.data.dao.UserDao;
import truonghh.data.driver.MySQLDriver;
import truonghh.data.model.User;

/**
 *
 * @author Huu_Truong_1206
 */
public class UserImpl implements UserDao {

    Connection con = MySQLDriver.getConnection();

    @Override
    public User findUser(String emailphone, String password) {
        String sql;
        if (emailphone.contains("@")) {
            sql = "SELECT * FROM Users where email ='" + emailphone + "' and password='" + password + "'";
        } else {
            sql = "SELECT * FROM Users where phone ='" + emailphone + "' and password='" + password + "'";
        }
        try {
            PreparedStatement sttm = con.prepareStatement(sql);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                return new User(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void createUser(String name, String email, String phone, String password) {
        String sql = "INSERT INTO users VALUE(\"" + name + "\", \"" + email + "\",\"" + phone + "\", \"" + password + "\")";
        try {
            PreparedStatement sttm = con.prepareStatement(sql);
            sttm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
