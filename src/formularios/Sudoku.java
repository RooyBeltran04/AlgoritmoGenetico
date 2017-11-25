/*
  Unidad de aprendizaje: Inteligencia Artificial.
  Alumnos: Beltran Alvarado Rogelio.
           Sandoval Hidalgo Juan Manuel.
  ********************************************************
  Formulario del Cuadro Mágico de la interface.
 */
package formularios;


import clases.Celda;
import java.util.Date;
import javax.swing.ImageIcon;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Sudoku extends javax.swing.JFrame {
    public static Celda celdas[][];
    private int dimension=9;
    private int generaciones;
    private final int maxGeneraciones=1000;
    
    
    /*Todo el funcionamiento se realiza mediante el actionPerformed
      del Botonc"Dibujar".
    */
    
    
    
    //Constructor
    public Sudoku() {
        initComponents();
        dibujarInicio(); //Método para darle las propiedades al formulario.  
    }
    
   private void dibujarInicio(){
        //Propiedades del Formulario
        this.setDefaultCloseOperation(3);
        this.setSize(605, 525);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IPN.png")).getImage());
        this.jPanel1.removeAll();
        this.setLocationRelativeTo(null);
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Generaciones = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        Dibujar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sudoku");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 110, 60, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Generaciones:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 150, 101, 30);

        Generaciones.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Generaciones.setToolTipText("Generaciones");
        Generaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneracionesActionPerformed(evt);
            }
        });
        getContentPane().add(Generaciones);
        Generaciones.setBounds(490, 150, 80, 30);

        Regresar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        Regresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegresarKeyTyped(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(470, 460, 110, 30);

        Dibujar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Dibujar.setText("Crear");
        Dibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujarActionPerformed(evt);
            }
        });
        getContentPane().add(Dibujar);
        Dibujar.setBounds(250, 150, 90, 30);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 190, 420, 250);

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.PNG"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeneracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneracionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneracionesActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
         Menu actual=new Menu();
         actual.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void DibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujarActionPerformed
       
       this.jPanel1.removeAll();
       //Capturamos dimension y Generaciones
       //Dimension=9;
       generaciones=Integer.parseInt(Generaciones.getText());
       
       //Validando el numero de generaciones
       if(generaciones>maxGeneraciones){
           JOptionPane.showMessageDialog(this,"Ingrese un número de generaciones menor a: "+maxGeneraciones,"Error Generaciones",ERROR_MESSAGE);
           return;
       }
       
       
       
       //Dibujamos el tablero en el JPanel1
       this.jPanel1.setLayout(new java.awt.GridLayout(dimension,dimension));
       celdas = new Celda[dimension][dimension]; //Matriz de celdas
           for(int i = 0; i < dimension; i++){
                for(int j = 0; j < dimension; j++){
                    celdas[i][j]=new Celda(i,j);
                    celdas[i][j].setTipo(3);
                    celdas[i][j].setVisible(true);
                    celdas[i][j].setText("H");
                    this.jPanel1.add(celdas[i][j]);
                }
            }
        
       
       
       this.paintAll(this.getGraphics());
    }//GEN-LAST:event_DibujarActionPerformed

    private void RegresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegresarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarKeyTyped

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
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dibujar;
    private javax.swing.JTextField Generaciones;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
