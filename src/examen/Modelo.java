/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ferchitoo
 */
public class Modelo extends javax.swing.JFrame {

    Connection connection;
    PreparedStatement seleccionarProfesores;
    PreparedStatement seleccionarProfesoresPorApellidos;
    PreparedStatement insertarNuevoProfesor;
    ArrayList<Profesor> listaProfesores;
    Profesor profesor;
    int i = 0;
    public Modelo() {
        
        initComponents();
        listaProfesores = new ArrayList();
        this.setLocationRelativeTo(null);
        getConnection();

        jTextanterior.setEditable(false);
        jTextsiguiente.setEditable(false);

        listaProfesores = getProfesor();

        if (listaProfesores.size() > 0) {
            cedula.setText("" + listaProfesores.get(0).getCedula());
            jTextnombre.setText("" + listaProfesores.get(0).getNombre());
            jTextapellidos.setText("" + listaProfesores.get(0).getApellido());
            jTextcarrera.setText("" + listaProfesores.get(0).getCarrera());
            jTexttipoProfesor.setText("" + listaProfesores.get(0).getTipoProfesor());
            jTexthorasclase.setText("" + listaProfesores.get(0).getHorasClase());
            jTexthorasComplementarias.setText("" + listaProfesores.get(0).getHoras_complementarias());
    
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollBar1 = new javax.swing.JScrollBar();
        ExamenPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ExamenPU").createEntityManager();
        profesor_1Query = java.beans.Beans.isDesignTime() ? null : ExamenPUEntityManager.createQuery("SELECT p FROM Profesor_1 p");
        profesor_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : profesor_1Query.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jTextnombre = new javax.swing.JTextField();
        jTextapellidos = new javax.swing.JTextField();
        jTextcarrera = new javax.swing.JTextField();
        jTexttipoProfesor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTexthorasclase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTexthorasComplementarias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextanterior = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextsiguiente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTexthorasemanales = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CEDULA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("NOMBRES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("APELLIDOS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("CARRERA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("TIPO DE PROFESOR");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("HORAS CLASE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("HORAS COMPLEMENTARIAS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("BASE DE DATOS");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Siguiente");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("HORAS SEMANALES");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, profesor_1List, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horasComplementarias}"));
        columnBinding.setColumnName("Horas Complementarias");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horasSemanales}"));
        columnBinding.setColumnName("Horas Semanales");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoProfesor}"));
        columnBinding.setColumnName("Tipo Profesor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${carrera}"));
        columnBinding.setColumnName("Carrera");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horasClase}"));
        columnBinding.setColumnName("Horas Clase");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellidos}"));
        columnBinding.setColumnName("Apellidos");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombres}"));
        columnBinding.setColumnName("Nombres");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedula}"));
        columnBinding.setColumnName("Cedula");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTexthorasemanales, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTexttipoProfesor))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextcarrera))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextapellidos))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTexthorasclase, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTexthorasComplementarias, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jTextanterior))
                                        .addComponent(jButton2))
                                    .addComponent(jTextsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jTextcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTexttipoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTexthorasemanales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTexthorasclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTexthorasComplementarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextanterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); //Agregra driver java db a la libreria
            System.out.println("Driver JavaDB cargado");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error al cargar Driver\nAgregar Driver Java DB" + cnfe);
        }
        Connection conexion = null;

        
        
        
        
        try {
            String urlbd = "jdbc:derby://localhost:1527/Examen";  //ubicacion de la base de datos en nuestra maquina
            conexion = DriverManager.getConnection(urlbd, "administrador", "admin");
            System.out.println("Coneccion satisfactoria");

        } catch (SQLException sqlex) {
            System.out.println("Error al establecer conexion a la BD:" + sqlex);
        }
        
        
        
        

        try {
            Statement sentencia = conexion.createStatement();
            ResultSet registros = sentencia.executeQuery("select * from profesor"); //ver registros de una tabla
            while (registros.next()) {
                String cedula = registros.getString("cedula"); //almacenar todos los registros para mostrarlos
                String nombres = registros.getString("nombres");
                String apellidos = registros.getString("apellidos");
                int horas_clase = registros.getInt("horas_clase");
                String carrera = registros.getString("carrera");
                String tipo_profesor = registros.getString("tipo_profesor");
                int horas_semanales = registros.getInt("horas_semanales");
                int horas_complementarias = registros.getInt("horas_complementarias");
                //System.out.println(isbn+"-"+title+"-"+String.valueOf(editions)+"-"+String.valueOf(copyright));
               this.cedula.setText(cedula);
               this.jTextnombre.setText(nombres);
               this.jTextapellidos.setText(apellidos);
               this.jTexthorasclase.setText(""+horas_clase);
               this.jTextcarrera.setText(carrera);
               this.jTexttipoProfesor.setText(tipo_profesor);
               this.jTexthorasemanales.setText(""+horas_semanales);
               this.jTexthorasComplementarias.setText(""+horas_complementarias);
                String sqlInsert = String.format("INSERT INTO books VALUES('%s' , '%s' , %d , %d)", "0133406959",
                        "Desarrollo del pensamiento Conputacional", 3, 2016);

                int r = sentencia.executeUpdate(sqlInsert);
                System.out.println("Se han modificado" + r + " registros");
            }
            registros.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException sqlex) {
            System.out.println("Error al enviar consultas:" + sqlex);
        }




        try {
            Statement sentencia = conexion.createStatement();
            ResultSet reg = sentencia.executeQuery("select * from authors where LastName like 'D%'");
            while (reg.next()) {
                String authorId = reg.getString("authorId");
                String firstName = reg.getString("firstName");
                String lastName = reg.getString("lastName");

                System.out.printf("%s %-70s %4s %n", authorId, firstName, lastName);
            }
            reg.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException sqlex) {
            System.out.println("Error" + sqlex);

        }
        
