/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author dia12
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleAssociee;
    public CelluleGraphique (CelluleLumineuse uneCellule){
        celluleAssociee=uneCellule;
        ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide/.png"));
    }

    @Override
    public void paintComponent (Graphics G){
        setIcon(img_vide);
}
}
