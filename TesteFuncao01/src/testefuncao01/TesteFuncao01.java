/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author ananda
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    //Método Soma utilizando procedimentos 
    static void soma1 (int a, int b){
        int s = a + b;
        System.out.println("A soma do método (procedimento) de " + a + " + " + b + " é " + s);
    }
    
    //Método Soma utilizando Funções
    static int soma2(int a, int b){
        int s = a+b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa!");
        //Chama o método
        soma1(5,2);
        int sm = (int)soma2(6,3);
        System.out.println("A soma com método (funcao) vale " + sm);
    }
    
}
