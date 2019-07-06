/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author ananda
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //objeto c1 instanciado
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.modelo = "Cristal";
        c1.carga = 50;
        //chama o método tampada
        //c1.tampar();
        //chama o método destampar
        //c1.destampar();
        //chama o estado do objeto
        c1.status();
        
        //chama o método rabiscar
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Piloto";
        c2.cor = "Vermelha";
        c2.ponta = 1f;
        c2.tampada = true;
        c2.carga = 100;
        c2.status();
        c2.rabiscar();
    }
        
}
    

