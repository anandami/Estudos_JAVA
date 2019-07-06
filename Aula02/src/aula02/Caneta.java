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
public class Caneta {
    //criação dos atributos da classe caneta
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //criação dos métodos
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar!");
        }else {
            System.out.println("Estou rabiscando...");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
        
    }
    
    void destampar(){
        this.tampada = false;
        
    }
    
    //mostrar status do objeto 
    //this é "auto-referência"
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga atual: " + this.carga);
    }
    
    
    
}
