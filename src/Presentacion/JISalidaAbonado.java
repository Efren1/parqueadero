/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author Sion
 */
public class JISalidaAbonado extends javax.swing.JInternalFrame {
JDesktopPane des;
Connection ObjBD;
Statement str,str2;
ResultSet resultado;

    /**
     * Creates new form JISalidaAbonado
     */
    public JISalidaAbonado(JDesktopPane desk,Connection O) throws SQLException {
        initComponents();
        des=desk;
        ObjBD=O;
        str2=ObjBD.createStatement();
        this.btnSalida.setEnabled(false);
    }

    public JISalidaAbonado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdAbonado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSalida = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        lblIdTarjeta = new javax.swing.JLabel();
        lblFechaIn = new javax.swing.JLabel();
        lblFechaSal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Salida de Abnados");

        jLabel1.setText("Salida de Clientes");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el numero de Tarjeta");

        jLabel3.setText("Información Cliente");

        jLabel4.setText("Identificación Tarjeta");

        jLabel5.setText("Idenfiticación Cliente");

        jLabel6.setText("Fecha Ingreso");

        jLabel7.setText("Fecha Salida");

        btnSalida.setText("Validar Salida");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setText("Costo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSalida)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtIdAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblFechaIn, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                            .addComponent(lblIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblIdTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblFechaSal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(140, 431, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtIdAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(lblIdTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(lblFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblFechaSal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalida)
                    .addComponent(btnLimpiar))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try{
        String consulta="Select * from abonado where id_abonado="+this.txtIdAbonado.getText();
        str=ObjBD.prepareStatement(consulta);
        resultado=str.executeQuery(consulta);
        while(resultado.next()){
            this.lblIdTarjeta.setText(resultado.getString("Id_abonado"));
            this.lblIdCliente.setText(resultado.getString("Id_Cliente"));
            if(resultado.getBoolean("Estado")==true){
               this.lblFechaIn.setText(resultado.getString("FechaIngreso_A"));
               
               String fec=this.lblFechaIn.getText();
                int año,mes,dia,horas,min;
                String fec1[]= fec.split(" ");
                String fecha=fec1[0];
                String fecha2=fec1[1];
                String aux[]=fecha.split("-");
                String aux2[]=fecha2.split(":");
                año=Integer.parseInt(aux[0]);
                mes=Integer.parseInt(aux[1]);
                dia=Integer.parseInt(aux[2]);
                horas=Integer.parseInt(aux2[0]);
                min=Integer.parseInt(aux2[1]);
            
                Calendar Cal= Calendar.getInstance();
                String fechact= Cal.get(Cal.YEAR)+"-"+(Cal.get(Cal.MONTH)+1)+"-"+Cal.get(Cal.DATE)+" "+Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND); 
                int minutoD=(Cal.get(Cal.MINUTE)), mesD=Cal.get(Cal.MONTH)+1;
                int canthoras=0,cantdias=0;
                double costo=0,costototal=0;
                if(año==Cal.get(Cal.YEAR))                
                    {   
                    System.out.println("Entro hasta años "+mes+"\n"+mesD);
                    if(mes==mesD)
                    {
                        System.out.println("Engtro hasta meses");
                        if(dia==Cal.get(Cal.DATE))
                        {
                            System.out.println("Entro hasta dias");
                            if(horas==Cal.get(Cal.HOUR_OF_DAY))
                            {   
                                
                                System.out.println("Entro hasta horas");
                            }
                        else{
                            canthoras=Cal.get(Cal.HOUR_OF_DAY)-horas;
                            canthoras=canthoras*2000;
                            costototal=costototal+canthoras;
                            System.out.println("Entro hasta ELSE1");
                        }
                        }
                    else{
                        cantdias=Cal.get(Cal.DATE)-dia;
                        cantdias=cantdias*12000;
                        costototal+=cantdias;
                        System.out.println("Entro hasta ELSE2");
                    }
                    }
                }
            if(minutoD>min)
                {
                costo=minutoD-min;
                costo=costo*75;
                System.out.println("Entro hasta minuto"+costo);
                }else{
            if(min>minutoD){
                costo=min-minutoD;
                costo=costo*75;
                System.out.println("Entro MINUTO"+costo);
            }
            
            }
            costototal+=costo;
               this.lblCosto.setText(""+costototal);
               this.lblFechaSal.setText(fechact);
            }else{
                this.lblFechaIn.setText("La tarjeta no esta siendo utilizada");
               this.lblFechaSal.setText("");
               this.btnSalida.setEnabled(false);
            }
        }
        }catch(SQLException ex){
        Logger.getLogger(JITicket.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
        try{
        String insercion= "update abonado set FechaSalida_A='"+this.lblFechaSal.getText()+"',estado=0,costo="+this.lblCosto.getText() +"where Id_Abonado="+this.txtIdAbonado.getText();
        str2.executeUpdate(insercion);
        this.btnSalida.setEnabled(true);
        }catch(SQLException ex){
        Logger.getLogger(JITicket.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        this.txtIdAbonado.setText("");
        this.lblCosto.setText("");
        this.lblFechaIn.setText("");
        this.lblFechaSal.setText("");
        this.lblIdTarjeta.setText("");
        this.lblIdCliente.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFechaIn;
    private javax.swing.JLabel lblFechaSal;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblIdTarjeta;
    private javax.swing.JTextField txtIdAbonado;
    // End of variables declaration//GEN-END:variables
}
