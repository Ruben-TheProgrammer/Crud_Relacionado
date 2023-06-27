package clases;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class formGenero extends javax.swing.JInternalFrame {

        EntityManagerFactory emf = null;
        EntityManager em = null;      
        private int fila = -1;
        
    public formGenero() {
                initComponents();
                emf = Persistence.createEntityManagerFactory("C:/base/GeneroLibro.odb");
                em = emf.createEntityManager();
                listar();

    }
    
    public genero crearGenero(){   
        String nombre = NombreGenero.getText();
        
        genero Genero = new genero(nombre);
   
        return Genero;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreGenero = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Genero");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Formulario de registro de Genero");

        jLabel2.setText("Nombre del Genero:");

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        Eliminar.setText("ELIMINAR");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        jLabel3.setText("Seleccione registro para editar o borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(editar)
                            .addComponent(Eliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
                // TODO add your handling code here:
                em = emf.createEntityManager(); // Crear un nuevo EntityManager
                genero Genero = crearGenero();
                try {
                    em.getTransaction().begin();
                    em.persist(Genero);
                    em.getTransaction().commit();
                 JOptionPane.showMessageDialog(this, "Género guardado correctamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                            ex.printStackTrace();
                } finally {
                                em.close();
                }
                listar();
                   // Limpia los campos de texto
                    NombreGenero.setText("");
    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
                            if (fila != -1) {
                                String nuevoGenero = NombreGenero.getText();
                                int idGenero = (int) tabla.getValueAt(fila, 0);

                                em = emf.createEntityManager();
                                try {
                                    em.getTransaction().begin();
                                    genero G = em.find(genero.class, idGenero);
                                    G.setNombre(nuevoGenero);
                                    em.getTransaction().commit();
                                    JOptionPane.showMessageDialog(this, "Género editado correctamente", "Edición exitosa", JOptionPane.INFORMATION_MESSAGE);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                } finally {
                                    em.close();
                                }

                                listar();
                                NombreGenero.setText("");
                                            fila = -1;

                            } 

    }//GEN-LAST:event_editarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

          fila = tabla.getSelectedRow();

        if (fila != -1) {
            String generoSeleccionado = (String) tabla.getValueAt(fila, 1);

            NombreGenero.setText(generoSeleccionado);

        }    }//GEN-LAST:event_tablaMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked

        int filaSeleccionada = tabla.getSelectedRow();
       if (filaSeleccionada != -1) {
           int idGenero = (int) tabla.getValueAt(filaSeleccionada, 0);

           em = emf.createEntityManager();
           try {
               em.getTransaction().begin();
               genero G = em.find(genero.class, idGenero);
               em.remove(G);
               em.getTransaction().commit();
               JOptionPane.showMessageDialog(this, "Género eliminado correctamente", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
           } catch (Exception ex) {
               ex.printStackTrace();
           } finally {
               em.close();
           }
           listar();
           NombreGenero.setText("");
       }

    }//GEN-LAST:event_EliminarMouseClicked
    
       public void listar() {
                em = emf.createEntityManager(); 
                try {
                    Query consultaGen = em.createQuery("SELECT G FROM genero G");
                    List<genero> resultadosGen = consultaGen.getResultList();

                    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Genero"}, 0);

                    for (genero G : resultadosGen) {
                        Object[] fila = new Object[2]; 
                        fila[0] = G.getId();
                        fila[1] = G.getNombre();
                        modelo.addRow(fila); 
                    }
                tabla.setModel(modelo); // Establecer el modelo de tabla actualizado
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    em.close();
                }
        }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField NombreGenero;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
