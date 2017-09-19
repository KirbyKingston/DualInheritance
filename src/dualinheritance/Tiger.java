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
public class Tiger implements Animal, Predator {

    @Override
    public void beBorn() {
        Animal.super.beBorn(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void die() {
        Animal.super.die(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eatPrey() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hunt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void determinePrrey() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
