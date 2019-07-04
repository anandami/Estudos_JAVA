/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author ananda
 */
public class Operacoes {
    public static String contador(int i, int f){ //torno público e estático por conta do programa principal
        String s = "";
        for (int c=1;c<=f; c++){
            s+=c + "";
        }
        return s;
    }
    
}
