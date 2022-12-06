/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff;

/**
 *
 * @author alexia
 */
public class CelluleLumineuse {
    boolean allumee;
    public CelluleLumineuse(boolean a){
        a=allumee;
        
    }
    
    
    
    public boolean etreAllumee(){
        if (allumee==true){
            return (true);
            
        }else{
            return(false);
        }
        
    
    }
    public boolean etreEteinte(){
        if(allumee==false){
            return (true);
        }else{
            return(false);
            
        }
    }
    
    
        
            
        
   
    
    public void ChangerCellule(){
        if(allumee==true){
            allumee=false;
        }else{
            allumee=true;
        }
    }
}
