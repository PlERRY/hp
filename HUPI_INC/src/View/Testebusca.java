/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Banco.Conexao;
import Controller.ModeloTabela;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author HUGO
 */
public class Testebusca extends javax.swing.JFrame {
     Connection con1 = Conexao.getConnection();
            PreparedStatement stmt1 = null ;
            ResultSet rs1 =null ;
            private String produto,cont,nome,nome2, listaSQL="";
            private float preco1=0,preco2=0, total;
            private int contador=0, itensLista[];
            private ArrayList ListaProd = new ArrayList();
    /**
     * Creates new form Testebusca
     */
    public Testebusca() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_buscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_resultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_venda = new javax.swing.JTable();
        jTextField_desc_pesq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton_teste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("enviar pro banco");

        jTextField_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscarActionPerformed(evt);
            }
        });

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("resultado");

        jTable_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_venda.setCellSelectionEnabled(true);
        jTable_venda.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable_vendaComponentAdded(evt);
            }
        });
        jTable_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_vendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_venda);

        jTextField_desc_pesq.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextField_desc_pesq.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_desc_pesq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_desc_pesq.setText("Pesquisar produto");
        jTextField_desc_pesq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_desc_pesqMouseClicked(evt);
            }
        });
        jTextField_desc_pesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_desc_pesqActionPerformed(evt);
            }
        });
        jTextField_desc_pesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_desc_pesqKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_desc_pesqKeyReleased(evt);
            }
        });

        jLabel3.setText("Produto");

        jButton_teste.setText("teste");
        jButton_teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_testeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_desc_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_teste))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_teste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_desc_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
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

    private void jTextField_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 produto = jTextField_buscar.getText();
                
                 cont=String.valueOf(contador);
                 nome2="estab";
                 nome=nome2+cont;
                 int estab=0 ;
                 
                 for(int z=0; z<itensLista.length; z++){
                     listaSQL = listaSQL+ String.valueOf(ListaProd.get(z))+",";
            //listaSQL = listaSQL.substring(0, listaSQL.length() -1) ;
            //System.out.println(listaSQL);
                        
                 }
                
                 
                
//                 for (int x=1; x==2; x++){
//                    
//                     try {
//                         stmt1 = con1.prepareStatement("Select sum(preco) as total from estab"+x+" where id in ("+listaSQL+")");
//                         rs1 = stmt1.executeQuery();
//                        if(rs1.next()){
//                        preco1 = Float.valueOf(rs1.getString("total"));
//                        
//                        if (preco2<preco1){
//                            preco2 = preco1;
//                            estab = x ;
//                        }
//                        } 
//                     } catch (SQLException ex) {
//                         Logger.getLogger(Testebusca.class.getName()).log(Level.SEVERE, null, ex);
//                     }
//                     
//                 }
                 jTextField_resultado.setText(listaSQL);
            //jTextField_resultado.setText("menor preço: "+String.valueOf(preco2)+"encontrado no estab"+String.valueOf(estab));
//    try {
//           
//                        contador++;
//                        cont=String.valueOf(contador);
//                        nome2="estab";
//                        nome=nome2+cont;
//                       
//        stmt1 = con1.prepareStatement("Select * from "+nome+" where descricao = '"+produto+"'" );
//        rs1 = stmt1.executeQuery();
//        if(rs1.next()){
//        preco2 = Float.valueOf(rs1.getString("preco"));
//        }
//            if( preco1<preco2){
//             jTextField_resultado.setText(String.valueOf(preco1));
//                         
//            }else{
//               jTextField_resultado.setText("errado"+String.valueOf(preco1=preco2));
//            }
//        
//        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
//        }
    
    
        System.out.println(ListaProd);
       
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable_vendaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable_vendaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_vendaComponentAdded

    private void jTable_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_vendaMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = jTable_venda.getSelectedRow();
            int coluna = linha; // jTable_venda.getSelectedColumn();
            String valor = String.valueOf(jTable_venda.getValueAt(linha,0));
            itensLista[contador] = (Integer.parseInt(valor));
            
            JOptionPane.showMessageDialog(null, "produto adicionado com sucesso");
            
       
        }
    }//GEN-LAST:event_jTable_vendaMouseClicked

    private void jTextField_desc_pesqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_desc_pesqMouseClicked
        jTextField_desc_pesq.setText("");
        jTextField_desc_pesq.setFont(new Font("Tahoma", Font.BOLD, 13));
        jTextField_desc_pesq.setForeground(new java.awt.Color(0, 0, 0));

    }//GEN-LAST:event_jTextField_desc_pesqMouseClicked

    private void jTextField_desc_pesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_desc_pesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_desc_pesqActionPerformed

    private void jTextField_desc_pesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_desc_pesqKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

        }
    }//GEN-LAST:event_jTextField_desc_pesqKeyPressed

    private void jTextField_desc_pesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_desc_pesqKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && jTextField_desc_pesq.getText().equals("")){
            ApagaTabela();
        }else{

            PreencherTabela();
        }

    }//GEN-LAST:event_jTextField_desc_pesqKeyReleased

    private void jButton_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_testeActionPerformed
      //String lista = listaSQL.substring(0, listaSQL.length() -1) ;
      for(int z=0; z<itensLista.length; z++){
                     listaSQL = listaSQL+ String.valueOf(itensLista[z])+",";
            //listaSQL = listaSQL.substring(0, listaSQL.length() -1) ;
            //System.out.println(listaSQL);
                        
                 }
      jTextField_buscar.setText(listaSQL);
    }//GEN-LAST:event_jButton_testeActionPerformed

    public void PreencherTabela() {
        
    
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Codigo","Descrição"};
    
       
        try {
             stmt1 = con1.prepareStatement("select * from lista WHERE descricao like '"+ jTextField_desc_pesq.getText().trim() +"%'");
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
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(265);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
    
     
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
   
    public void ApagaTabela(){
      String [] Colunas = new String[]{"Codigo","Descrição"};
    
       
         ArrayList dados = new ArrayList();
                 
             
         
         
        
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(265);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
    
     
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
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
            java.util.logging.Logger.getLogger(Testebusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testebusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testebusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testebusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testebusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_teste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_venda;
    private javax.swing.JTextField jTextField_buscar;
    private javax.swing.JTextField jTextField_desc_pesq;
    private javax.swing.JTextField jTextField_resultado;
    // End of variables declaration//GEN-END:variables
}
