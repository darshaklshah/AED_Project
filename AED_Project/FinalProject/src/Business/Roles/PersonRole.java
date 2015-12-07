/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PersonOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PersonOrganization.PersonWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author darsh
 */
public class PersonRole extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PersonWorkAreaJPanel(userProcessContainer, account,(PersonOrganization) organization, business); //To change body of generated methods, choose Tools | Templates.
    }
    
}
