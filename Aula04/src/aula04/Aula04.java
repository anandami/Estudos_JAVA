/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author ananda
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("PILOTO", "amarela", 1);
        //c1.setModelo("BIC");
        //c1.modelo = "BIC";
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f; //O privado proibe que eu mexa. DEU CERTO DESSA VEZ!
        c1.status();
        
        //System.out.println("Tenho uma caneta " + c1.getModelo() + 
        //" de ponta " + c1.getPonta());
        
        
        
        
    }
    
}
