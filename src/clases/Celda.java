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
   private boolean visible;   //Variable para saber si esta 
    private final int x;
    private final int y;    
    private int tipo;    /* Tipos de celda                        
                                0 significa que hay obstaculo.
                                1 significa que hay mineral.
                                2 significa que es la nave.
                                3 significa que es una celda disponible para moverse. */
    public Celda(int x, int y) {
        super();
        this.x = x;
        this.y = y;
                             
        
        this.setMinimumSize(new Dimension(1,1));
        this.setBackground(new  java.awt.Color(192,192,192));//192
        this.setFont(new java.awt.Font("Tahoma",1,12));
        this.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                celdaActionPerformed(evt);
            }
        });
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
   public void celdaActionPerformed(ActionEvent evt){
        System.out.println(tipo);
   }
}