/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.lab_7;

import java.awt.Color;

/**
 *
 * @author taver
 */
public class Circle extends BasicShape implements Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    // redraw shape on canvas
    @Override
    public void draw (java.awt.Graphics canvas){
    Color oldColor = canvas.getColor();    
    canvas.setColor(super.getFillColor());
    canvas.fillOval(this.getPosition().x,this.getPosition().y,this.getRadius()*2,this.getRadius()*2);
    canvas.setColor(super.getColor());
    canvas.drawOval(this.getPosition().x,this.getPosition().y,this.getRadius()*2,this.getRadius()*2);
    canvas.setColor(oldColor);
}
}
    
