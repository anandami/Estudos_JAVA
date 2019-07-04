/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaavaliacao;

/**
 *
 * @author ananda
 */
public class JavaAvaliacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercicio Avaliação - qual a saída de z?
        int x = 5;
        int y = 2;
        double z;
        z = x/2;
        System.out.println(z);
        
        //Exercicio Avaliação
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
        
        String object[] = {"a","ab","abc"};
        System.out.println(object[1]);
        
        for (int i = 1; i <5; i++){
            if (i == 2) continue;
            System.out.println("i = " + 1);
        }


    }
    
}
