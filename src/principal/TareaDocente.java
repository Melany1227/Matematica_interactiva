/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allil
 */
public class TareaDocente extends javax.swing.JFrame {
    private String id;

    /**
     * Creates new form TareaDocente
     */
    public TareaDocente(String id) {
        initComponents();
        this.setResizable(false); // Hace que la ventana no sea redimensionable
        this.setLocationRelativeTo(null);//para que la interfaz aparezca en el centro
        this.setTitle("Subir tareas"); // Establece el título de la ventana
        this.id = id;
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/Logo1.png"));
        this.setIconImage(icono.getImage());
        
        
        Icon iconDevolver = setIcono("/img/devolver.png", 46, 41);
        btnDevolver.setIcon(iconDevolver);
        
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = jTable1.getSelectedRow();
                int columnaDocumento = 3; // La columna que contiene el nombre del documento en tu modelo de datos

                if (filaSeleccionada != -1) {
                    String nombreDocumento = jTable1.getValueAt(filaSeleccionada, columnaDocumento).toString();
                    abrirDocumentoDesdeTabla(nombreDocumento);
                }
            }
        });
        
        try {
        DefaultTableModel mdlTabla = Datos(); // Obtén el nuevo modelo con los datos actualizados

        if (mdlTabla != null) {
            jTable1.setModel(mdlTabla); // Establece el nuevo modelo en la tabla
        } else {
            // Manejar el caso en que Datos() devuelve null
            // Esto podría ser útil para depurar y entender por qué Datos() no está funcionando correctamente.
            System.err.println("El método Datos() devolvió un modelo de tabla nulo.");
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(TareaD.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
    }

    private TareaDocente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCodC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JButton();
        lblFe = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        txtCodC = new javax.swing.JTextField();
        txtFe = new com.toedter.calendar.JDateChooser();
        txtB = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblCodC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodC.setText("Código de curso:");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matemática Interactiva");

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/devolver.png"))); // NOI18N
        btnDevolver.setDefaultCapable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
        );

        lblFe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFe.setText("Fecha de entrega:");

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblB.setText("Bonificación:");

        txtCodC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(55, 100, 121));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Subir archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodC)
                            .addComponent(txtFe, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtB))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int seleccion; // Declarar la variable

        

        java.util.Date fechaEntregaDate = txtFe.getDate();
        String fechaEntrega = ""; // Inicializa la variable
        if (fechaEntregaDate != null) {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
            fechaEntrega = sdf.format(fechaEntregaDate);
        } else {
            // Manejar el caso en que el usuario no ha seleccionado una fecha
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha de entrega.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el código del curso tenga 4 dígitos
        String codigo = txtCodC.getText().trim();
        // Validar que el código del curso tenga 4 dígitos numéricos
        if (codigo.length() != 4 || !codigo.matches("\\d{4}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "El código del curso debe tener exactamente 4 dígitos numéricos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

       double bonificacionValor = 0.0; // Valor por defecto
        String bonificacion = txtB.getText().trim();
        if (!bonificacion.isEmpty()) {
            try {
                bonificacionValor = Double.parseDouble(bonificacion);
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "La bonificación debe ser un valor numérico.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF y Word", "pdf", "doc", "docx");
        fileChooser.setFileFilter(filter);

        seleccion = fileChooser.showOpenDialog(this); // Inicializar la variable

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();

            // Guardar la información en el archivo Tareas.txt
            guardarInformacionEnArchivo(codigo, fechaEntrega, bonificacion, archivoSeleccionado.getAbsolutePath());
            DefaultTableModel mdlTabla = null;
            try {
                mdlTabla = Datos(); 
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TareaD.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTable1.setModel(mdlTabla); // Establece el nuevo modelo en la tabla

    }//GEN-LAST:event_jButton1ActionPerformed
}
    
    
    private void abrirDocumentoDesdeTabla(String rutaCompleta) {
        try {
            // Abrir el documento
            abrirArchivo(rutaCompleta);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir el documento: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirArchivo(String rutaCompleta) throws IOException {
        // Crear un objeto File con la ruta completa del archivo
        File archivo = new File(rutaCompleta);

        // Verificar si el archivo existe antes de intentar abrirlo
        if (archivo.exists()) {
            // Abrir el documento
            Desktop.getDesktop().open(archivo);
        } else {
            JOptionPane.showMessageDialog(this, "El archivo no existe: " + rutaCompleta, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarInformacionEnArchivo(String codigo, String fechaEntrega, String bonificacion, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Tareas.txt", true))) {
            // Almacena la ruta completa del archivo en lugar del nombre
            File archivoSeleccionado = new File(nombreArchivo);
            String rutaCompleta = archivoSeleccionado.getAbsolutePath();
            writer.write(codigo + ";" + fechaEntrega + ";" + bonificacion + ";" + rutaCompleta);
            writer.newLine();
            System.out.println(codigo);
            System.out.println(fechaEntrega);
            System.out.println(bonificacion);
            System.out.println(rutaCompleta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Método para mostrar los datos en una tabla
    public DefaultTableModel Datos() throws FileNotFoundException {
        Vector cabeceras = new Vector();

        cabeceras.addElement("Código");
        cabeceras.addElement("Fecha de entrega");
        cabeceras.addElement("Bonificación");
        cabeceras.addElement("Tarea");

        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Esto hace que todas las celdas no sean editables
            }
        };

        try {
            FileReader fr = new FileReader("Tareas.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, ";"); // Cambiado el delimitador a ";"
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
    
   
    
    
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
            java.util.logging.Logger.getLogger(TareaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TareaDocente().setVisible(true);
            }
        });
    }
    public Icon setIcono(String ulr, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(ulr));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblCodC;
    private javax.swing.JLabel lblFe;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtCodC;
    private com.toedter.calendar.JDateChooser txtFe;
    // End of variables declaration//GEN-END:variables
}