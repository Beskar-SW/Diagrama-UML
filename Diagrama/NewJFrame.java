import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author johan
 */
public class NewJFrame extends javax.swing.JFrame {

    private static final String UNCHECKED = "unchecked";

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
   public class SwingBrowser extends JFXPanel {
//Variable encargada de renderizar el website
 
    private WebEngine engine;
 
    //Constructor de la clase
    public SwingBrowser() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebView view = new WebView();
                engine = view.getEngine();
                setScene(new Scene(view));
            }
        });
        setVisible(true);
    }
//Método para cargar la URL de la página web
 
    public void loadURL(final String url) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String tmp = toURL(url);
                if (tmp == null) {
                    tmp = toURL(url);
                }
                engine.load(tmp);
 
            }
        });
    }
 
    private String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(UNCHECKED)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Diagrama = new javax.swing.JButton();
        DiagramadeEstructura = new javax.swing.JButton();
        DiagramadeComportamienro = new javax.swing.JButton();
        DiagramadeClases = new javax.swing.JButton();
        DiagramadeComponentes = new javax.swing.JButton();
        DiagramadeObjetos = new javax.swing.JButton();
        DiagramadeDespliegue = new javax.swing.JButton();
        DiagdeEstrComp = new javax.swing.JButton();
        DiagramaAct = new javax.swing.JButton();
        DiagramadeCasosdeUsos = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        DiagramadePaquetes = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Diagrama.setBackground(new java.awt.Color(153, 0, 153));
        Diagrama.setForeground(new java.awt.Color(255, 255, 255));
        Diagrama.setText("Diagrama");
        Diagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramaActionPerformed(evt);
            }
        });

        DiagramadeEstructura.setBackground(new java.awt.Color(0, 0, 153));
        DiagramadeEstructura.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadeEstructura.setText("Diagrama de Estructura");
        DiagramadeEstructura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadeEstructuraActionPerformed(evt);
            }
        });

        DiagramadeComportamienro.setBackground(new java.awt.Color(204, 0, 0));
        DiagramadeComportamienro.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadeComportamienro.setText("Diagrama de Comportamiento");
        DiagramadeComportamienro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadeComportamienroActionPerformed(evt);
            }
        });

        DiagramadeClases.setBackground(new java.awt.Color(0, 51, 255));
        DiagramadeClases.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadeClases.setText("Diagrama de Clases");
        DiagramadeClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadeClasesActionPerformed(evt);
            }
        });

        DiagramadeComponentes.setBackground(new java.awt.Color(0, 51, 255));
        DiagramadeComponentes.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadeComponentes.setText("Diagrama de Componentes");
        DiagramadeComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadeComponentesActionPerformed(evt);
            }
        });

        DiagramadeObjetos.setBackground(new java.awt.Color(0, 51, 255));
        DiagramadeObjetos.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadeObjetos.setText("Diagrama de Objetos");
        DiagramadeObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadeObjetosActionPerformed(evt);
            }
        });

        DiagramadeDespliegue.setBackground(new java.awt.Color(0, 51, 255));
        DiagramadeDespliegue.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadeDespliegue.setText("Diagrama de Despliegue");
        DiagramadeDespliegue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadeDespliegueActionPerformed(evt);
            }
        });

        DiagdeEstrComp.setBackground(new java.awt.Color(0, 51, 255));
        DiagdeEstrComp.setForeground(new java.awt.Color(255, 255, 255));
        DiagdeEstrComp.setText("Diagrama de Estructura Compuesta");
        DiagdeEstrComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagdeEstrCompActionPerformed(evt);
            }
        });

        DiagramaAct.setBackground(new java.awt.Color(255, 51, 51));
        DiagramaAct.setForeground(new java.awt.Color(255, 255, 255));
        DiagramaAct.setText("Diagrama de Actividad");
        DiagramaAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramaActActionPerformed(evt);
            }
        });

        DiagramadeCasosdeUsos.setBackground(new java.awt.Color(255, 51, 51));
        DiagramadeCasosdeUsos.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadeCasosdeUsos.setText("Diagrama de Casos de Usos");
        DiagramadeCasosdeUsos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiagramadeCasosdeUsosMouseClicked(evt);
            }
        });
        DiagramadeCasosdeUsos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadeCasosdeUsosActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Diagrama de Máquina de Estado");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        DiagramadePaquetes.setBackground(new java.awt.Color(0, 51, 255));
        DiagramadePaquetes.setForeground(new java.awt.Color(255, 255, 255));
        DiagramadePaquetes.setText("Diagrama de Paquetes");
        DiagramadePaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagramadePaquetesActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 51, 51));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Diagrama de Interacción");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 204, 0));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Diagrama de Secuancia");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 204, 0));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Diagrama Global de Interacción");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 204, 0));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Diagrama de Comunicacion");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 204, 0));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Diagrama de Tiempos");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(44, 44, 44)
                .addComponent(jButton17)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DiagdeEstrComp)
                        .addGap(51, 51, 51)
                        .addComponent(DiagramadeDespliegue)
                        .addGap(225, 225, 225)
                        .addComponent(jButton13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DiagramadeClases)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DiagramadeEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiagramadeComponentes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DiagramadeObjetos)
                        .addGap(94, 94, 94)
                        .addComponent(DiagramaAct)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DiagramadeCasosdeUsos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11))
                            .addComponent(DiagramadeComportamienro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(553, 553, 553)
                        .addComponent(Diagrama))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(DiagramadePaquetes)
                        .addGap(241, 241, 241)
                        .addComponent(jButton14)
                        .addGap(61, 61, 61)
                        .addComponent(jButton15)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiagramadeEstructura)
                            .addComponent(DiagramadeComportamienro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiagramadeClases)
                            .addComponent(DiagramadeComponentes)
                            .addComponent(DiagramadeObjetos)
                            .addComponent(DiagramaAct)
                            .addComponent(DiagramadeCasosdeUsos)
                            .addComponent(jButton11))
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Diagrama)
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiagdeEstrComp)
                            .addComponent(DiagramadeDespliegue))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiagramadePaquetes)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton17)
                    .addComponent(jButton16))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiagramadeObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadeObjetosActionPerformed
        b6 ventana =  new  b6 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_DiagramadeObjetosActionPerformed

    private void DiagramadeDespliegueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadeDespliegueActionPerformed
        b11 ventana =  new  b11 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_DiagramadeDespliegueActionPerformed

    private void DiagdeEstrCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagdeEstrCompActionPerformed
        b10 ventana =  new  b10 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_DiagdeEstrCompActionPerformed

    private void DiagramaActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramaActActionPerformed
        b7 ventana =  new  b7 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_DiagramaActActionPerformed

    private void DiagramadeCasosdeUsosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadeCasosdeUsosActionPerformed
            
    }//GEN-LAST:event_DiagramadeCasosdeUsosActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        b9 ventana =  new  b9();
        ventana . setVisible (true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void DiagramadePaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadePaquetesActionPerformed
        b13 ventana =  new  b13();
        ventana . setVisible (true);
    }//GEN-LAST:event_DiagramadePaquetesActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        b12 ventana =  new  b12();
        ventana . setVisible (true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void DiagramadeEstructuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadeEstructuraActionPerformed
        b2 ventana =  new  b2 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_DiagramadeEstructuraActionPerformed

    private void DiagramadeComportamienroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadeComportamienroActionPerformed
        b3 ventana =  new  b3 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_DiagramadeComportamienroActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        b14 ventana =  new  b14 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        b15 ventana =  new  b15 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        b16 ventana =  new  b16 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_jButton16ActionPerformed


   private javax.swing.JPanel jPanel1;
   
    private void DiagramadeCasosdeUsosMouseClicked(java.awt.event.MouseEvent evt) {                                                    
        JFrameWindow ventana =  new  JFrameWindow ();
        ventana . setVisible (true);
    }                                                  

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        b17 ventana =  new  b17 ();
        ventana . setVisible (true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void DiagramadeClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadeClasesActionPerformed
         b4 ventana = new b4();
        ventana.setVisible(true);
    }//GEN-LAST:event_DiagramadeClasesActionPerformed

    private void DiagramadeComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramadeComponentesActionPerformed
         b5 ventana = new b5();
        ventana.setVisible(true);
    }//GEN-LAST:event_DiagramadeComponentesActionPerformed

    private void DiagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagramaActionPerformed
        b1 ventana = new b1();
        ventana.setVisible(true);
    }//GEN-LAST:event_DiagramaActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiagdeEstrComp;
    private javax.swing.JButton Diagrama;
    private javax.swing.JButton DiagramaAct;
    private javax.swing.JButton DiagramadeCasosdeUsos;
    private javax.swing.JButton DiagramadeClases;
    private javax.swing.JButton DiagramadeComponentes;
    private javax.swing.JButton DiagramadeComportamienro;
    private javax.swing.JButton DiagramadeDespliegue;
    private javax.swing.JButton DiagramadeEstructura;
    private javax.swing.JButton DiagramadeObjetos;
    private javax.swing.JButton DiagramadePaquetes;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
}
    // End of variables declaration//GEN-END:variables

   
