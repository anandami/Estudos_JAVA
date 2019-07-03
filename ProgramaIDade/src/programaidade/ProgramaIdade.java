/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author ananda
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int nasc = teclado.nextInt();
        Calendar calendario = Calendar.getInstance();
        int atual = +calendario.get(Calendar.YEAR);
        int idade = atual - nasc;
        System.out.printf("Sua idade atual é %d \n", idade);
        if (idade >= 18){
            System.out.println("Você atingiu a maioridade");
        } else {
            System.out.println("Você ainda não atingiu a maioridade");
        }
    }
}
