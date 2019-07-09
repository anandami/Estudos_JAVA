/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author ananda
 */
public class LutadoresClasse implements LutadoresCap {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //getter e setter
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso()<52.2){
            this.categoria = "Invalido";
        }else if (this.getPeso()<=70.3){
            this.categoria = "Leve";
        }else if (this.getPeso() <= 83.9){
            this.categoria = "Medio";
        }else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
           
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //método construtor
    public LutadoresClasse(String nome, String nacionalidade,
            int idade, float altura, float peso, int vitorias, 
            int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //métodos abstratos
    @Override
    public void apresentar() {
        System.out.println("IIIIIIT'SSS TIMEEEE!");
        System.out.print("Vamos apresentar agora o lutador: " + this.getNome());
        System.out.print("! De origem do(a) " + this.getNacionalidade());
        System.out.print(" com apenas " + this.getIdade());
        System.out.print(" anos, medindo " + this.getAltura());
        System.out.print("m. e pesando " + this.getPeso());
        System.out.print("kg. Soma atualmente " + this.getVitorias());
        System.out.print(" vitórias, " + this.getDerrotas());
        System.out.println(" derrotas e " + this.getEmpates() + " empates.");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        
    }

    @Override
    public void status() {
        System.out.println(" -- ESTADO ATUAL DO LUTADOR NO UEC -- ");
        System.out.println("NOME: " + this.getNome());
        System.out.println("CATEGORIA: " + this.getCategoria());
        System.out.println("VITÓRIAS: " + this.getVitorias());
        System.out.println("DERROTAS: " + this.getDerrotas());
        System.out.println("EMPATES: " + this.getEmpates());
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
    
}
