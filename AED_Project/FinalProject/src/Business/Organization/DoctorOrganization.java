/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DoctorRole;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author darsh
 */
public class DoctorOrganization extends Organization {

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
