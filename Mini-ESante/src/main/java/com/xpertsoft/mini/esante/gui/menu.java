package com.xpertsoft.mini.esante.gui;

import com.xpertsoft.mini.esante.Metier.MetierImplimentationTiers;
import com.xpertsoft.mini.esante.Model.PrescriptionDetail;
import com.xpertsoft.mini.esante.Model.Prescriptionentet;


import com.xpertsoft.mini.esante.RMI.NetworkingRMI;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Soufiane
 */
public class menu extends javax.swing.JFrame  {
private String name;
private String pass;
    /**
     * Creates new form menu
     */
   NetworkingRMI Net;

    public menu() {

        initComponents();
        // fenetre en maximeum
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
       
        displayTiers();
        displayPrescription();
    }
    public void SetIPDestant(String IP){
    this.jTextFieldIPDeestant.setText(IP);
    }
    private void displayTiers() {
         MetierImplimentationTiers impTiers=new MetierImplimentationTiers();
    this.TableTiers.setModel(new AbstractTableModelTiers(impTiers.getALLTiers()));
    }
    
     private void displayPrescription() {
         MetierImplimentationTiers impTiers=new MetierImplimentationTiers();
         List<Prescriptionentet> pres=impTiers.getAllPrescription();
         
         this.jTablePRescription.setModel(new AbstractTableModelPrescription(pres));
         if(pres.size()>0) {
                this.jTablePRescription.setRowSelectionInterval(0, 0);
                displayPrescriptionDetail(Integer.parseInt(this.jTablePRescription.
                 getValueAt(0, 0).toString()));
         }
    }
    
