/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author ananda
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fazer um programa que lê quantas pernas algo tem e fala o que é
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas o ser tem?");
        int perna = teclado.nextInt();
        String tipo;
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T";
                break;
        }
        System.out.println("O ser escolhido é: " + tipo);
                
        
    }
    
}
