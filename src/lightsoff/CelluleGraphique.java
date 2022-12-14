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
    ImageIcon img_vide;
    ImageIcon img_lumin;
    public int x;
    public int y;

    public CelluleGraphique(CelluleLumineuse uneCellule, int a, int b) {
        celluleAssociee = uneCellule;
        x = a;
        y = b;
        img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
        img_lumin = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    }

    @Override
    public void paintComponent(Graphics G) {
        if (celluleAssociee.etreAllumee() == true) {
            setIcon(img_lumin);

        } else {
            setIcon(img_vide);
        }

        super.paintComponent(G);
        setIcon(img_vide);

    }
}
