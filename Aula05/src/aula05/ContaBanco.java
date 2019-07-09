package aula05;
/**
 * Description of ContaBanco
 *
 * @author ananda
 * Atividade realizada no CursoEmVideo Aula 5b
 * 
 * Diagrama de Classe a ser utilizado
 * 
 * ContaBanco
 * + numConta
 * # tipo
 * - dono
 * - saldo 
 * - status
 * 
 * + abrirConta()
 * + fecharConta()
 * + depositar()
 * + sacar()
 * + pagarMensal()
 * 
 * sendo que cada um dos atributos se tornará, posteriormente, 
 * um metódo getter e setter
 * 
 */
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
     //método construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    
    //métodos relacionados aos atributos
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //métodos personalizados
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        } else if ("CP".equals(tipo)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada porque ainda tem dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("A conta possui débito. Não pode ser fechada");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        
    }
    public void depositar(float v) {
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar. Conta fechada");
        }
        
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque.");
            }
        }else{
            System.out.println("Impossível sacar. Conta fechada");
        }
        
    }
    public void pagarMensal(){
        int v=0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
            
        } else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else{
            System.out.println("Impossível pagar. Conta fechada");
        }
    }
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
