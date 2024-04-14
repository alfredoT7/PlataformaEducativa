
package Interfaces;

import java.security.SecureRandom;


public class CrearClase extends javax.swing.JFrame {

  
    public CrearClase() {
        initComponents();
        
        txtAhrClase.setText("Ejm:\nLunes:08:15-09:45\nMiercoles:14:15-15:45");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloClase = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblNomClase = new javax.swing.JLabel();
        lblAula = new javax.swing.JLabel();
        lblHrClase = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        scrollDescripcion = new javax.swing.JScrollPane();
        txtAdescripcion = new javax.swing.JTextArea();
        txtNomClase = new javax.swing.JTextField();
        txtAula = new javax.swing.JTextField();
        scrollHrClase = new javax.swing.JScrollPane();
        txtAhrClase = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Clase");
        setBackground(java.awt.Color.lightGray);

        lblTituloClase.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        lblTituloClase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloClase.setText("CREAR CLASE");
        lblTituloClase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblDescripcion.setText("Descripcion de la Clase");

        lblNomClase.setText("Nombre De La Clase");

        lblAula.setText("Aula");

        lblHrClase.setText("Horario De La Clase");

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtAdescripcion.setColumns(20);
        txtAdescripcion.setRows(5);
        scrollDescripcion.setViewportView(txtAdescripcion);

        txtAhrClase.setColumns(20);
        txtAhrClase.setRows(5);
        scrollHrClase.setViewportView(txtAhrClase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(lblTituloClase, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHrClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txtNomClase)
                            .addComponent(txtAula)
                            .addComponent(scrollHrClase)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTituloClase, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomClase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomClase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAula, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHrClase, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(scrollHrClase, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        btnCrear.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        Materia materia = new Materia();
        materia.setNomClase(txtNomClase.getText());
        generarPassword();
        materia.getClaveClase(contrasenia);
        materia.iniciarMateria(materia);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCrearActionPerformed

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearClase().setVisible(true);
            }
        });
    }
    
    private String contrasenia;
    public void generarPassword(){

        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        char[] password = new char[8];
        for(int i=0;i<password.length;i++){
            password[i] = caracter.charAt(random.nextInt(caracter.length()));
        }
        contrasenia = new String(password);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel lblAula;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblHrClase;
    private javax.swing.JLabel lblNomClase;
    private javax.swing.JLabel lblTituloClase;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JScrollPane scrollHrClase;
    private javax.swing.JTextArea txtAdescripcion;
    private javax.swing.JTextArea txtAhrClase;
    private javax.swing.JTextField txtAula;
    private javax.swing.JTextField txtNomClase;
    // End of variables declaration//GEN-END:variables
}
