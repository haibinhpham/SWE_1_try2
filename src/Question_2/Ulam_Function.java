/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_2;

/**
 *
 * @author ad
 */
public class Ulam_Function {
    
    public static void UlamSequence(int n){
        while(n != 1){
            if(n%2 == 0){
                n /= 2;
            }
            else{
                n = (n * 3) + 1;
            }
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n = 999999;
        System.out.println("the ulam sequence for n = " + n  + " is: ");
        
        for(int i = 999999; i >= 0 ; i--){
            UlamSequence(n--);
        }
        
        
        
        
    }
}
