/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.tools.jar.Main;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class ArchPdf {
     private File ruta_destino;
     private PdfContentByte cab;
    

    public ArchPdf(){
        
    }

    
    /* metodo que hace uso de la clase itext para manipular archivos PDF*/
    public void crear_PDF(int id_ticket, String Fecha){
        //abre ventana de dialogo "guardar"
        Colocar_Destino();
        //si destino es diferente de null
        if(this.ruta_destino!=null){
            try {
                Document mipdf = new Document();
                PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + ".pdf"));
                mipdf.open();// se abre el documento
                mipdf.add(new Paragraph("                SISTEMA DE GESTION PARQUEADERO FELIZ S.A.\n\n\n        ",FontFactory.getFont("Bradley Hand ITC",14,Font.BOLD,BaseColor.RED)));
                mipdf.add(new Paragraph("Numero Ticket:",FontFactory.getFont("Bradley Hand ITC",14,Font.BOLD,BaseColor.RED)));
                mipdf.add(new Paragraph(id_ticket + "\n\n"));
                mipdf.add(new Paragraph("Fecha Ingreso:\n",FontFactory.getFont("Bradley Hand ITC",14,Font.BOLD,BaseColor.RED)));
                mipdf.add(new Paragraph(Fecha+ "\n\n"));
                String[] columna1={Fecha};
                String[] columna2={id_ticket+""};
                PdfPTable Tabla= new PdfPTable(3);
                Tabla.setWidthPercentage(110);
                PdfPCell celda1 = new PdfPCell (new Paragraph("Fecha",FontFactory.getFont("Bradley Hand ITC",14,Font.BOLD,BaseColor.RED)));
                PdfPCell celda2 = new PdfPCell (new Paragraph("No. TIQUETE",FontFactory.getFont("Bradley Hand ITC",14,Font.BOLD,BaseColor.RED)));
                
                
                Tabla.addCell(celda1);
                Tabla.addCell(celda2);
                
                for(int i=0;i<columna1.length;i++)
                    {
                    Tabla.addCell(columna1[i]);
                    Tabla.addCell(columna2[i]);
                    }
                mipdf.add(Tabla);
                mipdf.add(new Paragraph("\n\n\nGracias por usar nuestros servicios",FontFactory.getFont("Bradley Hand ITC",14,Font.BOLD,BaseColor.BLACK)));
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Tiquete creado sin errores");
                
            } catch (DocumentException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /* abre la ventana de dialogo GUARDAR*/
    public void Colocar_Destino(){
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){
           this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }
    

    
}