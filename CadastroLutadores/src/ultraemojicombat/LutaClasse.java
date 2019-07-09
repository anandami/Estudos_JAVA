/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author ananda
 */
public class LutaClasse {
    //Atributos
    private LutadoresClasse desafiado; //tipo abstrato de dado
    private LutadoresClasse desafiante; //tipo abstrato de dado
    private int rounds;
    private boolean aprovada;
    
    //Métodos especiais getters e setters
    public LutadoresClasse getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(LutadoresClasse desafiado) {
        this.desafiado = desafiado;
    }

    public LutadoresClasse getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(LutadoresClasse desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    //Métodos Públicos
    public void marcarLuta(LutadoresClasse lutador1, LutadoresClasse lutador2){
        if ((lutador1.getCategoria().equals(lutador2.getCategoria())) && lutador1 != lutador2){
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0, 1 ou 2
            
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado venceu
                    System.out.println("Venceu " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante venceu
                    System.out.println("Venceu " + this.desafiante);
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                    
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    
    
}
