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
    

    public void allumer_lumieres(){ //on allume quelques cases aléatoires 
        Random nbr = new Random();
        int nb_case = nbr.nextInt(7);
        
        
        for (int i=0; i<nb_case; i++ ){
            
            Random n=new Random();
            int ligne = n.nextInt(4);
            Random nb = new Random();
            int colonne = nb.nextInt(4);
            plateau.AllumerCase(ligne,colonne);

        }   
    }
    
    public void lancer_partie(){ //tant qu'il y a des lumières allumées on demande au joueur de choisir une ligne et colonne de la cellule qu'il veut changer d'etat
        
        allumer_lumieres();
        
        while (plateau.EtreGagnant()==false){

            System.out.println("Choisissez la cellule à éteindre" + '\n' + "Exprimer la coordonnée en Ligne puis Colonne");
            Scanner sc = new Scanner(System.in); 
            int ligneCellule = sc.nextInt();
            int colCellule = sc.nextInt();
            plateau.clic_sur_case(ligneCellule, colCellule); 
            
        }   
    }
    
}
