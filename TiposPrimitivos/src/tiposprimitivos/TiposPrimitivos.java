/* Comentário com múltiplas linhas com asteriscos - convenção
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 * Isso é um comentário para documentação
 * @author ananda
 */
public class TiposPrimitivos {

    /**
     * Documentação
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here -- Comentário com uma linha só
        //TREINO PARA SAÍDA DE DADOS - FORMAS
        float nota1 = (float)8.5;
        System.out.println("A nota é " + nota1);//!!sout+tab resulta nesse comando
        float nota2 = 9f;
        //outra forma de fazer a mesma tarefa de concatenação
        System.out.printf("A nota é %.1f \n", nota2); 
        /**sintaxe parecida com python
         * Neste caso, o número entre % e f é a quantidade de casas decimais
         * para pular a linha uso o \n
         */
        String nome = "Gustavo";
        System.out.printf("A nota de %s é %.2f \n", nome, nota2);
        //s porque é a string e f porque é o float
        
        //com o mesmo resultado é possível utilizar o System.out.format("")
        
        System.out.format("A nota de %s é %.3f \n", nome, nota1);
        
        /**
         * Algumas bibliotecas vêm por padrão no Java, outras não, 
         * uma das que não vem é a que permite a entrada de dados, por meio
         * do comando System.in (contrário de System.out)
         * 
         * para tanto:
         * import java.util.Scanner;
         * Scanner teclado - new Scanner(System.in); 
         */
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String entrada = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota3 = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f", entrada, nota3);
        
        /**
         * Assim, para string uso nextLine();
         * para inteiro uso nextInt();
         * para float, nextFloat();
         * para short, nextShort
         * etc.
         * 
         * Se eu quiser mudar o tipo de uma variável:
         * 
         * int idade = 30;
         * String valor = Integer.toString(idade) --> ou seja, é um inteiro
         * sendo transformado em string
         * 
         * se for o inverso:
         * String valor = "30";
         * int idade = Integer.parseInt(valor);
         * System.out.print();
         * 
         * ouuu....
         * 
         * String valor = "30";
         * float idade = Float.parseFloat(valor);
         * System.out.printf("%.3f", idade);
         */
        
        
        
    }
    
}
