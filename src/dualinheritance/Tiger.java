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
    public static String REQUIRED_MSG = "This is a required field.";
    
    private String prey;

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        if(prey == null || prey.length() == 0) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.prey = prey;
    }
    
    @Override
    public void beBorn() {
        Animal.super.beBorn(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void die() {
        Animal.super.die(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eatPrey() {
        return  "The Tiger Ate The" + this.prey;
    }

    @Override
    public void hunt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
