/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author ananda
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A media é igual a " + m);
        
        /**OPERADORES UNÁRIOS
         * ++ incremento, mesmo que a = a+1 é a++; cada um pode ser pré ou pós
         * -- decremento, mesmo que a = a-1 é a--; cada um pode ser pré ou pós
         * 
         */
        
        int numero = 10;
        int valor = 4 + numero--; //exemplo de pós decremento
        System.out.println("A Variável Valor vale " + valor);
        System.out.println("A Variável Numero vale " + numero);
        
        /**OPERADORES DE ATRIBUIÇÃO
         * somar e atribuir ==> a+=b == a = a+b
         * subtrair e atribuir ==> a-=b == a = a-b
         * multiplicar e atribuir ==> a*=b == a = a*b
         * dividir e atribuir ==> a/=b == a = a/b
         * resto e atribuir ==> a%=b == a = a%b
         */
        
        int teste = 5;
        teste *= valor; //teste = teste * valor
        System.out.println("A variavel teste vale " + teste);
        System.out.println("A variavel valor, no segundo processamento é " + valor);
        
        /*Uso da classe Math
         * pi = Math.PI --> 3,1415...
         * pow = Math.pow --> exponenciação
         * sqrt = Math.sqrt; --> raiz quadrada
         * cbrt = Math.cbrt; --> raiz cúbica
         * abs = Math.abs; --> valor absoluto
         * floor = Math.floor --> arredonda para baixo
         * ceil = Math.ceil --> arredonda para cima
         * round = Math.round --> arredondamento aritmetico
         * 
         * Randômico --> cria valores aleatorios entre 0 e 1
         * double ale = Math.random();
         * Para trocar o valor do numero aleatorio gerado:
         * Ex: Quero um número aleatorio de 5 a 10
         * 5 + Math.ramdom() * (10-5)
         */
        
        float raiz = (float) Math.sqrt(25);
        System.out.println(raiz);
        float cubica = (float) Math.cbrt(27);
        System.out.println(cubica);
        int raio = 5;
        float areaCirc = (float) Math.PI * raio;
        float circunf = (float) (Math.PI * Math.pow(raio,2));
        System.out.println(areaCirc);
        System.out.println(circunf);
        int arredAbs = (int)Math.abs(areaCirc);
        int arredBaixo = (int)Math.floor(areaCirc);
        int arredCima = (int)Math.ceil(areaCirc);
        int arredRound = (int)Math.round(areaCirc);
        System.out.println("Valores arredondados");
        System.out.println("Absoluto " + arredAbs);
        System.out.println("Para baixo " + arredBaixo);
        System.out.println("Para cima " + arredCima);
        System.out.println("Arred. Aritmetico: " + arredRound);
        
               
    }
    
}
