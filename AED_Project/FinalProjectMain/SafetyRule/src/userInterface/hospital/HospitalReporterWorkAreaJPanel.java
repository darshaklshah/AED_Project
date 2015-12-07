/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.hospital;

import business.HealthSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author darshak
 */
public class HospitalReporterWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalReporterWorkAreaJPanel
     */
    private JPanel container;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private HealthSystem system;
    
    public HospitalReporterWorkAreaJPanel(JPanel container,UserAccount userAccount,
            Organization organization,Enterprise enterprise,HealthSystem system) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        
        enterpriseJLabel.setText(enterprise.getName());
        userJLabel.setText(userAccount.getUsername());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        newReportJButton = new javax.swing.JButton();
        trackReportJButton = new javax.swing.JButton();
        userJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enterpriseJLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Hospital Reporter");

        newReportJButton.setText("New Report");
        newReportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReportJButtonActionPerformed(evt);
            }
        });

        trackReportJButton.setText("Track your report");
        trackReportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackReportJButtonActionPerformed(evt);
            }
        });

        userJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userJLabel.setText("<<User Account>>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Hello,");

        enterpriseJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseJLabel.setText("<<Enterprise>>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(enterpriseJLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(trackReportJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newReportJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(userJLabel)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(enterpriseJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userJLabel))
                .addGap(18, 18, 18)
                .addComponent(newReportJButton)
                .addGap(18, 18, 18)
                .addComponent(trackReportJButton)
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newReportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReportJButtonActionPerformed
        // TODO add your handling code here:
        ReportStepOneJPanel rsojp = new ReportStepOneJPanel(container,userAccount,organization,enterprise,system);
        container.add("ReportStepOneJPanel", rsojp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_newReportJButtonActionPerformed

    private void trackReportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackReportJButtonActionPerformed
        // TODO add your handling code here:
        TrackReportJPanel trjp = new TrackReportJPanel(container,userAccount,organization);
        container.add("TrackReportJPanel", trjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_trackReportJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton newReportJButton;
    private javax.swing.JButton trackReportJButton;
    private javax.swing.JLabel userJLabel;
    // End of variables declaration//GEN-END:variables
}
