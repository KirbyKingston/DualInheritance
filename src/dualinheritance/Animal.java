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
        System.out.println("the animal has been born");
    }
    
    default void die(){
        System.out.println("the animal has died");
    }
    
}
