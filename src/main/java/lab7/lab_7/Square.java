/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.lab_7;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author taver
 */
public class Square implements Shape {
    
    private Point  Position;
    private int width;
    private Color color,fillColor;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
        // set position
    public void setPosition(java.awt.Point position){
       this.Position =position;  
    }
    public java.awt.Point getPosition(){
       return this.Position;      
    }
    // colorise
    public void setColor(java.awt.Color color){
        this.color = color;
    }
    public java.awt.Color getColor(){
        return this.color;
    }
    public void setFillColor (java.awt.Color color){
        this.fillColor = color;
    }
    public java.awt.Color getFillColor(){
        return fillColor;
        
    }
    // redraw shape on canvas
    @Override
    public void draw (java.awt.Graphics canvas){
    Color oldColor = canvas.getColor();    
    canvas.setColor(this.fillColor);
    canvas.fillRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getWidth());
    canvas.setColor(this.color);
    canvas.drawRect(this.getPosition().x,this.getPosition().y,this.width,this.getWidth());
    canvas.setColor(oldColor);
}
}
