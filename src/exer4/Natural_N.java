/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer4;

import javax.swing.JOptionPane;

/**
 *
 * @author Dionisio Antonio Bie
 */
public class Natural_N {
     public static int OcorrenciaNumero(String numero,String numeroProcurado){
         int i=0;
         int k=0;
        if(numero.length()==0){
         return numero.length();}
        if(String.valueOf(numero.charAt(k)).equals(numeroProcurado)){
        i++;}
        k++;
    return OcorrenciaNumero(numero.substring(1),numeroProcurado)+i;
    }
    
    public static void main(String[] args) {
        String n=JOptionPane.showInputDialog(null,"Introduza o numero!");
         String n1=JOptionPane.showInputDialog(null,"Introduza o numero da ocorrencia!");
       JOptionPane.showMessageDialog(null,OcorrenciaNumero(n,n1));
    }
    
}