        private void displayPrescriptionDetail(int IDprescription) {
            MetierImplimentationTiers impTiers=new MetierImplimentationTiers();
            this.jTablePrescriptionDetail.setModel(new AbstractTableModelPrescriptionDetail(
                    impTiers.getDetailPrescription(IDprescription)));
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        clients = new javax.swing.JPanel();
        jScrollPaneTableClient = new javax.swing.JScrollPane();
        TableTiers = new javax.swing.JTable();
        jButtonAjouterTiers = new javax.swing.JButton();
        jButtonSupprimerTiers = new javax.swing.JButton();
        jButtonModifierTiers = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PannelPerspection = new javax.swing.JPanel();
        jScrollPaneTableProduit = new javax.swing.JScrollPane();
        jTablePRescription = new javax.swing.JTable();
        jButtonAjouterPrescription = new javax.swing.JButton();
        jButtonSupprimerPrescription = new javax.swing.JButton();
        jScrollPaneTableProduit1 = new javax.swing.JScrollPane();
        jTablePrescriptionDetail = new javax.swing.JTable();
        jButtonEnvoiyerPrescription = new javax.swing.JButton();
        jButtonModifierPrescription = new javax.swing.JButton();
        jButtonConnectClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIPDeestant = new javax.swing.JTextField();
        jButtonSolliciter = new javax.swing.JButton();
        jTextFieldIPAdress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonConnectAnnuaire = new javax.swing.JButton();
        jButtonDeconnectAnnuair = new javax.swing.JButton();
        jButtonRecever = new javax.swing.JButton();
        jButtonEndRecive = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");
        setName("menu"); // NOI18N
        setResizable(false);

        jTabbedPane.setName("produits"); // NOI18N

        clients.setName("client"); // NOI18N

        TableTiers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneTableClient.setViewportView(TableTiers);

        jButtonAjouterTiers.setText("Ajouter Tiers");
        jButtonAjouterTiers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterTiersActionPerformed(evt);
            }
        });

        jButtonSupprimerTiers.setText("Sepprimer Tiers");
        jButtonSupprimerTiers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerTiersActionPerformed(evt);
            }
        });

        jButtonModifierTiers.setText("modifier Tiers");
        jButtonModifierTiers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierTiersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientsLayout = new javax.swing.GroupLayout(clients);
        clients.setLayout(clientsLayout);
        clientsLayout.setHorizontalGroup(
            clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTableClient, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addGroup(clientsLayout.createSequentialGroup()
                        .addComponent(jButtonAjouterTiers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSupprimerTiers)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModifierTiers)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        clientsLayout.setVerticalGroup(
            clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSupprimerTiers)
                        .addComponent(jButtonAjouterTiers)
                        .addComponent(jButtonModifierTiers)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTableClient, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Tiers", clients);

        PannelPerspection.setName("produits"); // NOI18N

        jTablePRescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePRescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePRescriptionMouseClicked(evt);
            }
        });
        jScrollPaneTableProduit.setViewportView(jTablePRescription);

        jButtonAjouterPrescription.setText("Ajouter Prescriptionit");
        jButtonAjouterPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterPrescriptionActionPerformed(evt);
            }
        });

        jButtonSupprimerPrescription.setText("Supprimer Prescription");
        jButtonSupprimerPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerPrescriptionActionPerformed(evt);
            }
        });

        jTablePrescriptionDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneTableProduit1.setViewportView(jTablePrescriptionDetail);

        jButtonEnvoiyerPrescription.setText("Envoiyer Prescription");
        jButtonEnvoiyerPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnvoiyerPrescriptionActionPerformed(evt);
            }
        });

        jButtonModifierPrescription.setText("Modifierr Prescriptionit");
        jButtonModifierPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierPrescriptionActionPerformed(evt);
            }
        });

        jButtonConnectClient.setText("Connecter a  un client destant");
        jButtonConnectClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectClientActionPerformed(evt);
            }
        });

        jLabel2.setText("Adress Destant :");

        jTextFieldIPDeestant.setEnabled(false);

        jButtonSolliciter.setText("solliciter un  médecin");
        jButtonSolliciter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolliciterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PannelPerspectionLayout = new javax.swing.GroupLayout(PannelPerspection);
        PannelPerspection.setLayout(PannelPerspectionLayout);
        PannelPerspectionLayout.setHorizontalGroup(
            PannelPerspectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelPerspectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PannelPerspectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTableProduit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTableProduit)
                    .addGroup(PannelPerspectionLayout.createSequentialGroup()
                        .addGroup(PannelPerspectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PannelPerspectionLayout.createSequentialGroup()
                                .addComponent(jButtonConnectClient)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIPDeestant, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSolliciter))
                            .addGroup(PannelPerspectionLayout.createSequentialGroup()
                                .addComponent(jButtonAjouterPrescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonModifierPrescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSupprimerPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEnvoiyerPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PannelPerspectionLayout.setVerticalGroup(
            PannelPerspectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelPerspectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PannelPerspectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConnectClient)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIPDeestant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSolliciter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PannelPerspectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjouterPrescription)
                    .addComponent(jButtonSupprimerPrescription)
                    .addComponent(jButtonModifierPrescription)
                    .addComponent(jButtonEnvoiyerPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTableProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneTableProduit1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Prescription", PannelPerspection);

        jTextFieldIPAdress.setText("192.168.8.101");

        jLabel1.setText("Adresse Annuaire");

        jButtonConnectAnnuaire.setText("Connection a l'annuaire");
        jButtonConnectAnnuaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectAnnuaireActionPerformed(evt);
            }
        });

        jButtonDeconnectAnnuair.setText("Déconnection");
        jButtonDeconnectAnnuair.setEnabled(false);
        jButtonDeconnectAnnuair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnectAnnuairActionPerformed(evt);
            }
        });

        jButtonRecever.setText("Recever");
        jButtonRecever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceverActionPerformed(evt);
            }
        });

        jButtonEndRecive.setText("Fin Reception");
        jButtonEndRecive.setEnabled(false);
        jButtonEndRecive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndReciveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConnectAnnuaire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeconnectAnnuair)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRecever)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEndRecive)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConnectAnnuaire)
                    .addComponent(jButtonDeconnectAnnuair)
                    .addComponent(jButtonRecever)
                    .addComponent(jButtonEndRecive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSupprimerPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerPrescriptionActionPerformed
           MetierImplimentationTiers m =new MetierImplimentationTiers();
        AbstractTableModelPrescription model=(AbstractTableModelPrescription)jTablePRescription.getModel();
        model.removePrescription(jTablePRescription.getSelectedRow());
        displayPrescription();
    }//GEN-LAST:event_jButtonSupprimerPrescriptionActionPerformed

    private void jButtonEnvoiyerPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnvoiyerPrescriptionActionPerformed
       if (Net==null) Net=new NetworkingRMI(this);
       Net.IPServiceDestant=jTextFieldIPDeestant.getText();
        int ID=(int) jTablePRescription.getValueAt(jTablePRescription.getSelectedRow(),0);
        MetierImplimentationTiers m = new MetierImplimentationTiers();
        Prescriptionentet p=m.GetPrescriptionentetByID(ID);
        List<PrescriptionDetail> detail=m.getDetailPrescription(p.getCodePrescription());
        Net.SendPrescription(p,detail);
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnvoiyerPrescriptionActionPerformed

    private void jButtonAjouterTiersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterTiersActionPerformed
        FicheTiers FP = new FicheTiers(this, true,"Ajouter",null);
        FP.setVisible(true);
        displayTiers();
      
    }//GEN-LAST:event_jButtonAjouterTiersActionPerformed

    private void jButtonSupprimerTiersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerTiersActionPerformed
        MetierImplimentationTiers m =new MetierImplimentationTiers();
        AbstractTableModelTiers model=(AbstractTableModelTiers)TableTiers.getModel();
        int row=TableTiers.getSelectedRow();
        if(row<0) return;
        model.removeTiers(row);
        displayTiers();
        displayPrescription();
    }//GEN-LAST:event_jButtonSupprimerTiersActionPerformed

    private void jButtonConnectAnnuaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectAnnuaireActionPerformed
