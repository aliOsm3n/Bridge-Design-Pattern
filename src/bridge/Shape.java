/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bridge;

/**
 *
 * @author Ali Othman
 */
public abstract class Shape {
    
    //Composition - implementor
    protected Color color;
    
//constructor with implementor as input argument
    public Shape(Color c) {
        this.color =  c;
    }
    
    abstract public void applyColor();
}
