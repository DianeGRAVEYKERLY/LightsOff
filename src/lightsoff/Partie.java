/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexia
 */
public class Partie {
    private Joueur joueurcourant;
    private Grille plateau;
    

    public void allumer_lumieres(int l, int c){
        Random nbr = new Random();
        int nb_case = nbr.nextInt(5);
        
        for (int i=0; i<5; i++ ){
            Random n=new Random();
            int ligne = n.nextInt(2);
            Random nb = new Random();
            
        }
        for (int k=0; k<nb_case; k++){
            plateau.AllumerCase(l,c);
        }   
    }
    
    public void lancer_partie(){
        
        while (plateau.EtreGagnant()==false){

            System.out.println("Choisissez la cellule à allumer" + '\n' + "Exprimer la coordonnée en Ligne puis Colonne");
            Scanner sc = new Scanner(System.in);
            int ligneCellule = sc.nextInt();
            int colCellule = sc.nextInt();
            plateau.clic_sur_case(ligneCellule, colCellule); 
            
        }   
    }
    
}
