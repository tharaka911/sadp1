/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nawwa
 */
public class C extends javax.swing.JFrame {
    
    public C() {
        initComponents();
    }

    public void initComponents() {
        b1 = new model2.Jbutton();
        b1.setText("nawwa");
    }

    
    
    
    public static void main(String[] args) {
        
        new C().setVisible(true);
        
    }
    
    
    model2.Jbutton b1;
    
}
