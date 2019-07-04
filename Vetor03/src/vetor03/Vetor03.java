/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author ananda
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5,2.75,8,-4.75, 100, 300, 1, 4, 9.7635};
        Arrays.sort(v);
        for (double valor:v){
            System.out.println(valor + " ");
        }
        //Realiza a busca do elemento 100 - retorna a posição
        int pos = Arrays.binarySearch(v, 100);
        System.out.println(pos);
    }
    
}
