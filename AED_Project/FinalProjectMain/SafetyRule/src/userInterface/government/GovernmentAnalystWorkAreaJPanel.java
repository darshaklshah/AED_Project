/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.government;

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
public class GovernmentAnalystWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentAnalystWorkAreaJPanel
     */
    private JPanel container;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private HealthSystem system;
            
    public GovernmentAnalystWorkAreaJPanel(JPanel container,UserAccount userAccount,Organization organization,
            Enterprise enterprise,HealthSystem system) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        
        countryJLabel.setText(enterprise.getName());
        
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
        countryJLabel = new javax.swing.JLabel();
        viewReportJButton = new javax.swing.JButton();
        summaryJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Government Analyst Work Area");

        countryJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        countryJLabel.setText("<<Country>>");

        viewReportJButton.setText("View all Report");
        viewReportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportJButtonActionPerformed(evt);
            }
        });

        summaryJButton.setText("Summary");
        summaryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(countryJLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(summaryJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewReportJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(countryJLabel)
                .addGap(18, 18, 18)
                .addComponent(viewReportJButton)
                .addGap(18, 18, 18)
                .addComponent(summaryJButton)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewReportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportJButtonActionPerformed
        ViewReportJPanel vrjp = new ViewReportJPanel(container,organization,system);
        container.add("ViewReportJPanel", vrjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewReportJButtonActionPerformed

    private void summaryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryJButtonActionPerformed
        SummaryJPanel sjp = new SummaryJPanel(container,organization,system);
        container.add("SummaryJPanel", sjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_summaryJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel countryJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton summaryJButton;
    private javax.swing.JButton viewReportJButton;
    // End of variables declaration//GEN-END:variables
}
