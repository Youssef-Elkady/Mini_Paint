/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7.lab_7;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.text.Position;
/**
 *
 * @author taver
 */
public class ViewingBoard extends javax.swing.JFrame implements Node, Cloneable {

    /**
     * Creates new form ViewingBoard
     */
    private Node parent;
    
    public ViewingBoard() {
        initComponents();
    }
        @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addLine = new javax.swing.JButton();
        itemListButton = new javax.swing.JComboBox<>();
        ColorizeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewingPanel1 = new lab7.lab_7.ViewingPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addLine.setText("Line Segment");
        addLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLineActionPerformed(evt);
            }
        });

        itemListButton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose shape" }));
        itemListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListButtonActionPerformed(evt);
            }
        });

        ColorizeButton.setText("Colorize");
        ColorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        circleButton.setText("Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        squareButton.setText("Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        rectangleButton.setText("Rectangle");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select shape");

        viewingPanel1.setBackground(new java.awt.Color(255, 255, 255));
        viewingPanel1.setForeground(new java.awt.Color(0, 0, 0));
        viewingPanel1.setToolTipText("");

        javax.swing.GroupLayout viewingPanel1Layout = new javax.swing.GroupLayout(viewingPanel1);
        viewingPanel1.setLayout(viewingPanel1Layout);
        viewingPanel1Layout.setHorizontalGroup(
            viewingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        viewingPanel1Layout.setVerticalGroup(
            viewingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(itemListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ColorizeButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton)))
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addLine)
                        .addGap(18, 18, 18)
                        .addComponent(circleButton)
                        .addGap(18, 18, 18)
                        .addComponent(squareButton)
                        .addGap(18, 18, 18)
                        .addComponent(rectangleButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewingPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemListButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorizeButton)
                            .addComponent(deleteButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addLine)
                            .addComponent(circleButton)
                            .addComponent(squareButton)
                            .addComponent(rectangleButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLineActionPerformed
        // TODO add your handling code here:
        LineSegment l = new LineSegment();
        AddLineForm lineForm = new AddLineForm(l);
        lineForm.setParentNode(this);
        lineForm.setVisible(true);
        this.setVisible(false);      
        viewingPanel1.addShape(l);
     //   System.out.println(viewingPanel1.shapes.get(0));     
        itemListButton.addItem("Line" + viewingPanel1.shapes.indexOf(l));
        viewingPanel1.repaint();
    }//GEN-LAST:event_addLineActionPerformed

    private void itemListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListButtonActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_itemListButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        // TODO add your handling code here:
        Rectangle r = new Rectangle();
        AddRectangleForm addRect = new AddRectangleForm(r);
        addRect.setParentNode(this);
        addRect.setVisible(true);
        this.setVisible(false);
        
        viewingPanel1.addShape(r);
        itemListButton.addItem("Rectangle" + viewingPanel1.shapes.indexOf(r));

      //  System.out.println(viewingPanel1.shapes.get(0));
        viewingPanel1.repaint();
    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        // TODO add your handling code here:
        Circle c = new Circle();
        AddCircleForm addCircle = new AddCircleForm(c);
        addCircle.setParentNode(this);
        addCircle.setVisible(true);
        this.setVisible(false);
        
        viewingPanel1.addShape(c);
        itemListButton.addItem("Circle" + viewingPanel1.shapes.indexOf(c));

      //  System.out.println(viewingPanel1.shapes.get(0));
        viewingPanel1.repaint();
        
    }//GEN-LAST:event_circleButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        // TODO add your handling code here:
         Square s = new Square();
        AddSquareForm addSquare = new AddSquareForm(s);
        addSquare.setParentNode(this);
        addSquare.setVisible(true);
        this.setVisible(false);
        
        viewingPanel1.addShape(s);
        itemListButton.addItem("Square" + viewingPanel1.shapes.indexOf(s));

      //  System.out.println(viewingPanel1.shapes.get(0));
        viewingPanel1.repaint();
    }//GEN-LAST:event_squareButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (itemListButton.getSelectedIndex() <=0){
            return;
        }
        int index = itemListButton.getSelectedIndex();
        viewingPanel1.removeShape(viewingPanel1.shapes.get(index-1));
        viewingPanel1.repaint();
        itemListButton.removeItemAt(itemListButton.getSelectedIndex());
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void ColorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeButtonActionPerformed
        // TODO add your handling code here:
              if (itemListButton.getSelectedIndex() <=0){
            return;
        }
        int index = itemListButton.getSelectedIndex();
        Color initial = Color.BLUE;
        Color color = JColorChooser.showDialog(null, "Select a color", initial);
        Color FillColor = JColorChooser.showDialog(null, "Select a filling color", initial);
        viewingPanel1.shapes.get(index-1).setColor(color);
        viewingPanel1.shapes.get(index-1).setFillColor(FillColor);
        viewingPanel1.repaint();
          
    }//GEN-LAST:event_ColorizeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewingBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewingBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewingBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewingBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewingBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorizeButton;
    private javax.swing.JButton addLine;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> itemListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JButton squareButton;
    private lab7.lab_7.ViewingPanel viewingPanel1;
    // End of variables declaration//GEN-END:variables
}