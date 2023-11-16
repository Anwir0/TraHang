/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author TgNam
 */
public class Validate {

    private static final String REGEX_NAME = "^(?=\\s*\\S)(.{1,40})$";
    private static final String REGEX_DATE = "^(19\\d{2}|20\\d{2}|2023)-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";

    public static boolean isCheckName(String name) {
        return name.trim().matches(REGEX_NAME);
    }

    public static boolean isCheckDate(String date) {
        return date.trim().matches(REGEX_DATE);
    }
}
