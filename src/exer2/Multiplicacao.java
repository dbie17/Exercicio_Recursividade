/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2;

import javax.swing.JOptionPane;

/**
 *
 * @author Dionisio Antonio Bie
 */
public class Multiplicacao {
    public static void main (String args[]){
        //variaveis
        Multiplicacao f= new Multiplicacao();
        int x,y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduza o valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Introduza o valor de y"));
        
         JOptionPane.showMessageDialog(null, "A multiplicação de " + x + " e " + y + " é: " + f.multiplicacao(x, y));
    }
    
    /*------------------------------------------------------------------------------
*                    FUNÇÃO MULTIPLICAÇÃO COM RECURSIVIDADE
--------------------------------------------------------------------------------*/
    public int multiplicacao(int x, int y) {
        if (y == 1) { //condição de parada
            return x;
        } else {
            return x + multiplicacao(x, y - 1);
        }

    } //fim da função multiplicacao
    
}
