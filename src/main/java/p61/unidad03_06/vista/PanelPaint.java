/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_06.vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author eceba
 */
public class PanelPaint extends JPanel {

    @Override
    public void paint(Graphics g) {
        // hasta de la bandera
        
        g.setColor(Color.black);
        g.fillRect(50, 40, 12, 325);
        
        // franja celeste
        Color c = new Color(174,214,241);
        g.setColor(c);
        //g.setColor(Color.cyan);
        g.fillRect(60, 45, 300, 60);
        
        // hasta blanca
        g.setColor(Color.WHITE);
        g.fillRect(60, 105, 300, 60);
        
        // hasta celeste
        Color d = new Color(174,214,241);
        g.setColor(d);
        //g.setColor(Color.cyan);
        g.fillRect(60, 165, 300, 60);
        
        // sol
        g.setColor(Color.YELLOW);
        g.fillOval(175, 115, 43, 43);
        
      
 /*
    @Override
    public void paint(Graphics g) {

        g.drawOval(280, 20, 40, 40);
        g.drawLine(200, 100, 400, 110);
        g.setColor(Color.red);
        g.drawLine(300, 60, 300, 300);

    */

    }
}

