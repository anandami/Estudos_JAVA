/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author ananda
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Teste de sintaxe
        int n1,n2,r;
        n1=4;
        n2=8;
        r = n1>n2?n1:n2;
        System.out.printf("O maior valor será %d \n", r);
        
        //Comparação de Strings
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        /*Como podemos observar, embora o conteúdo seja igual, a estrutura
         *é diferente, de forma que o resultado lógico será diferente.
         *Para testar o conteúdo somente, com objetos deve ser usado o método
         *.equals
         *Ex. res = (nome.equals(nome3))?"igual":"diferente";
         */
        
        //OPERADORES LÓGICOS
        int A, B, C;
        A = 4;
        B = 7;
        C = 12;
        boolean testeRelacional;
        testeRelacional = (A<B && B<C)?true:false;
        System.out.println(testeRelacional);
                
    }
    
}
