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
                if ( GrilleDeJeu[i][j].etreEteinte() ==true ){
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
    
    public void clic_sur_case(int x, int y){
        
        
    }
    
    public void AllumerCase (int x, int y){ 
        if (GrilledeJeu[x][y].etreAllumee()==false ){
            GrilledeJeu[x][y].changerCellule();
        }
        
    }
    
    public void EteindreCase (int x, int y){
         if (GrilledeJeu[x][y].etreAllumee()==true ){
            GrilledeJeu[x][y].changerCellule();
        }
        
        
    }
    
    public void CaseEteinte (int X, int y){
        
    }
    
    public void CaseAllume (int x, int y){
        
    }
    
    
    
    
}
