
import java.awt.GridLayout;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak859784
 */
public class VisuPersonnagesDlg extends java.awt.Dialog {

    /**
     * Creates new form VisuPersonnagesDlg
     */
    private Joueur j;  // attribut j qui sert a stocker le joueur qui est en train de jouer 
    
    public VisuPersonnagesDlg(java.awt.Frame parent, boolean modal,Joueur j) {
        super(parent, modal); // appel au cnst de la sous-classe 
        initComponents(); // appel a la methode initComponents qui contruit l'intérface qui a était faite
        this.j=j; // initilaiser j par le joueur passé en paramètre 
        initPanneau(); // appel a la methode initPanneau
        editJ.setText("Cartes du joueur : "+this.j.getPseudo()); // changer le JLabel (editJ) par cartes du joueur (qui est entrain de jouer)
        editS.setText("Score : "+j.getScore()); // // changer le JLabel (editS) par le score des  cartes du joueur (qui est entrain de jouer)
    }
    
    public void initPanneau(){
        LesPersonnages lp = j.getPaquet(); // recuperer le paquet du joueur 
        int n = lp.getTaille(); // recuperer la taille du paquet 
        int nc = (int)(Math.sqrt(n*2)); // intialisation du nombre de colonnes calculé
        int nl = (int)((n*2/nc)-1); // intialisation du nombre de lignes calculé
        trombinoscope.setLayout(new GridLayout(nl,nc)); // donner au trombinoscope un GridLayout de nl Lignes et nc Colonnes
        for(int i=0;i<n;i++){ // boucle qui se repete n fois 
            JButton bt = new JButton(); //Création d'un nouveau bouton
            trombinoscope.add(bt); // ajouter au trombinoscope la bouton crée 
            
            this.pack(); 
        }
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editJ = new javax.swing.JLabel();
        trombinoscope = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        editS = new javax.swing.JLabel();
        Afficher = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        editJ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(editJ)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(editJ)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout trombinoscopeLayout = new javax.swing.GroupLayout(trombinoscope);
        trombinoscope.setLayout(trombinoscopeLayout);
        trombinoscopeLayout.setHorizontalGroup(
            trombinoscopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        trombinoscopeLayout.setVerticalGroup(
            trombinoscopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        add(trombinoscope, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));
        jPanel3.add(editS);

        Afficher.setText("Afficher");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });
        jPanel3.add(Afficher);

        add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false); // rend la boite de dialogue invisible 
        dispose(); // // récuperer l'espace mémoire
    }//GEN-LAST:event_closeDialog

    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        // TODO add your handling code here:
        LesPersonnages lp = j.getPaquet();  // recuperer le paquet du joueur 
        int n = lp.getTaille();   // recuperer la taille du paquet
        for(int i=0;i<n;i++){  // boucle qui se repete n fois 
            JButton bt = (JButton) trombinoscope.getComponent(i); // recuperation de l'i-ème bouton du trombinoscope
            lp.getPerso(i).setImgBouton(bt); // modification de l'icon du bouton bt par la photo du personnage d'indice i
        } 
    }//GEN-LAST:event_AfficherActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afficher;
    private javax.swing.JLabel editJ;
    private javax.swing.JLabel editS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel trombinoscope;
    // End of variables declaration//GEN-END:variables
}
