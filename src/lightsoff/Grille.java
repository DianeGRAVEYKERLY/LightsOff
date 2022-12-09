/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff;

/**
 *
 * @author alexia
 */
public class Grille { // on initialise notre grille de jeu
    CelluleLumineuse GrilleDeJeu[][] = new CelluleLumineuse [5][5];
    
    
    public Grille (){
        for (int i=0;i<5;i++){
            for(int j=0; j<5;j++){
               GrilleDeJeu[i][j] = new CelluleLumineuse(false);
            }
           
        }
        
    }
    
    
    public boolean EtreGagnant (){ //méthode pour savoir si le joueur a gagné 
        int compteur = 0;
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if ( GrilleDeJeu[i][j].etreEteinte() == true ){
                    compteur +=1;
                }
            }
        }
        
        if (compteur == 25){
            return true;
        }else{
            return false;
        }
    }
    
    public void clic_sur_case(int x, int y){ //on change l'état de la cellule cliqué et des 4 alentours   
        GrilleDeJeu[x][y].changerCellule();
        GrilleDeJeu[x+1][y].changerCellule();
        GrilleDeJeu[x-1][y].changerCellule();
        GrilleDeJeu[x][y+1].changerCellule();
        GrilleDeJeu[x][y-1].changerCellule();
        
        
        
    }
    
    public void AllumerCase (int x, int y){ 
        if (GrilleDeJeu[x][y].etreAllumee()==false ){
            GrilleDeJeu[x][y].changerCellule();
        }
        
    }
    
    public void EteindreCase (int x, int y){
         if (GrilleDeJeu[x][y].etreAllumee()==true ){
            GrilleDeJeu[x][y].changerCellule();
        }
        
        
    }
    
    public void CaseEteinte (int x, int y){
        GrilleDeJeu[x][y].etreEteinte();
        
    }
    
    public void CaseAllume (int x, int y){
        GrilleDeJeu[x][y].etreAllumee();
        
    }
    
    
    
    
}
