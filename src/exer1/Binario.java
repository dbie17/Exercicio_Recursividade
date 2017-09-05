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
    public static void main(String[] args) 
	{
				int x=13;
				int r=0;
				String b="";
				System.out.println("x:"+x);
				b=Integer.toBinaryString(x);
				System.out.println("b:"+b);
				System.out.println("Verificao:"+Integer.parseInt(b,2));
				System.out.println("......");
				//Operador shift
				r=x<<1;
				System.out.println("r:"+r);
				b=Integer.toBinaryString(r);
				System.out.println("b:"+b);
				System.out.println("Verificao: "+Integer.parseInt(b,2));
				System.out.println("......");
				r=x<<1;
				System.out.println("r: "+r);
				b=Integer.toBinaryString(r);
				System.out.println("b: "+b);
				System.out.println("Verificao: "+Integer.parseInt(b,2));
			}
}
