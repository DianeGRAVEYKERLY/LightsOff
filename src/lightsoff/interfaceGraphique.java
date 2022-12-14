package lightsoff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dia12
 */
public class interfaceGraphique extends javax.swing.JFrame {

    /**
     * Creates new form interfaceGraphique
     */
    Grille plateauDeJeu= new Grille();
    public interfaceGraphique() {
        initComponents();
        for(int i=4;i>=0;i--){
            for(int j=0;j<5;j++){
                CelluleGraphique cellGraph= new CelluleGraphique(plateauDeJeu.GrilleDeJeu[i][j],i ,j);
                panneau_grille.add(cellGraph);
                
                cellGraph.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("vous avez cliqué sur la cellule "+ cellGraph.x + "," + cellGraph.y);
//plateauDeJeu.AllumerCase(cellGraph.x, cellGraph.y);
plateauDeJeu.clic_sur_case(cellGraph.x, cellGraph.y);
                    }
                });
                
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        lancer_partie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panneau_grille.setBackground(new java.awt.Color(153, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));

        lancer_partie.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        lancer_partie.setForeground(new java.awt.Color(0, 0, 153));
        lancer_partie.setText("Démarrer Partie");
        lancer_partie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancer_partieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneau_grille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(lancer_partie)
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panneau_grille, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lancer_partie, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lancer_partieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancer_partieActionPerformed
    lancer_partie();
    // TODO add your handling code here:
    }//GEN-LAST:event_lancer_partieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceGraphique().setVisible(true);
            }
            
        });
        
           
            
        
        
    }
         public void lancer_partie(){ //tant qu'il y a des lumières allumées on demande au joueur de choisir une ligne et colonne de la cellule qu'il veut changer d'etat
        
       for (int i=0; i<5;i++){ //on éteint toutes les case avant de démarrer une partie
           for (int j=0; j<5; j++){
               plateauDeJeu.EteindreCase(i, j);
           }
       }
             
             allumer_lumieres();
        
        
        
        
        
      //  while (plateau.EtreGagnant()==false){

         //   System.out.println("Choisissez la cellule à éteindre" + '\n' + "Exprimer la coordonnée en Ligne puis Colonne");
          //  Scanner sc = new Scanner(System.in); 
        //    int ligneCellule = sc.nextInt();
          //  int colCellule = sc.nextInt();
          //  plateau.clic_sur_case(ligneCellule, colCellule); 
            
      //  }   
    }
    
    
public void allumer_lumieres(){ //on allume quelques cases aléatoires 
        Random nbr = new Random();
        int nb_case = nbr.nextInt(7);
        
        
        for (int i=0; i<nb_case; i++ ){
            
            Random n=new Random();
            int ligne = n.nextInt(5);
            Random nb = new Random();
            int colonne = nb.nextInt(6);
            plateauDeJeu.AllumerCase(ligne,colonne);

        }   
    }
public boolean EtreGagnant (){ //méthode pour savoir si le joueur a gagné 
        int compteur = 0;
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if ( plateauDeJeu.GrilleDeJeu[i][j].etreEteinte() == true ){
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton lancer_partie;
    private javax.swing.JPanel panneau_grille;
    // End of variables declaration//GEN-END:variables
}
