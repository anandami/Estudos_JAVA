/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
    import javax.swing.JOptionPane;
/**
 *
 * @author ananda
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s = 0;
        int pares = 0;
        int impares = 0;
        int maisCem = 0;
        float media = 0f;
        int cont = 1;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número (0 interrompe"));
            JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
            s += n;
            
            //Calcula pares e ímpares
            if (n % 2 ==0 ){
                pares++;
            }else{
                impares++;
            }
            //Maiores que 100
            if (n >= 100){
                maisCem++;
            }
            //Contador para cálculo de média
            cont++;
        } while (n != 0);
        media = s/cont;
        JOptionPane.showMessageDialog(null, "<html>A soma dos valores digitados é " + s + "<\n>. Números pares: " + pares + "<\n>. Números ímpares: " + impares + "<\n>.Mais que cem: "+ maisCem + "<\n>.Média: " + media + ". </html>");
    }
    
}
