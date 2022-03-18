/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author a
 */
import javax.swing.*;
import java.awt.*;

public class Spot extends JButton{
private int i;
private int j;
private String color;
private Pieces p;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   public void setColor() {
        this.color = null;
    }
    public void setCordinate(int i ,int j) {
        this.i = i;
         this.j = j;
    }
      public int getI() {
        return i;
    }
       public int getJ() {
        return j;
    }
  
      
    public Pieces get_piece() {
        return p;
    }
    public void set_piece(Pieces p) {
        this.p = p;
    }
    
    public void set_piece() {
        this.p = null;
    }
}

