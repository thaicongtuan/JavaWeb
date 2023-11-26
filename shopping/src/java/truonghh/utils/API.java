/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonghh.utils;

/**
 *
 * @author Huu_Truong_1206
 */
public class API {

    public static String getName(String fullName) {
        String name = "";
        for (int i = fullName.length() - 1; i >= 0; i--) {
            if (fullName.charAt(i) == ' ') {
                break;
            }
            name = fullName.charAt(i) + name;
        }
        return name;
    }
}
