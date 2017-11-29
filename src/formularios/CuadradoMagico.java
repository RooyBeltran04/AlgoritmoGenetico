/*
  Unidad de aprendizaje: Inteligencia Artificial.
  Alumnos: Beltran Alvarado Rogelio.
           Sandoval Hidalgo Juan Manuel.
  ********************************************************
  Formulario del Cuadro Mágico de la interface.
 */
package formularios;


import clases.Celda;
import clases.Cromosoma;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class CuadradoMagico extends javax.swing.JFrame {
    public static Celda celdas[][];
    private int dimension;
    private int generaciones;
    private int mejorfitness;
    private int mejorcromosoma[][];
    
    
    /*Todo el funcionamiento se realiza mediante el actionPerformed
      del Botonc"Dibujar".
    */
    
    
    
    //Constructor
    public CuadradoMagico() {
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
        jfitness1 = new javax.swing.JLabel();
        jfitness = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Dimension = new javax.swing.JSpinner();
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
        jLabel1.setText("Cuadrado Mágico");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 110, 130, 30);

        jfitness1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jfitness1.setForeground(new java.awt.Color(255, 255, 255));
        jfitness1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jfitness1);
        jfitness1.setBounds(250, 460, 90, 30);

        jfitness.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jfitness.setForeground(new java.awt.Color(255, 255, 255));
        jfitness.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jfitness);
        jfitness.setBounds(210, 440, 170, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dimensión (n) :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 150, 112, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Generaciones:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 150, 101, 30);

        Dimension.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Dimension.setModel(new javax.swing.SpinnerNumberModel(3, 3, 20, 1));
        getContentPane().add(Dimension);
        Dimension.setBounds(130, 150, 50, 30);

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
       dimension=Integer.parseInt(Dimension.getValue().toString());//El valor de las dimensiones lo limitamos de 3 a 20 en el Spinner
       generaciones=Integer.parseInt(Generaciones.getText());
       
       //Validando el numero de generaciones
       if(generaciones<1){
           JOptionPane.showMessageDialog(this,"Ingrese un número de generaciones myor a: 0","Error Generaciones",ERROR_MESSAGE);
           return;
       }
       generaciones*=10;
       //Creando los cromosomas deacuerdo a las generaciones
        Cromosoma calculo=new Cromosoma(dimension,generaciones);
        
        //Obteniendo al mejor cromosoma
        mejorfitness=calculo.getMejorfitness();
        mejorcromosoma=calculo.getMejorcromosoma();
       
       //Dibujamos el tablero en el JPanel1
       this.jPanel1.setLayout(new java.awt.GridLayout(dimension,dimension));
       celdas = new Celda[dimension][dimension]; //Matriz de celdas
           for(int i = 0; i < dimension; i++){
                for(int j = 0; j < dimension; j++){
                    celdas[i][j]=new Celda();
                    celdas[i][j].setVisible(true);
                    celdas[i][j].setText(""+mejorcromosoma[i][j]);
                    this.jPanel1.add(celdas[i][j]);
                }
            }
       
       jfitness.setText("Fitness:"+mejorfitness);
       jfitness1.setText("K="+dimension*((dimension*dimension)+1)/2);
        
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
            java.util.logging.Logger.getLogger(CuadradoMagico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuadradoMagico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuadradoMagico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuadradoMagico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CuadradoMagico().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dibujar;
    private javax.swing.JSpinner Dimension;
    private javax.swing.JTextField Generaciones;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jfitness;
    private javax.swing.JLabel jfitness1;
    // End of variables declaration//GEN-END:variables
}
