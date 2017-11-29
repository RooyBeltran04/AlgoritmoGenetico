/*
  Unidad de aprendizaje: Inteligencia Artificial.
  Alumnos: Beltran Alvarado Rogelio.
           Sandoval Hidalgo Juan Manuel.
  ********************************************************
 Celda del Cuadro Mágico.
 */
package clases;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Celda extends JButton{
   
    public Celda() {
        super();         
    
        this.setMinimumSize(new Dimension(1,1));
        //this.setBackground(new  java.awt.Color(192,192,192));//192
        this.setFont(new java.awt.Font("Tahoma",1,12));
        this.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                celdaActionPerformed(evt);
            }
        });
    }

   public void celdaActionPerformed(ActionEvent evt){
     
   }
}