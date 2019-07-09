package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        //Criar a conta para o Jubileu
        p1.abrirConta("CC");
        p1.setNumConta(1111000);
        p1.setDono("Jubileu");
        
        //Criar a conta para a Creuza
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("CP");
        p2.setNumConta(121212);
        p2.setDono("Creuza");
        
        
        //depositos
        p1.depositar(100);
        p2.depositar(300);
        
        //saque
        p2.sacar(100);
        p1.sacar(150);
        
        //fechar contas
        p1.fecharConta();
        
        
        //ver estados
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
