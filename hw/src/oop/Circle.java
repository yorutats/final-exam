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
public class Circle {
    
    public double radius;
    public String color;

    public Circle(){
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toSring() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    public double getArea() {
        return this.radius*this.radius*3.141516;
     }
}
