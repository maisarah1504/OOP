/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopproject;

import javax.swing.JOptionPane;


public class GUILoanSystem extends javax.swing.JFrame {
    private static final int MAX_APPLICANTS = 1000; // Maximum number of applicants
    private Applicant[] applicants;
    private int applicantCount;
    private static String enteredID; 
    
    public GUILoanSystem() {
        initComponents();
        LoanSystemApp main = new LoanSystemApp();
    }

    private Applicant findApplicantById(String id) {
        for (int i = 0; i < applicantCount; i++) {
            if (applicants[i].getId().equals(id)) {
                return applicants[i];
            }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnAddLoan = new javax.swing.JButton();
        btnViewStatus = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setText("LOAN MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Welcome!");

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnAddLoan.setText("Add Loan");
        btnAddLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLoanActionPerformed(evt);
            }
        });

        btnViewStatus.setText("View Applicant Status");
        btnViewStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStatusActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddLoan)
                            .addComponent(btnSignUp)
                            .addComponent(jLabel2))
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnViewStatus)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(285, 285, 285))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(btnSignUp)
                .addGap(41, 41, 41)
                .addComponent(btnAddLoan)
                .addGap(42, 42, 42)
                .addComponent(btnViewStatus)
                .addGap(34, 34, 34)
                .addComponent(btnExit)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        //user enter id
//        String enteredID = JOptionPane.showInputDialog("Enter ID: ");
//        if (enteredID == null || enteredID.trim().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "ID cannot be empty or null.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        GUISignUp signUpWindow = new GUISignUp(); 
        signUpWindow.setVisible(true); // Make the SignUp window visible

        // Optionally, close the current window if needed
        dispose(); 
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnAddLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLoanActionPerformed
        // TODO add your handling code here:
        //open JFrame 2(MenuInterface
        //user enter id
        enteredID = JOptionPane.showInputDialog("Enter ID: ");
        /*LoanApplication loanApp = LoanApplication.getInstance();
        Applicant applicant = loanApp.searchApplicantById(enteredID);
        
        if (applicant != null ) { */
                //applicant found
                GUIAddLoan jf1 = new GUIAddLoan (enteredID);
                jf1.show();  //display MenuInterface here
        
                dispose(); // close current frame(LoginInterface) after open MenuInterface
        /*}
        else {
            JOptionPane.showMessageDialog(this, "Applicant ID not found. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        } */  
    }//GEN-LAST:event_btnAddLoanActionPerformed

    private void btnViewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStatusActionPerformed
        // TODO add your handling code here:
        //open JFrame 2(MenuInterface
        String enteredID = JOptionPane.showInputDialog("Enter ID: ");
        GUIViewApplicantStatus jf2 = new GUIViewApplicantStatus (enteredID);
        jf2.show();  //display MenuInterface here
        
        dispose(); // close current frame(LoginInterface) after open MenuInterface
    }//GEN-LAST:event_btnViewStatusActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Thank you for using this system!");
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILoanSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLoan;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnViewStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
