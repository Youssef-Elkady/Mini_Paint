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
public abstract class BasicShape {
    private Point  Position;   
    private Color color,fillColor;
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
}
