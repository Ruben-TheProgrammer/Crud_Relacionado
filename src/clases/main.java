package clases;

public class main extends javax.swing.JFrame {


    public main() {
        initComponents();
 
    }

     public javax.swing.JDesktopPane getEscritorio() {
         return Escritorio;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        libroBoton = new javax.swing.JMenu();
        generoBoton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setPreferredSize(new java.awt.Dimension(1300, 438));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        libroBoton.setText("Registrar Libro");
        libroBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libroBotonMouseClicked(evt);
            }
        });
        jMenuBar1.add(libroBoton);

        generoBoton.setText("Registrar Genero");
        generoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generoBotonMouseClicked(evt);
            }
        });
        jMenuBar1.add(generoBoton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void libroBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libroBotonMouseClicked
       // Obtén la instancia de JDesktopPane
        javax.swing.JDesktopPane escritorio = getEscritorio();

        // Crea una instancia del JInternalFrame
        formLibro verVentana = new formLibro();

        // Agrega el JInternalFrame al JDesktopPane
        escritorio.add(verVentana);

        // Muestra el JInternalFrame
        verVentana.setVisible(true);  
        
    }//GEN-LAST:event_libroBotonMouseClicked

    private void generoBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoBotonMouseClicked
         //Obtén la instancia de JDesktopPane
        javax.swing.JDesktopPane escritorio = getEscritorio();

        // Crea una instancia del JInternalFrame
        formGenero verVentana = new formGenero();

        // Agrega el JInternalFrame al JDesktopPane
        escritorio.add(verVentana);

        // Muestra el JInternalFrame
        verVentana.setVisible(true);  
    }//GEN-LAST:event_generoBotonMouseClicked

  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu generoBoton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu libroBoton;
    // End of variables declaration//GEN-END:variables
}
