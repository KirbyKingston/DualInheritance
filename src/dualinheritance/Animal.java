/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualinheritance;

/**
 *
 * @author Mitch
 */
public interface Animal {
    
    default void beBorn(){
        //This can't be the correct way of providing output from the methods but the only examples I can find show sout in the body.. Ask Jim in class. 
        System.out.println("the animal has been born");
    }
    
    default void die(){
        System.out.println("the animal has died");
    }
    
}
