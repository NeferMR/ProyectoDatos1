/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectodatos1;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nefer
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    File Archivo, arch;
    String servis, cedu, Nombreperro, Razaperro, Colorperro, Fechaperro;
    String perros[] = new String[100];
    int iperros = 0, seleccita, casovete;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameCliente = new javax.swing.JFrame();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        crearcedu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tiempoo = new javax.swing.JTextField();
        buscarcedu = new javax.swing.JButton();
        Datec = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Savecambios = new javax.swing.JButton();
        Solcita = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Horas = new javax.swing.JComboBox<>();
        buscarhoras = new javax.swing.JButton();
        frameVeterinario = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ConAgen = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cdueño = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Nomperro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Diagnostico = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Prescripcion = new javax.swing.JTextField();
        Guardar_veterinario = new javax.swing.JButton();
        frameAdmin = new javax.swing.JFrame();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        concitas = new javax.swing.JButton();
        Modicita = new javax.swing.JButton();
        elimcita = new javax.swing.JButton();
        Asigcita = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        totalcaja = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Fchooser = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaoculta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Nchooser = new javax.swing.JFileChooser();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        frameCliente.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frameCliente.setMinimumSize(new java.awt.Dimension(800, 600));

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Informacion Del cliente");

        jLabel3.setText("Cedula del Dueño");

        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });

        crearcedu.setText("Crear");
        crearcedu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearceduActionPerformed(evt);
            }
        });

        jLabel8.setText("Agenda de citas");

        jLabel10.setText("Por favor elija El servicio");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta veterinario", "Control", "Desparasitación", "Vacunación", "Guarderia solo por día", "Radiologia", "Baño" }));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Tiempo gastado");

        tiempoo.setText(" ");
        tiempoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempooActionPerformed(evt);
            }
        });

        buscarcedu.setText("Buscar");
        buscarcedu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarceduActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre del perro", "Raza del perro", "Color", "Fecha de nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(60);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(25);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        Savecambios.setText("Guardar");
        Savecambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavecambiosActionPerformed(evt);
            }
        });

        Solcita.setText("Asignar cita");
        Solcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolcitaActionPerformed(evt);
            }
        });

        jLabel4.setText("Elija su fecha");

        Horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        buscarhoras.setText("Actualzar");
        buscarhoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarhorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameClienteLayout = new javax.swing.GroupLayout(frameCliente.getContentPane());
        frameCliente.getContentPane().setLayout(frameClienteLayout);
        frameClienteLayout.setHorizontalGroup(
            frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameClienteLayout.createSequentialGroup()
                        .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameClienteLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(frameClienteLayout.createSequentialGroup()
                                .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(crearcedu)
                                    .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(buscarcedu)
                                        .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, 53)))
                        .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(tiempoo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Datec, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Solcita)
                            .addComponent(jLabel4)
                            .addGroup(frameClienteLayout.createSequentialGroup()
                                .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarhoras))))
                    .addComponent(Savecambios))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        frameClienteLayout.setVerticalGroup(
            frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameClienteLayout.createSequentialGroup()
                .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(frameClienteLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Datec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarhoras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Solcita))
                    .addGroup(frameClienteLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearcedu)
                            .addComponent(buscarcedu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Savecambios)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        frameVeterinario.setMinimumSize(new java.awt.Dimension(500, 500));

        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel15.setText("Veterinario");

        jLabel16.setText("Consultas");

        ConAgen.setText("Consultar la agenda");

        jLabel17.setText("Fecha de la consulta");

        jLabel18.setText("Cedula del dueño");

        cdueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdueñoActionPerformed(evt);
            }
        });

        jLabel19.setText("Nombre del perro");

        jLabel20.setText("HISTORIA CLINICA DEL PACIENTE");

        jLabel21.setText("Diagnostico");

        jLabel22.setText("Prescripcion");

        Guardar_veterinario.setText("Guardar cambios");
        Guardar_veterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_veterinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameVeterinarioLayout = new javax.swing.GroupLayout(frameVeterinario.getContentPane());
        frameVeterinario.getContentPane().setLayout(frameVeterinarioLayout);
        frameVeterinarioLayout.setHorizontalGroup(
            frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVeterinarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frameVeterinarioLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConAgen, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel20)
                    .addGroup(frameVeterinarioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdueño, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameVeterinarioLayout.createSequentialGroup()
                        .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nomperro)
                            .addComponent(Diagnostico)
                            .addComponent(Prescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                    .addComponent(Guardar_veterinario))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        frameVeterinarioLayout.setVerticalGroup(
            frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVeterinarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConAgen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(59, 59, 59)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cdueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Nomperro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Prescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardar_veterinario)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        frameAdmin.setMinimumSize(new java.awt.Dimension(500, 500));

        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setText("Gestion de la agenda");

        concitas.setText("Consultar cita");
        concitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concitasActionPerformed(evt);
            }
        });

        Modicita.setText("Modificar cita");

        elimcita.setText("Eliminar cita");

        Asigcita.setText("Asignar cita");

        jLabel13.setText("Total en caja");

        totalcaja.setText("Valor a pagar");
        totalcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcajaActionPerformed(evt);
            }
        });

        jLabel14.setText("Administrador");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout frameAdminLayout = new javax.swing.GroupLayout(frameAdmin.getContentPane());
        frameAdmin.getContentPane().setLayout(frameAdminLayout);
        frameAdminLayout.setHorizontalGroup(
            frameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAdminLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addComponent(concitas)
                    .addComponent(Modicita, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimcita, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asigcita, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalcaja))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        frameAdminLayout.setVerticalGroup(
            frameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAdminLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(frameAdminLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(concitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modicita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elimcita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Asigcita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalcaja)
                .addGap(32, 32, 32))
        );

        tablaoculta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre del perro", "Raza del perro", "Color", "Fecha de nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaoculta.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaoculta);
        if (tablaoculta.getColumnModel().getColumnCount() > 0) {
            tablaoculta.getColumnModel().getColumn(0).setResizable(false);
            tablaoculta.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaoculta.getColumnModel().getColumn(1).setResizable(false);
            tablaoculta.getColumnModel().getColumn(2).setResizable(false);
            tablaoculta.getColumnModel().getColumn(2).setPreferredWidth(60);
            tablaoculta.getColumnModel().getColumn(3).setResizable(false);
            tablaoculta.getColumnModel().getColumn(3).setPreferredWidth(25);
            tablaoculta.getColumnModel().getColumn(4).setResizable(false);
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Raza", "Color", "Fecha de nacimiento", "Tipo de cita", "Fecha de cita", "Hora de cita", "duracion cita"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Veterinario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Administrador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Por favor seleccione quien usara el programa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(66, 66, 66)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int op = Fchooser.showOpenDialog(this);
        frameCliente.setVisible(true);
        String sDir = "C:\\user"; // direccion
        File f = new File(sDir); // instacia de la carpeta
        String ruta = "C:\\user"; // ruta para el archivo
        String fileName = "cliente.txt"; // nombre
        File file = new File(ruta, fileName); // instancia el archivo       
        if (!file.exists()) {
            f.mkdir();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error en la creacion");
            }
        }
        tablaoculta.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frameVeterinario.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frameAdmin.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frameVeterinario.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        frameAdmin.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void concitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_concitasActionPerformed

    private void totalcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalcajaActionPerformed

    private void cdueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdueñoActionPerformed

    private void buscarceduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarceduActionPerformed
        cedu = Cedula.getText();
        Archivo = Fchooser.getSelectedFile();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(0);
        }
        try (Scanner sc = new Scanner(Archivo)) {
            while (sc.hasNextLine()) {
                String lector = sc.nextLine();
                String datos[] = lector.split(",");
                if (cedu.equals(datos[0])) {
                    model.addRow(new Object[]{datos[0], datos[1], datos[2], datos[3], datos[4]});
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_buscarceduActionPerformed

    private void tiempooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempooActionPerformed

    }//GEN-LAST:event_tiempooActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        switch (jComboBox2.getSelectedIndex()) {
            case 4:
                tiempoo.setText("Todo el dia");
                seleccita = 1;
                casovete = 0;
                break;
            case 6:
                tiempoo.setText("2 Hora");
                seleccita = 2;
                casovete = 0;
                break;
            case 0:
            case 5:
                tiempoo.setText("1 Hora");
                seleccita = 3;
                casovete = 2;
                break;
            default:
                tiempoo.setText("1/2 Hora");
                seleccita = 4;
                casovete = 1;
                break;
        }
        //int i = jComboBox2.getSelectedIndex();
        //servis = jComboBox2.getItemAt(i);
        //tiempoo.setText(servis);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void crearceduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearceduActionPerformed
        boolean encontrado = false;
        cedu = Cedula.getText();
        Archivo = Fchooser.getSelectedFile();
        try (Scanner sc = new Scanner(Archivo)) {
            while (sc.hasNextLine() & encontrado == false) {
                String lector = sc.nextLine();
                String datos[] = lector.split(",");
                String cedul = datos[0];
                if (cedu.equals(cedul)) {
                    JOptionPane.showMessageDialog(null, "Esta cedula ya esta registrada");
                    encontrado = true;
                }
            }
        } catch (Exception ex) {

        }
        if (encontrado == false) {
            perronuevo();
            Creararchivo("cliente", cedu, Nombreperro, Razaperro, Colorperro, Fechaperro, "", "", "", "", "");
        }
        iperros = 1;
    }//GEN-LAST:event_crearceduActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        frameCliente.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SavecambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavecambiosActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        DefaultTableModel modoculta = (DefaultTableModel) tablaoculta.getModel();
        for (int i = 0; i < modoculta.getRowCount(); i++) {
            modoculta.removeRow(0);
        }
        try (Scanner sc = new Scanner(Archivo)) {
            while (sc.hasNextLine()) {
                String lector = sc.nextLine();
                String datos[] = lector.split(",");
                modoculta.addRow(new Object[]{datos[0], datos[1], datos[2], datos[3], datos[4]});
            }
        } catch (Exception ex) {

        }
        String aux[][] = new String[model.getRowCount()][5];
        for (int i = 0; i < model.getRowCount(); i++) {
            aux[i][0] = (String) model.getValueAt(i, 0);
            aux[i][1] = (String) model.getValueAt(i, 1);
            aux[i][2] = (String) model.getValueAt(i, 2);
            aux[i][3] = (String) model.getValueAt(i, 3);
            aux[i][4] = (String) model.getValueAt(i, 4);
        }

        int i = 0;
        for (int j = 0; j < modoculta.getRowCount(); j++) {
            if (!aux[i][0].equals((String) modoculta.getValueAt(0, 0))) {
                modoculta.addRow(new Object[]{(String) modoculta.getValueAt(0, 0), (String) modoculta.getValueAt(0, 1), (String) modoculta.getValueAt(0, 2), (String) modoculta.getValueAt(0, 3), (String) modoculta.getValueAt(0, 4)});
            } else {
                if ((aux[i][1].equals((String) modoculta.getValueAt(0, 1))) && (aux[i][2].equals((String) modoculta.getValueAt(0, 2))) && (aux[i][3].equals((String) modoculta.getValueAt(0, 3))) && (aux[i][4].equals((String) modoculta.getValueAt(0, 4)))) {
                    modoculta.addRow(new Object[]{(String) modoculta.getValueAt(0, 0), (String) modoculta.getValueAt(0, 1), (String) modoculta.getValueAt(0, 2), (String) modoculta.getValueAt(0, 3), (String) modoculta.getValueAt(0, 4)});
                } else {
                    modoculta.addRow(new Object[]{(String) model.getValueAt(i, 0), (String) model.getValueAt(i, 1), (String) model.getValueAt(i, 2), (String) model.getValueAt(i, 3), (String) model.getValueAt(i, 4)});
                }
                if (i < model.getRowCount() - 1) {
                    i++;
                }
            }
            modoculta.removeRow(0);
        }

        File file = new File("C:\\user", "cliente.txt");
        try (FileWriter fw = new FileWriter(file.getAbsoluteFile())) {
            BufferedWriter bw = new BufferedWriter(fw);
            for (int k = 0; k < modoculta.getRowCount(); k++) {
                bw.write((String) modoculta.getValueAt(k, 0) + "," + (String) modoculta.getValueAt(k, 1) + "," + (String) modoculta.getValueAt(k, 2) + "," + (String) modoculta.getValueAt(k, 3) + "," + (String) modoculta.getValueAt(k, 4));
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al crear archivo");
        }
        JOptionPane.showMessageDialog(null, "El archivo ha sido actualizado correctamente");
    }//GEN-LAST:event_SavecambiosActionPerformed

    private void Guardar_veterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_veterinarioActionPerformed
        String ceduladueño = cdueño.getText();
        String nombreperro = Nomperro.getText();
        String diagnostic = Diagnostico.getText();
        String prescrip = Prescripcion.getText();
        Creararchivo("Hoja de vida", ceduladueño, nombreperro, diagnostic, prescrip, "", "", "", "", "", "");
    }//GEN-LAST:event_Guardar_veterinarioActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked

    }//GEN-LAST:event_jComboBox2MouseClicked

    private void SolcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolcitaActionPerformed
        boolean error = false;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un perro de la tabla anterior");
            error = true;
        }
        String fecha = "";
        try {
            String dia = Integer.toString(Datec.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(Datec.getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(Datec.getCalendar().get(Calendar.YEAR));
            JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + year);
            fecha = dia + "/" + mes + "/" + year;
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha");
            error = true;
        }
        if (!error) {
            int index = jComboBox2.getSelectedIndex();
            String citasel = jComboBox2.getItemAt(index);
            int inde = Horas.getSelectedIndex();
            String horaselec = Horas.getItemAt(inde);
            String horasiguiente = Horas.getItemAt(inde+1);
            Creararchivo("Agenda", (String) model.getValueAt(table.getSelectedRow(), 0), (String) model.getValueAt(table.getSelectedRow(), 1), (String) model.getValueAt(table.getSelectedRow(), 2), (String) model.getValueAt(table.getSelectedRow(), 3), (String) model.getValueAt(table.getSelectedRow(), 4), citasel, fecha, horaselec, tiempoo.getText(), String.valueOf(casovete));
            if(casovete == 2) {
            Creararchivo("Agenda", (String) model.getValueAt(table.getSelectedRow(), 0), (String) model.getValueAt(table.getSelectedRow(), 1), (String) model.getValueAt(table.getSelectedRow(), 2), (String) model.getValueAt(table.getSelectedRow(), 3), (String) model.getValueAt(table.getSelectedRow(), 4), citasel, fecha, horasiguiente, tiempoo.getText(), "3");
            }
        }
    }//GEN-LAST:event_SolcitaActionPerformed

    private void buscarhorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarhorasActionPerformed
        Horas.removeAllItems();
        String dia = "", mes = "", year = "";
        if(tiempoo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor vuelva a seleccionar el servicio, ha ocurido un error");
        }
        int op = Nchooser.showOpenDialog(this);
        arch = Nchooser.getSelectedFile();
        File f = new File("C:\\user"); // instacia de la carpeta
        File file = new File("C:\\user", "Agenda.txt"); // instancia el archivo       
        if (!file.exists()) {
            f.mkdir();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error en la creacion");
            }
        }
        try {
            dia = Integer.toString(Datec.getCalendar().get(Calendar.DAY_OF_MONTH));
            mes = Integer.toString(Datec.getCalendar().get(Calendar.MONTH) + 1);
            year = Integer.toString(Datec.getCalendar().get(Calendar.YEAR));
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha");
        }
        boolean citaocupada;
        int mañana = 8, tarde = 2, descuento = 0;
        if(seleccita == 2) {
            descuento = 2;
        }
        for (int i = 0; i < 5 - descuento; i++) {
            citaocupada = econtrarcita(dia, mes, year, String.valueOf((mañana + i) + ":00"));
            if (!citaocupada) {
                Horas.addItem(String.valueOf((mañana + i) + ":00"));
            }
            citaocupada = econtrarcita(dia, mes, year, String.valueOf((mañana + i) + ":30"));
            if (seleccita == 3) {
                if (i < 4) {
                    if (!citaocupada) {
                        Horas.addItem(String.valueOf((mañana + i) + ":30"));
                    }
                }
            } else {
                if (!citaocupada) {
                    Horas.addItem(String.valueOf((mañana + i) + ":30"));
                }
            }
        }
        for (int i = 0; i < 4 - descuento; i++) {
            citaocupada = econtrarcita(dia, mes, year, String.valueOf((tarde + i) + ":00"));
            if (!citaocupada) {
                Horas.addItem(String.valueOf((tarde + i) + ":00"));
            }
            citaocupada = econtrarcita(dia, mes, year, String.valueOf((tarde + i) + ":30"));
            if (seleccita == 3) {
                if (i < 3) {
                    if (!citaocupada) {
                        Horas.addItem(String.valueOf((tarde + i) + ":30"));
                    }
                }
            } else {
                if (!citaocupada) {
                    Horas.addItem(String.valueOf((tarde + i) + ":30"));
                }
            }
        }
    }//GEN-LAST:event_buscarhorasActionPerformed

    public void Creararchivo(String nomarchi, String cedul, String Nombreperro, String Razaperro, String Colorperro, String Fechaperro, String Tipocita, String Fechacita, String Horacita, String Duracioncita, String veteri) {
        String ruta = "C:\\user";
        String fileName = nomarchi + ".txt";
        File file = new File(ruta, fileName);
        try (FileWriter fw = new FileWriter(file.getAbsolutePath(), true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cedul + "," + Nombreperro + "," + Razaperro + "," + Colorperro + "," + Fechaperro + "," + Tipocita + "," + Fechacita + "," + Horacita + "," + Duracioncita + "," + veteri);
            bw.newLine();
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            System.out.println("Error, no se pudo escribir");
        }
    }

    public void perronuevo() {
        do {
            Nombreperro = JOptionPane.showInputDialog("Por favor digite el nombre del perro");
        } while ("".equals(Nombreperro));
        do {
            Razaperro = JOptionPane.showInputDialog("Por favor digite La raza del perro");
        } while ("".equals(Razaperro));
        do {
            Colorperro = JOptionPane.showInputDialog("Por favor digite El color del perro");
        } while ("".equals(Colorperro));
        do {
            Fechaperro = JOptionPane.showInputDialog("Por favor digite La fecha de nacimiento del perro (DD/MM/AAAA)");
        } while ("".equals(Fechaperro));
    }

    public boolean econtrarcita(String dia, String mes, String año, String Hora) {
        try (Scanner sc = new Scanner(arch)) {
            while (sc.hasNextLine()) {
                String lector = sc.nextLine();
                String datos[] = lector.split(",");
                String fecha[] = datos[6].split("/");
                if (((dia + "/" + mes + "/" + año).equals(datos[6])) && Hora.equals(datos[7]) && !datos[9].equals("0")) {
                    return true;
                }
            }
        } catch (Exception ex) {

        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asigcita;
    private javax.swing.JTextField Cedula;
    private javax.swing.JButton ConAgen;
    private com.toedter.calendar.JDateChooser Datec;
    private javax.swing.JTextField Diagnostico;
    private javax.swing.JFileChooser Fchooser;
    private javax.swing.JButton Guardar_veterinario;
    private javax.swing.JComboBox<String> Horas;
    private javax.swing.JButton Modicita;
    private javax.swing.JFileChooser Nchooser;
    private javax.swing.JTextField Nomperro;
    private javax.swing.JTextField Prescripcion;
    private javax.swing.JButton Savecambios;
    private javax.swing.JButton Solcita;
    private javax.swing.JButton buscarcedu;
    private javax.swing.JButton buscarhoras;
    private javax.swing.JTextField cdueño;
    private javax.swing.JButton concitas;
    private javax.swing.JButton crearcedu;
    private javax.swing.JButton elimcita;
    private javax.swing.JFrame frameAdmin;
    private javax.swing.JFrame frameCliente;
    private javax.swing.JFrame frameVeterinario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaoculta;
    private javax.swing.JTable table;
    private javax.swing.JTextField tiempoo;
    private javax.swing.JButton totalcaja;
    // End of variables declaration//GEN-END:variables
}
