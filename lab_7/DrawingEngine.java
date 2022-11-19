/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab7.lab_7;

/**
 *
 * @author taver
 */
public interface DrawingEngine {
    // manage shape objects
    public void addShape(Shape shape);
    public void removeShape (Shape shape);
    // return all shapes drawn on canvas
    public Shape[] getShapes();
    // redraws all shapes on canvas
    public void refresh(java.awt.Graphics canvas);
    
}
