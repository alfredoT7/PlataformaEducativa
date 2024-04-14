
package Interfaces;

import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Materia extends javax.swing.JFrame {
    
    private int indicebtn;
    private ArrayList<JButton> botones;
    private ArrayList<JLabel> labels;
    private int indicelbl;
    
    String cadena ="jenj";
    public Materia() {
        initComponents();
        indicebtn = 0;
        indicelbl = 0;
        labels = new ArrayList<>();
        botones = new ArrayList<>();
        
        
        ImageIcon imagen = new ImageIcon("src/Recursos/imageclase1.jpg");
        Icon iconoEscalado = new ImageIcon(imagen.getImage().getScaledInstance(lblPortada.getWidth(), lblPortada.getHeight(), Image.SCALE_DEFAULT));
        lblPortada.setIcon(iconoEscalado);
        lblComentario.setText("<html><p>Anunciar algo</p><p> con la Clase</p></html>");
        lblSeleccionarA.setText("<html><p>Agregar Archivo </p><p>   Adjunto</p></html>");
        btnGetClave.setText("<html><p>Obtener clave </p><p>de la clase</p></html>");
       /* lbl1.setText("Gustavo");
        btn1.setText("<html><center>"+cadena+"<html>");
        lbl2.setText("LUIS");
        btn2.setText("<html><center>"+cadena+"<html");
        */
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblComentario = new javax.swing.JLabel();
        lblSeleccionarA = new javax.swing.JLabel();
        btnGetClave = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JTextField();
        scrollComentario = new javax.swing.JScrollPane();
        txtAcomentario = new javax.swing.JTextArea();
        scrollTablon = new javax.swing.JScrollPane();
        panelTablon = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblAsignatura = new javax.swing.JLabel();
        lblPortada = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);

        btnGetClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetClaveActionPerformed(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar y Guardar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        txtAcomentario.setColumns(20);
        txtAcomentario.setRows(5);
        scrollComentario.setViewportView(txtAcomentario);

        panelTablon.setBackground(new java.awt.Color(255, 255, 255));
        panelTablon.setMaximumSize(new java.awt.Dimension(100, 32787978));
        panelTablon.setOpaque(false);
        panelTablon.setLayout(new java.awt.GridLayout(0, 1));
        scrollTablon.setViewportView(panelTablon);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAsignatura.setBackground(new java.awt.Color(255, 255, 255));
        lblAsignatura.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jPanel1.add(lblAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 60));
        jPanel1.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 120));

        btnEnviar.setText("Publicar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblSeleccionarA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(lblComentario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnGetClave, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnEnviar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollTablon, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnEnviar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeleccionarA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGetClave, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollTablon, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        PDF pdf = new PDF();
        pdf.seleccionar_pdf(btnSeleccionar);
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed
    int x=10;
    int y=10;
    int ancho=300;
    int alto=50;
    private void btnGetClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetClaveActionPerformed
        // TODO add your handling code here:
        txtContrasenia.setText(contrasenia);
        JLabel label=new JLabel("Label"+indicelbl);
        label.setAlignmentY(BOTTOM_ALIGNMENT);
        label.setBounds(x, y, ancho, alto);
        panelTablon.add(label);
        y = y+alto+5;
        indicelbl++;
        JButton boton=new JButton("<html><center>Boton"+indicebtn+"BFJENJKENDJEDNJKDNUJNJNHJBFHRFBHWBHAWDJANWJjcjwnjcnejncwjncwjcbherbfhb<p>fjkebihbjdshljkldcknjnrjbrhyvbecbrhbchjrebcjcbhebcehjbchjberhbchrebhcbcbhrebchNDNJDQWNJW<html>");
        boton.setBounds(x, y, ancho, alto);
        panelTablon.add(boton);
        y = y+alto;
        indicebtn++;
        
        boton.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
            System.out.println(boton.getText());
            }
        });
        
        panelTablon.updateUI();
        
        
    }//GEN-LAST:event_btnGetClaveActionPerformed

    
    public void iniciarMateria(Materia materia) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                materia.setVisible(true);
            }
        });
    }
    
     public void setNomClase(String nomClase) {
        lblAsignatura.setText(nomClase);
        
    }
     
    private String contrasenia;
    public void getClaveClase(String contrasenia){
        this.contrasenia = contrasenia;
    }
    
    String rutaArchivo;
    public void seleccionarPDF() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.btnSeleccionar.setText("" + j.getSelectedFile().getName());
            rutaArchivo = j.getSelectedFile().getAbsolutePath();

        } else {}
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGetClave;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblSeleccionarA;
    private javax.swing.JPanel panelTablon;
    private javax.swing.JScrollPane scrollComentario;
    private javax.swing.JScrollPane scrollTablon;
    private javax.swing.JTextArea txtAcomentario;
    private javax.swing.JTextField txtContrasenia;
    // End of variables declaration//GEN-END:variables
}
