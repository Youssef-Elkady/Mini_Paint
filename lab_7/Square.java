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
public class  Square extends BasicShape implements Shape {
    
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    // redraw shape on canvas
    @Override
    public void draw (java.awt.Graphics canvas){
    Color oldColor = canvas.getColor();    
    canvas.setColor(super.getFillColor());
    canvas.fillRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getWidth());
    canvas.setColor(super.getColor());
    canvas.drawRect(this.getPosition().x,this.getPosition().y,this.width,this.getWidth());
    canvas.setColor(oldColor);
}
}
