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
        c1.modelo = "Bic";
        c1.cor = "azul";
        //c1.ponta = "o.5";
        c1.carga = 90;//embora seja protegido, o java aceita por conta da classe Aula02
        c1.tampada = false;
        
        //c1.rabiscar();
        
        c1.destampar();
        
        //chama o estado do objeto
        c1.status();
        
        /*Neste exercicio houve uma diferença com relação ao resultado:
        *quando o professor colocou o atributo tampada como privado e os métodos
        *tampada e destampada (que manipulam tampada) como publicos, o Java
        *permitiu a manipulação dos dados, já no meu exercício não.
        */
        
        
        
        
    }
        
}
    

