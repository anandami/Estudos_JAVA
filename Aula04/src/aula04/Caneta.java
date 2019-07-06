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
public class Caneta {
    //criando a classe caneta...
    public String modelo;
    private float ponta; 
    private boolean tampada;
    public String cor;
    
    //CRIANDO MÉTODO CONSTRUTOR
    public Caneta(String m, String c, float p){ //mesmo nome da Classe
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
    
    public String getModelo(){ //o retorno é String então não pode ser void
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("---SOBRE A CANETA---");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada?" + this.tampada);
        
        
    }
    
}
