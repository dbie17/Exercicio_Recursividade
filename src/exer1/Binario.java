/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1;

/**
 *
 * @author home
 */
public class Binario {
    
    
    static void binario(int n){
        if (n>0){
            binario (n/2);
            
            System.out.println(n%2);
        }
    }
    
    public static void main(String[] args) {
        binario(20);
			
}
}
