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
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LutadoresClasse lutador[] = new LutadoresClasse[6];
        lutador[0] = new LutadoresClasse("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[1] = new LutadoresClasse("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new LutadoresClasse("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutador[3] = new LutadoresClasse("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutador[4] = new LutadoresClasse("UFOCobol", "Brasil", 37, 1.70f, 119.3f,5,4,3);
        lutador[5] = new LutadoresClasse("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12,2,4);
        
        LutaClasse UEC01 = new LutaClasse();
        UEC01.marcarLuta(lutador[0], lutador[1]);
        UEC01.lutar();
        
       
        lutador[0].status();
        lutador[1].status();
        lutador[2].status();
        lutador[3].status();
        lutador[4].status();
        lutador[5].status();
             
    }  
}
