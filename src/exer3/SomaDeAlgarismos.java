/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dionisio Antonio Bie
 */
public class SomaDeAlgarismos {
   public static int somaAlgarismosB(int num, int somaMomentanea){
        if(num<1)
            return somaMomentanea;
        somaMomentanea+=(num%10);
        return somaAlgarismosB(num/10, somaMomentanea);
    }

    // (Recursividade)
    // Soma de todos os algarismos
    public static void main(String[] args) {
        System.out.println("Digite um número: ");

        int num = new Scanner(System.in).nextInt();
        int soma = somaAlgarismosB(num, 0);

        System.out.println("O valor da soma dos algarismos é: " + soma);

    }

   
    
}
