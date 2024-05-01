/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_4;

import java.util.Arrays;

/**
 *
 * @author ad
 */
public class Implementation_Dev {
    public static void main(String[] args) {
        String[] language = {"Java","Javascript","Python"};
        String[] experience = {"made 2 apps", "knows AI integration","etc"};
        
        Developer dev = new Developer("YiLongMa",45,10,language,experience);
        System.out.println(dev.getName());
        System.out.println(dev.getAge());
        System.out.println(Arrays.toString(dev.getLanguage()));
        System.out.println(Arrays.toString(dev.getExperience()));
        
    }
}
