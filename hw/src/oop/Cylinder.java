/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author s2000
 */
public class Cylinder extends Circle {
    
    private double height;

    public Cylinder(){
        this.height=1.0;
    }

    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
    }

    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toSring() {
        return "This is a Cylinder";
    }

    public double getVolume() {
        return getArea()*height;
    }
}
