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
import javax.swing.JOptionPane;

/**
 *
 * @author Sion
 */
public class JIRecibidos extends javax.swing.JInternalFrame {
JDesktopPane des;
Connection objBD;
Statement str,insert,insert2;
ResultSet resultado;
    /**
     * Creates new form JIRecibidos
     */
    public JIRecibidos(JDesktopPane desk, Connection O) throws SQLException {
        initComponents();
        des= desk;
        objBD=O;
        this.btnFactura.setEnabled(false);
        insert=objBD.createStatement();
    }
    public JIRecibidos() {
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
        jLabel2 = new javax.swing.JLabel();
        txtCodigoT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        lblTotalPago = new javax.swing.JLabel();
        btnFactura = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        lblTicket = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Pago de Ticket");

        jLabel2.setText("Ingrese el Codigo");

        jLabel3.setText("Fecha Ingreso");

        Total.setText("Total A Pagar");

        btnFactura.setText("Pagar");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Generar Recibo");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha Salida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Total)
                            .addComponent(jLabel3))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFactura)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblTotalPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                            .addComponent(lblIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 9, Short.MAX_VALUE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(lblTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(txtCodigoT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Total)
                    .addComponent(lblTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnFactura)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    try {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog("La version 2.0 esta por finalizar estamos realizando actividades graficas",this);
        int auxb;
        String consulta = "Select Pagado_T,Id_Ticket,FechaIngreso_T,FechaSalida_T,Costo_T from ticket where Id_Ticket= "+this.txtCodigoT.getText();
        str=objBD.prepareStatement(consulta);
        resultado=str.executeQuery(consulta);
        while(resultado.next()){
            auxb=Integer.parseInt(resultado.getString("Pagado_T"));
            if(auxb==0){
            this.lblTicket.setText(resultado.getString("Id_Ticket"));
            this.lblIngreso.setText(resultado.getString("FechaIngreso_T"));
                
                String fec=this.lblIngreso.getText();
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
            this.lblTotalPago.setText(""+costototal);
            this.lblSalida.setText(fechact);
        String insercion="update ticket set FechaSalida_T='"+fechact+"', costo_T="+this.lblTotalPago.getText()+" where Id_Ticket="+this.lblTicket.getText();
        insert.executeUpdate(insercion);
        }else{
            JOptionPane.showMessageDialog(this, "El ticket ya fue cancelado");
            }
        }
        resultado.beforeFirst();
        if(resultado.next()==false)
        {
        JOptionPane.showMessageDialog(this,"No existe ticket");
        }else{
            if(this.lblTicket.getText()!=""){
            this.btnBuscar.setEnabled(false);
            this.txtCodigoT.setEnabled(false);
            this.btnFactura.setEnabled(true);}
        }
        }catch (SQLException ex) {
        Logger.getLogger(JITicket.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
        try{    
        String insercion2="update ticket set Pagado_T=true where Id_Ticket ="+this.txtCodigoT.getText();
        insert.executeUpdate(insercion2);
        JOptionPane.showMessageDialog(this, "El ticket ha sido pagado satisfactoriamente");
        this.txtCodigoT.setEnabled(true);
        this.lblIngreso.setText("");
        this.lblSalida.setText("");
        this.lblTotalPago.setText("");
        this.lblTicket.setText("");
        this.btnBuscar.setEnabled(true);
        this.txtCodigoT.setText("");
        this.btnFactura.setEnabled(false);
        }catch (SQLException ex) {
        Logger.getLogger(JITicket.class.getName()).log(Level.SEVERE, null, ex);

    }
    }//GEN-LAST:event_btnFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTicket;
    private javax.swing.JLabel lblTotalPago;
    private javax.swing.JTextField txtCodigoT;
    // End of variables declaration//GEN-END:variables
}