//        int hc=Integer.parseInt(jTexthorasclase.getText());
//        int hs=Integer.parseInt(jTexthorasemanales.getText());
//        int hcomp=Integer.parseInt(jTexthorasComplementarias.getText());
//        agregarP(jTextcedula.getText(), jTextnombre.getText(), jTextapellidos.getText(), jTextcarrera.getText(), jTexttipoProfesor.getText(),hc,hs,hcomp);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setEnabled(true);
        if (i == 0) {
            jButton2.setEnabled(false);
        } else {
            i--;
            jTextanterior.setText("" + (i + 1));
            jTextanterior.setText("" + listaProfesores.size());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://downljTextcedulacom/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelo().setVisible(true);
            }
        });
    }
    
    public Connection getConnection(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Examen", "administrador", "admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return connection;
    }

    public ArrayList<Profesor> getProfesor() {
        try {
            String datoSQL = "select * from Persona";
            seleccionarProfesores = connection.prepareStatement(datoSQL);
            ResultSet r = seleccionarProfesores.executeQuery();
            while (r.next()) {
                String cedula=r.getString(1);
                String nombre = r.getString(2);
                String apellido = r.getString(3);
                int horasClase = r.getInt(4);
                String carrera=r.getString(5);
                Profesor prof = new Profesor(cedula, nombre, apellido, horasClase, carrera, carrera, horasClase, horasClase){
                    @Override
                    public int horasComplementarias() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                listaProfesores.add(prof);
            }
            r.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaProfesores;
    }

    public ArrayList<Profesor> getPersonaApellidos(String apellido) {
        try {
            String datoSQL = "select * from Profesor where apellido like '%" + apellido + "%'";
            seleccionarProfesoresPorApellidos = connection.prepareStatement(datoSQL);
            ResultSet r = seleccionarProfesoresPorApellidos.executeQuery();
            while (r.next()) {
                cedula.setText(r.getString(1));
                jTextnombre.setText(r.getString(2));
                jTextapellidos.setText(r.getString(3));
                jTextcarrera.setText(r.getString(4));
                jTexttipoProfesor.setText(r.getString(5));
                jTexthorasclase.setText(r.getString(6));
                jTexthorasComplementarias.setText(r.getString(7));
                jTexthorasemanales.setText(r.getString(8));
            }
            r.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaProfesores;
    }

    //public void agregarP(int id, String nombres, String apellidos, String email, String telefono) {
    public void agregarP(String cedula, String nombre, String apellido,int horasClase,String carrera,int horas_semanales,int horas_complementarias) {
        getConnection();
        try {
            String datoSQL = "INSERT INTO EXAMEN(CEDULA,NOMBRES,APELLIDOS,HORAS_CLASE,CARRERA,HORAS_SEMANALES,HORAS_COMPLEMENTARIAS) values(?,?,?,?,?,?,?)";
            insertarNuevoProfesor = connection.prepareStatement(datoSQL);
            insertarNuevoProfesor.setString(1, cedula);
            insertarNuevoProfesor.setString(2, nombre);
            insertarNuevoProfesor.setString(3, apellido);
            insertarNuevoProfesor.setInt(4, horasClase);
            insertarNuevoProfesor.setString(5,carrera );
            insertarNuevoProfesor.setInt(6, horas_semanales);
            insertarNuevoProfesor.setInt(7, horas_complementarias);
            insertarNuevoProfesor.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Se agrego nuevo profesor");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ExamenPUEntityManager;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextanterior;
    private javax.swing.JTextField jTextapellidos;
    private javax.swing.JTextField jTextcarrera;
    private javax.swing.JTextField jTexthorasComplementarias;
    private javax.swing.JTextField jTexthorasclase;
    private javax.swing.JTextField jTexthorasemanales;
    private javax.swing.JTextField jTextnombre;
    private javax.swing.JTextField jTextsiguiente;
    private javax.swing.JTextField jTexttipoProfesor;
    private java.util.List<examen.Profesor_1> profesor_1List;
    private javax.persistence.Query profesor_1Query;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

   
}
