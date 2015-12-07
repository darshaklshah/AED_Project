/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author darsh
 */
public class PersonOrganization extends Organization{

    public PersonOrganization() {
        super(null);
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
