/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.person.Person;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author darshak
 */
public class ConfigureASystem {
    public static HealthSystem configure(){
        
        HealthSystem system = HealthSystem.getInstance();
        
        Person architect = new Person("Darshak");
        architect.setEmail("shah.da@husky.neu.edu");
        architect.setPhone("8052147639");
        architect.setPosition("Architect");
        
        UserAccount userAccount = new UserAccount();
        userAccount.setPerson(architect);
        userAccount.setUsername("sysadmin");
        userAccount.setPassword("sysadmin");
        userAccount.setRole(new SystemAdminRole());
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        Network usa = system.createAndAddNetwork("USA");
        Network ma = usa.createNetwork("MA");
        Network boston = ma.createNetwork("Boston");
        
        return system;
    }
}