if (Net==null) Net=new NetworkingRMI(this);
Net.IPAnnuaire=jTextFieldIPAdress.getText();
LoginForm lf=new LoginForm(this,true);
lf.setVisible(true);
if(lf.connct){
if(Net.Connect(lf.name, lf.Passs)){
    this.name=lf.name;
    this.pass=lf.Passs;
    this.jButtonConnectAnnuaire.setEnabled(false);
    this.jButtonDeconnectAnnuair.setEnabled(true);
    JOptionPane.showMessageDialog(this, "Connexion avec succès");
    }else{
         JOptionPane.showMessageDialog(this, "connection a l'annuaire echoué");

        }
}


// TODO add your handling code here:
    }//GEN-LAST:event_jButtonConnectAnnuaireActionPerformed

    private void jButtonModifierTiersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierTiersActionPerformed
        FicheTiers FP = new FicheTiers(this, true,"Modifier",(String) TableTiers.getValueAt(TableTiers.getSelectedRow(), 0));
        FP.setVisible(true);
        displayTiers();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModifierTiersActionPerformed

    private void jButtonAjouterPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterPrescriptionActionPerformed
        FichePrescription FP = new FichePrescription(this, true,"Ajouter",new Prescriptionentet(),null);
        FP.setVisible(true); 
        this.displayPrescription();  
        

    }//GEN-LAST:event_jButtonAjouterPrescriptionActionPerformed

    private void jButtonModifierPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierPrescriptionActionPerformed
        MetierImplimentationTiers m = new MetierImplimentationTiers();
        Prescriptionentet p =m.GetPrescriptionentetByID((int)jTablePRescription.getValueAt(jTablePRescription.getSelectedRow(), 0));
        
        FichePrescription FP = new FichePrescription(this, true,"Modifier",p,null);
        FP.setVisible(true); 
        this.displayPrescription();  
    }//GEN-LAST:event_jButtonModifierPrescriptionActionPerformed

    private void jTablePRescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePRescriptionMouseClicked
