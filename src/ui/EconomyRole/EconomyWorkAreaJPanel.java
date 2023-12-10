/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EconomyRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EconomyOrganization;
import Business.Organization.Vaccine;
import Business.Organization.VaccineDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.approveVaccine;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class EconomyWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private EconomyOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    private VaccineDirectory directory;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public EconomyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EconomyOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        lblVal.setText(account.getEmployee().getName());
        populateTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApproved = new javax.swing.JButton();
        btnRejected = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkReq = new javax.swing.JTable();
        lblQuty = new javax.swing.JLabel();
        lblDose = new javax.swing.JLabel();
        lblgap = new javax.swing.JLabel();
        txtQuty = new javax.swing.JTextField();
        txtDosage = new javax.swing.JTextField();
        txtgap = new javax.swing.JTextField();
        lblPricing = new javax.swing.JLabel();
        txtPricing = new javax.swing.JTextField();
        separatorLine = new javax.swing.JSeparator();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();
        separatorLine3 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        lblTxt = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApproved.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnApproved.setText("Approve Vaccine");
        btnApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovedActionPerformed(evt);
            }
        });
        add(btnApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        btnRejected.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnRejected.setText("Reject Vaccine");
        btnRejected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectedActionPerformed(evt);
            }
        });
        add(btnRejected, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        tblWorkReq.setForeground(new java.awt.Color(36, 47, 65));
        tblWorkReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccine Name", "Sender", "Receiver", "Status"
            }
        ));
        tblWorkReq.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblWorkReq.setRowHeight(20);
        jScrollPane1.setViewportView(tblWorkReq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 520, 180));

        lblQuty.setBackground(new java.awt.Color(0, 0, 0));
        lblQuty.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQuty.setText("Quantity per dose(in mg):");
        add(lblQuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        lblDose.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblDose.setText("Number of doses:");
        add(lblDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        lblgap.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblgap.setText("Gap between dose(in days):");
        add(lblgap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        txtQuty.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtQuty.setForeground(new java.awt.Color(255, 255, 255));
        txtQuty.setBorder(null);
        txtQuty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQutyActionPerformed(evt);
            }
        });
        add(txtQuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 210, -1));

        txtDosage.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtDosage.setForeground(new java.awt.Color(255, 255, 255));
        txtDosage.setBorder(null);
        add(txtDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 220, 20));

        txtgap.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtgap.setForeground(new java.awt.Color(255, 255, 255));
        txtgap.setBorder(null);
        txtgap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgapActionPerformed(evt);
            }
        });
        add(txtgap, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 230, -1));

        lblPricing.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblPricing.setText("Price (in USD):");
        add(lblPricing, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        txtPricing.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtPricing.setForeground(new java.awt.Color(255, 255, 255));
        txtPricing.setBorder(null);
        add(txtPricing, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 200, -1));

        separatorLine.setForeground(new java.awt.Color(0, 0, 0));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 180, -1));

        separatorLine1.setForeground(new java.awt.Color(0, 0, 0));
        separatorLine1.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine1.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 180, -1));

        separatorLine2.setForeground(new java.awt.Color(0, 0, 0));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 180, -1));

        separatorLine3.setForeground(new java.awt.Color(0, 0, 0));
        separatorLine3.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine3.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 180, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/economywork.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 880, 850));

        lblTxt.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblTxt.setText("Currently Logged in as:");
        add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 30));

        lblVal.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblVal.setText("<value>");
        add(lblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblWorkReq.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
    private void btnApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovedActionPerformed
      // TODO add your handling code here:
        if(txtgap.getText().equals("") || txtDosage.getText().equals("") || txtPricing.getText().equals("") || txtQuty.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        int selectedRow = tblWorkReq.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        approveVaccine request = (approveVaccine)tblWorkReq.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved");
            return;
        }
     
        if(validate(txtQuty.getText(),txtDosage.getText(),txtgap.getText(),txtPricing.getText())){
        request.setStatus("Approved");
        request.getVaccine().setStatus("Approved");
        
        request.getVaccine().setMgQty(txtQuty.getText());
        request.getVaccine().setNoOfDoses(Integer.parseInt(txtDosage.getText()));
        request.getVaccine().setGap(Integer.parseInt(txtgap.getText()));
        request.getVaccine().setPrice(Double.parseDouble(txtPricing.getText()));
        populateTable();
        }
        dB4OUtil.storeSystem(system);
        txtgap.setText("");
        txtDosage.setText("");
        txtPricing.setText("");
        txtQuty.setText("");


    }//GEN-LAST:event_btnApprovedActionPerformed

    private void btnRejectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkReq.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        approveVaccine request = (approveVaccine)tblWorkReq.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Rejected") || request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already processed");
            return;
        }
     
        request.setStatus("Rejected");
        request.getVaccine().setStatus("Rejected");
        request.getVaccine().setMgQty(txtQuty.getText());
        request.getVaccine().setNoOfDoses(Integer.parseInt(txtDosage.getText()));
        request.getVaccine().setGap(Integer.parseInt(txtgap.getText()));
        populateTable();

    }//GEN-LAST:event_btnRejectedActionPerformed

    private void txtgapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgapActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(txtDosage.getText())==1){
            txtgap.setText("0");
            txtgap.setEditable(false);
        }
        
        
    }//GEN-LAST:event_txtgapActionPerformed

    private void txtQutyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQutyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQutyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproved;
    private javax.swing.JButton btnRejected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDose;
    private javax.swing.JLabel lblPricing;
    private javax.swing.JLabel lblQuty;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblVal;
    private javax.swing.JLabel lblgap;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JSeparator separatorLine3;
    private javax.swing.JTable tblWorkReq;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtPricing;
    private javax.swing.JTextField txtQuty;
    private javax.swing.JTextField txtgap;
    // End of variables declaration//GEN-END:variables

    private boolean validate(String qty, String noDose, String gap, String price) {
        if(qty.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter dosage quantity before approving");
            return false;
        }
        if(noDose.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter number of doses before approving");
            return false;
        }
        if(gap.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter gap between both doses before approving");
            return false;
        }
        if(price.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter vaccine price before approving");
            return false;
        }
        return true;
    }
}
