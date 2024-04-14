
package Interfaces;

import BDfx.Conection;
import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class PDF {
    
   public void Agregar_Pdf() {
        Conection conec = new Conection();
        String sql = "INSERT INTO pdf(idpdf, nombrepdf, archivopdf) VALUES(?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.conectar().prepareStatement(sql);
            ps.setInt(1, 4);
            ps.setString(2, "Funciona2");
            ps.setBytes(3, rutaArchivo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }
   
        public void guardarPdf(){
            
            String nombre="Funciona2";
            File ruta = new File(ruta_archivo);
            if (nombre.trim().length() != 0 && ruta_archivo.trim().length() != 0) {
                guardar_pdf(ruta);
                //tpdf.visualizar_PdfVO(tabla);
                ruta_archivo = "";
                // activa_boton(false, false, false);
                // txtname.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Falta Datos");
            }
        }
   
    String ruta_archivo;
    public void seleccionar_pdf(JButton btn) {
        
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(btn);
        if (se == 0) {
            //btn.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
        guardarPdf();
    }
    
    byte[] rutaArchivo;
    public void guardar_pdf(File ruta) {
        
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            rutaArchivo = pdf;
        } catch (IOException ex) {
            rutaArchivo = null;
            //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
        }
        Agregar_Pdf();
    }
    
    public void ejecutar_archivoPDF(int id) {

        Conection cn = new Conection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.conectar().prepareStatement("SELECT archivopdf FROM pdf WHERE idpdf = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            try (InputStream bos = new ByteArrayInputStream(b)) {
                int tamanoInput = bos.available();
                byte[] datosPDF = new byte[tamanoInput];
                bos.read(datosPDF, 0, tamanoInput);
                
                try (OutputStream out = new FileOutputStream("new.pdf")) {
                    out.write(datosPDF);
                    //abrir archivo
                }
            }
            ps.close();
            rs.close();
            cn.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo pdf " + ex.getMessage());
        }
        
        try {
             Desktop.getDesktop().open(new File("new.pdf"));
        } catch (Exception ex) {
          }
    }
       
}
