package clases;

import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;
public class formLibro extends javax.swing.JInternalFrame {


        EntityManagerFactory emf = null;
        EntityManager em = null;
        
        private int filaSeleccionada = -1;

            public formLibro() {
                initComponents();
                emf = Persistence.createEntityManagerFactory("C:/base/GeneroLibro.odb");
                em = emf.createEntityManager();
                listar();
                cargarGeneros();
            }    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NombreLibro = new javax.swing.JTextField();
        NombreAutor = new javax.swing.JTextField();
        combogenero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Libro");

        jLabel1.setText("Registro de formulario de Libros");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Genero:");

        jLabel4.setText("Escritor");

        combogenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NombreAutor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreLibro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combogenero, 0, 142, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminar))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(editar)
                            .addComponent(eliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public libro crearlibro() {
            String titulo = NombreLibro.getText();
            String autor = NombreAutor.getText();
            String generol = (String) combogenero.getSelectedItem();

            libro L = new libro(titulo, autor, generol);

            return L;
        }
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        em = emf.createEntityManager(); // Crear un nuevo EntityManager
        libro L = crearlibro();
        try {
            em.getTransaction().begin();
            em.persist(L);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Registro agregado correctamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
                    ex.printStackTrace();
        } finally {
                        em.close();
        }
            listar();
             // Limpia los campos de texto
            NombreLibro.setText("");
            NombreAutor.setText("");
    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
    em = emf.createEntityManager(); // Crear un nuevo EntityManager
    
    // Verifica si se seleccionó una fila
    if (filaSeleccionada != -1) {
        int idLibro = (int) tabla.getValueAt(filaSeleccionada, 0);
        libro L = em.find(libro.class, idLibro);
        
        // Actualiza los valores del objeto existente
        L.setTitulo(NombreLibro.getText());
        L.setAutor(NombreAutor.getText());
        L.setGenero((String) combogenero.getSelectedItem());
        
        try {
            em.getTransaction().begin();
            em.merge(L); // Utiliza merge en lugar de persist para actualizar el objeto
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Género guardado correctamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }

    }
    
    listar();
    
    // Limpia los campos de texto
    NombreLibro.setText("");
    NombreAutor.setText("");
    }//GEN-LAST:event_editarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
               // Obtiene la fila seleccionada
            filaSeleccionada = tabla.getSelectedRow();

        // Verifica si se seleccionó una fila
        if (filaSeleccionada != -1) {
            // Obtiene los datos de la fila seleccionada
            String tituloSeleccionado = (String) tabla.getValueAt(filaSeleccionada, 1);
            String autorSeleccionado = (String) tabla.getValueAt(filaSeleccionada, 2);
            String generoSeleccionado = (String) tabla.getValueAt(filaSeleccionada, 3);
            
            
            // Muestra los datos en los campos de texto
            NombreLibro.setText(tituloSeleccionado);
            NombreAutor.setText(autorSeleccionado);
            combogenero.setSelectedItem(generoSeleccionado);
            
        }


    }//GEN-LAST:event_tablaMouseClicked


    
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
   int filaSeleccionada = tabla.getSelectedRow();
    if (filaSeleccionada != -1) {
        int idLibro = (int) tabla.getValueAt(filaSeleccionada, 0);

        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            libro L = em.find(libro.class, idLibro);
            em.remove(L);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Género eliminado correctamente", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }

        listar();
            NombreLibro.setText("");
            NombreAutor.setText("");

    }


    }//GEN-LAST:event_eliminarActionPerformed


        public void listar() {
                em = emf.createEntityManager(); // Crear un nuevo EntityManager.
                try {
                    Query consultaLib = em.createQuery("SELECT L FROM libro L");
                    List<libro> resultadosLibro = consultaLib.getResultList();

                    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Título", "Autor", "Genero"}, 0);

                    for (libro L : resultadosLibro) {
                        Object[] fila = new Object[4];
                        fila[0] = L.getId();
                        fila[1] = L.getTitulo();
                        fila[2] = L.getAutor();
                        fila[3] = L.getGenero();

                        modelo.addRow(fila);
                    }

                    tabla.setModel(modelo); // Establecer el modelo de tabla actualizado
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    em.close();
                }
    }

    private void cargarGeneros() {
    em = emf.createEntityManager(); // Crear un nuevo EntityManager.

    try {
        Query consultaGeneros = em.createQuery("SELECT G FROM genero G");
        List<genero> resultadosGeneros = consultaGeneros.getResultList();

        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();

        for (genero genero : resultadosGeneros) {
            modelo.addElement(genero.getNombre());
        }

        combogenero.setModel(modelo); // Establecer el modelo del combo box actualizado
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        em.close();
    }
}


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreAutor;
    private javax.swing.JTextField NombreLibro;
    private javax.swing.JComboBox<String> combogenero;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
