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
public class LineSegment extends BasicShape implements Shape {
    private Point  endPosition;

    public LineSegment() {
    }

    public Point getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Point endPosition) {
        this.endPosition = endPosition;
    }

    // redraw shape on canvas
    @Override
    public void draw (java.awt.Graphics canvas){
        
    Color oldColor = canvas.getColor();    
    canvas.setColor(super.getFillColor());
    canvas.setColor(super.getColor());
    canvas.drawLine(this.getPosition().x,this.getPosition().y,this.endPosition.x,this.endPosition.y);
    canvas.setColor(oldColor);
}
}
