/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Banco.Conexao;
import Controller.ModeloTabela;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author HUGO
 */
public class Tela_atualizar extends javax.swing.JFrame {
    
     Connection con1 = Conexao.getConnection();
            PreparedStatement stmt1 = null ;
            ResultSet rs1 =null ;

    /**
     * Creates new form Tela_atualizar
     */
    public Tela_atualizar() {
        initComponents();
    }
    
    
    
    
    
    public void PreencherTabela() {
        
    
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Codigo","Descrição"};
    
       
        try {
             stmt1 = con1.prepareStatement("select * from estab1 WHERE descricao like '"+ jTextField_pesq.getText().trim() +"%'");
               rs1 = stmt1.executeQuery();
         while(rs1.next()){
             
              String descricao, id = String.valueOf(rs1.getInt("id"));
              descricao = rs1.getString("descricao");
                  dados.add(new Object[]{id, descricao }) ;
             
         }
           } catch (SQLException ex) {
              Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
          }
        
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_atualizar.setModel(modelo);
        jTable_atualizar.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTable_atualizar.getColumnModel().getColumn(0).setResizable(false);
        jTable_atualizar.getColumnModel().getColumn(1).setPreferredWidth(265);
        jTable_atualizar.getColumnModel().getColumn(1).setResizable(false);
    
     
        jTable_atualizar.getTableHeader().setReorderingAllowed(false);
        jTable_atualizar.setAutoResizeMode(jTable_atualizar.AUTO_RESIZE_OFF);
        jTable_atualizar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void ApagaTabela(){
      String [] Colunas = new String[]{"Codigo","Descrição"};
    
       
         ArrayList dados = new ArrayList();
                 
             
         
         
        
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_atualizar.setModel(modelo);
        jTable_atualizar.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTable_atualizar.getColumnModel().getColumn(0).setResizable(false);
        jTable_atualizar.getColumnModel().getColumn(1).setPreferredWidth(265);
        jTable_atualizar.getColumnModel().getColumn(1).setResizable(false);
    
     
        jTable_atualizar.setAutoResizeMode(jTable_atualizar.AUTO_RESIZE_OFF);
        jTable_atualizar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
    }
//      public void pesq() throws SQLException{
//             stmt1 = con1.prepareStatement("select * from lista WHERE id = '"+ jTextField_codigo.getText().trim() +"'");
//             rs1 = stmt1.executeQuery(); 
//             
//             if(rs1.next()){
//                 jTextField_preco.setText((String.valueOf(rs1.getDouble("preco"))));
//                 jTextField_desc.setText(rs1.getString("descricao"));
//                 String medida = rs1.getString("medida") ;
//                 
//                 if(medida.equals("unidade")){
//                     jRadioButton_unidade.setSelected(true);
//                     jRadioButton_KG.setSelected(false);
//                     jLabel_kg.setVisible(false);
//                 }else{
//                     jRadioButton_KG.setSelected(true);
//                     jRadioButton_unidade.setSelected(false);
//                     jLabel_kg.setVisible(true);
//                 }
//             }
//  
//  }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_pesq = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_atualizar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton_kg = new javax.swing.JRadioButton();
        jRadioButton_unidade = new javax.swing.JRadioButton();
        jTextField_preco = new javax.swing.JTextField();
        jButton_atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Produto");

        jTextField_pesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pesqKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_pesqKeyReleased(evt);
            }
        });

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable_atualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_atualizar);

        jLabel2.setText("Codigo");

        jLabel3.setText("descrição");

        jTextField_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_descricaoActionPerformed(evt);
            }
        });

        jLabel4.setText("medida");

        jLabel5.setText("preço");

        jRadioButton_kg.setText("KG");
        jRadioButton_kg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_kgActionPerformed(evt);
            }
        });

        jRadioButton_unidade.setText("unidade");

        jButton_atualizar.setText("Atualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_pesq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton_kg)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_unidade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_atualizar)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton_kg)
                    .addComponent(jRadioButton_unidade))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_atualizar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        PreencherTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_pesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pesqKeyPressed
        
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              
      }  
    }//GEN-LAST:event_jTextField_pesqKeyPressed

    private void jTextField_pesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pesqKeyReleased
         if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && jTextField_pesq.getText().equals("")){
          ApagaTabela(); 
        }else{
       
            PreencherTabela();
        }
          
        
        
    }//GEN-LAST:event_jTextField_pesqKeyReleased

    private void jTextField_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_descricaoActionPerformed

    private void jRadioButton_kgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_kgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_kgActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_atualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_kg;
    private javax.swing.JRadioButton jRadioButton_unidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_atualizar;
    private javax.swing.JTextField jTextField_codigo;
    private javax.swing.JTextField jTextField_descricao;
    private javax.swing.JTextField jTextField_pesq;
    private javax.swing.JTextField jTextField_preco;
    // End of variables declaration//GEN-END:variables
}