int row=jTablePRescription.getSelectedRow();
if (row>=0){
    int value=(int)jTablePRescription.getValueAt(row, 0);
this.displayPrescriptionDetail(value);
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePRescriptionMouseClicked

    private void jButtonConnectClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectClientActionPerformed
if (Net==null) Net=new NetworkingRMI(this);
        Net.IPAnnuaire=jTextFieldIPAdress.getText();
GetIPForm IF=new GetIPForm(this,true);
IF.setVisible(true);
if(IF.connect){
if(IF.choix==1){
    jTextFieldIPDeestant.setText(Net.GetIPUser(IF.Psudo));

}else{
jTextFieldIPDeestant.setText(IF.IP);
}
} 
    }//GEN-LAST:event_jButtonConnectClientActionPerformed

    private void jButtonDeconnectAnnuairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnectAnnuairActionPerformed
if (Net==null) Net=new NetworkingRMI(this);
Net.IPAnnuaire=jTextFieldIPAdress.getText();
if(Net.Deconnect(this.name,this.pass)){
    this.jButtonConnectAnnuaire.setEnabled(true);
    this.jButtonDeconnectAnnuair.setEnabled(false);
}else{
         JOptionPane.showMessageDialog(this, "déconnection a l'annuaire echoué");

        }

    
   
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeconnectAnnuairActionPerformed

    private void jButtonReceverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceverActionPerformed
if (Net==null) Net=new NetworkingRMI(this);
Net.Recive();
jButtonRecever.setEnabled(false);
jButtonEndRecive.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonReceverActionPerformed

    private void jButtonEndReciveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEndReciveActionPerformed
Net.EndRecive();
jButtonRecever.setEnabled(true);
jButtonEndRecive.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEndReciveActionPerformed

    private void jButtonSolliciterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolliciterActionPerformed
   
        if (Net==null) Net=new NetworkingRMI(this);
        Net.IPServiceDestant=jTextFieldIPDeestant.getText();
        SollicitationForm SF=new SollicitationForm(this,true);
        SF.setVisible(true);
        if(SF.OK){
        Net.SendSollicitation(name);
        }
    }//GEN-LAST:event_jButtonSolliciterActionPerformed
    public static void main(String[] args) {
         // TODO code application logic here
         menu menu = new menu();
   
        menu.setVisible(true);
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PannelPerspection;
    private javax.swing.JTable TableTiers;
    private javax.swing.JPanel clients;
    public javax.swing.JButton jButtonAjouterPrescription;
    public javax.swing.JButton jButtonAjouterTiers;
    public javax.swing.JButton jButtonConnectAnnuaire;
    private javax.swing.JButton jButtonConnectClient;
    private javax.swing.JButton jButtonDeconnectAnnuair;
    private javax.swing.JButton jButtonEndRecive;
    public javax.swing.JButton jButtonEnvoiyerPrescription;
    public javax.swing.JButton jButtonModifierPrescription;
    public javax.swing.JButton jButtonModifierTiers;
    private javax.swing.JButton jButtonRecever;
    private javax.swing.JButton jButtonSolliciter;
    public javax.swing.JButton jButtonSupprimerPrescription;
    public javax.swing.JButton jButtonSupprimerTiers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPaneTableClient;
    private javax.swing.JScrollPane jScrollPaneTableProduit;
    private javax.swing.JScrollPane jScrollPaneTableProduit1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTablePRescription;
    private javax.swing.JTable jTablePrescriptionDetail;
    private javax.swing.JTextField jTextFieldIPAdress;
    private javax.swing.JTextField jTextFieldIPDeestant;
    // End of variables declaration//GEN-END:variables

}
