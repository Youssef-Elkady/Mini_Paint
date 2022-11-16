/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.lab_7;
import java.awt.*;
/**
 *
 * @author taver
 */
public class LineSegment implements Shape {
    private Point  Position, endPosition;
    private Color color,fillColor;

    public LineSegment() {
    }

    public Point getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Point endPosition) {
        this.endPosition = endPosition;
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
//    public void DrawLine(Graphics g){
//        DrawingFactory f = new DrawingFactory();
//     //   f.drawline(this, g);
//    }
    // redraw shape on canvas
    @Override
    public void draw (java.awt.Graphics canvas){
        
    Color oldColor = canvas.getColor();    
    canvas.setColor(this.fillColor);
    canvas.setColor(this.color);
    canvas.drawLine(this.getPosition().x,this.getPosition().y,this.endPosition.x,this.endPosition.y);
    canvas.setColor(oldColor);
}
}
