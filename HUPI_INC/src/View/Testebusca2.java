
package View;

import Banco.Conexao;
import Controller.ModeloTabela;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author HUGO
 */
public class Testebusca2 extends javax.swing.JFrame {
     Connection con1 = Conexao.getConnection();
            PreparedStatement stmt1 = null ;
            ResultSet rs1 =null ;
                private String produto,cont,nome,nome2, listaSQL="", estab1, estab2,lista2="",dominio;
            private float preco1=0,preco2=0, total;
            private int contador=0, itensLista[],conta=0,idbairro=0, conta2=0;
            private ArrayList ListaProd = new ArrayList();
            private ArrayList Lista3 = new ArrayList();
            private ArrayList dados1 = new ArrayList();
            private ArrayList cidade1 = new ArrayList();
           
           
            private String estado,cidade,bairro;
            
    /**
     * Creates new form Testebusca
     */
    public Testebusca2() {
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
        jButton_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_resultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_venda = new javax.swing.JTable();
        jTextField_desc_pesq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_estado = new javax.swing.JComboBox<>();
        jComboBox_cidade = new javax.swing.JComboBox<>();
        jComboBox_bairro = new javax.swing.JComboBox<>();
        jButton_teste = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_lista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_buscar.setText("buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
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

        jComboBox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "RJ", "SP" }));
        jComboBox_estado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_estadoItemStateChanged(evt);
            }
        });
        jComboBox_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_estadoMouseClicked(evt);
            }
        });
        jComboBox_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_estadoActionPerformed(evt);
            }
        });

        jComboBox_cidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cidade" }));

        jComboBox_bairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bairro\t", "Redentor\t", "Eng Pedreira" }));

        jButton_teste.setText("Filtro");
        jButton_teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_testeActionPerformed(evt);
            }
        });

        jTable_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_lista.setCellSelectionEnabled(true);
        jTable_lista.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable_listaComponentAdded(evt);
            }
        });
        jTable_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_listaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_lista);
        jTable_lista.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_desc_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_buscar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jComboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox_cidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_teste)
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_desc_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jButton_buscar))
                .addGap(18, 18, 18)
                .addComponent(jButton_teste)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
    
                 
                 try {
                         stmt1 = con1.prepareStatement("select count(*)as contador from analista where bairro='"+bairro+"'");
                         rs1 = stmt1.executeQuery();
                         if(rs1.next()){
                         conta =Integer.valueOf(rs1.getString("contador"));                        
                         }                                     
                         rs1.close();
                         } catch (SQLException ex) {
                         Logger.getLogger(Testebusca2.class.getName()).log(Level.SEVERE, null, ex);
                         }
                 
                 
                 
      
                  listaSQL = listaSQL.substring(0, listaSQL.length() -1) ;
                  preco1 =0; preco2 =0;
                  String estab = null;
                 for (int x=0; x<=conta-1; x++){
                      estab = "estab";
                      estab = estab +Lista3.get(x) ;
                    try {
                         stmt1 = con1.prepareStatement("Select sum(preco) as total from "+estab+" where id in ("+listaSQL+")");

                         rs1 = stmt1.executeQuery();
                    if(rs1.next()){
                               preco1 = Float.valueOf(rs1.getString("total"));
                         
                               estab1 = estab ;
                            if ((preco2<preco1) && x==1){
                               preco2 = preco1; 
                               estab2 = estab1 ;                    
                            }else if ((preco2 <preco1) && x>1){
                               preco2= preco2 ;
                               estab2 = estab2;
                                                 
                              }else{
                               preco2 = preco1;
                               estab2 = estab1;
                                           
                                   }
                        } 
                        rs1.close();
                     } catch (SQLException ex) {
                         Logger.getLogger(Testebusca2.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 contador=contador+1;
                 cont=String.valueOf(contador);
                 nome2="estab";
                 nome=nome2+cont;
                     
                 }
                 jTextField_resultado.setText(listaSQL);

                 jTextField_resultado.setText("menor preço: "+String.valueOf(preco2)+" encontrado no estab ");

            jTextField_resultado.setText("menor preço: "+String.valueOf(preco2)+" encontrado no estab "+ estab2);


    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jTable_vendaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable_vendaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_vendaComponentAdded

    private void jTable_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_vendaMouseClicked
        if (evt.getClickCount() == 2) {
                   int linha = jTable_venda.getSelectedRow();
            int coluna = linha; // jTable_venda.getSelectedColumn();
            String valor = String.valueOf(jTable_venda.getValueAt(linha,0));
            ListaProd.add(valor);
            listaSQL = listaSQL + String.valueOf(ListaProd.get(contador))+",";
            System.out.println(listaSQL);
            JOptionPane.showMessageDialog(null, "produto adicionado com sucesso");
           
            contador++ ;
            String col = String.valueOf(jTable_venda.getValueAt(linha,1)) ;
            String id = String.valueOf(jTable_venda.getValueAt(linha,0)) ;
            PreencherTabelaLista(id,col);
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
 
    
    private void jComboBox_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_estadoActionPerformed

                    estado = (String) jComboBox_estado.getSelectedItem();
                    
                    
       
            try {
                         stmt1 = con1.prepareStatement("Select * from analista where estado='"+estado+"'");
                         rs1 = stmt1.executeQuery();
                         
                        while(rs1.next()){
                         cidade =rs1.getString("cidade");
                         dominio =rs1.getString("dominio");
                         
                         cidade1.add(cidade);                                       
                        }
                        
                        
                        // rs1.close();
                         } catch (SQLException ex) {
                         Logger.getLogger(Testebusca2.class.getName()).log(Level.SEVERE, null, ex);
                         }
            
             try {
                         stmt1 = con1.prepareStatement("select count(*)as contador from analista where estado='"+estado+"'");
                         rs1 = stmt1.executeQuery();
                         if(rs1.next()){
                         conta2 =Integer.valueOf(rs1.getString("contador"));                        
                         }                                     
                         rs1.close();
                         } catch (SQLException ex) {
                         Logger.getLogger(Testebusca2.class.getName()).log(Level.SEVERE, null, ex);
                         }
                        System.out.println(conta2);
                        for(int x=0;x<=conta2-1;x++)
                        jComboBox_cidade.addItem (String.valueOf( cidade1.get(x)));
                        
    }//GEN-LAST:event_jComboBox_estadoActionPerformed

    private void jComboBox_estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_estadoMouseClicked
        
    
        
    }//GEN-LAST:event_jComboBox_estadoMouseClicked

    private void jComboBox_estadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_estadoItemStateChanged
       
       
    }//GEN-LAST:event_jComboBox_estadoItemStateChanged

    private void jButton_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_testeActionPerformed
            estado = (String) jComboBox_estado.getSelectedItem();
       
            try {
                         stmt1 = con1.prepareStatement("Select * from analista where estado='"+estado+"'");
                         rs1 = stmt1.executeQuery();
                         
                        if(rs1.next()){
                         cidade =rs1.getString("cidade");
                         bairro=rs1.getString("bairro");                                       
                        }
                        // rs1.close();
                         } catch (SQLException ex) {
                         Logger.getLogger(Testebusca2.class.getName()).log(Level.SEVERE, null, ex);
                         }
   //========================================================================================================    
                        try {
                         stmt1 = con1.prepareStatement("select count(*)as contador from analista where bairro='"+bairro+"'");
                         rs1 = stmt1.executeQuery();
                         if(rs1.next()){
                         conta2 =Integer.valueOf(rs1.getString("contador"));                        
                         }                                     
                         rs1.close();
                         } catch (SQLException ex) {
                         Logger.getLogger(Testebusca2.class.getName()).log(Level.SEVERE, null, ex);
                         }
   
   //========================================================================================================
                        try {
                         stmt1 = con1.prepareStatement("Select id from analista where bairro='"+bairro+"'");
                         rs1 = stmt1.executeQuery();
                         System.out.println(bairro);
                        while(rs1.next()){
                         
                         lista2=rs1.getString("id");
                         Lista3.add(lista2);
                        }       
                         rs1.close();
                        } catch (SQLException ex) {
                         Logger.getLogger(Testebusca2.class.getName()).log(Level.SEVERE, null, ex);
                        }     
        
                        
             
        
        
    }//GEN-LAST:event_jButton_testeActionPerformed

    private void jTable_listaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable_listaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_listaComponentAdded
//
//    public void populacombobox(){
//    
//        
//    try{
//    stmt1 = con1.prepareStatement("Select * from analista where estado='"+estado+"'");
//    rs1 = stmt1.executeQuery();
//    }catch(SQLException ex){
//    
//    
//    }
//    
//    
//    
//    }
    private void jTable_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_listaMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = jTable_lista.getSelectedRow();
            int coluna = linha; // jTable_venda.getSelectedColumn();
            System.out.println(ListaProd);
            String valor = String.valueOf(jTable_venda.getValueAt(linha,0));
           
            for(int x=0; x<ListaProd.size(); x++){
                if(ListaProd.get(x) == valor){
                    ListaProd.remove(x);
                }
            }
            System.out.println(ListaProd);
            JOptionPane.showMessageDialog(null, "produto adicionado com sucesso");
           
            contador++ ;
        }
    }//GEN-LAST:event_jTable_listaMouseClicked
public void PreencherTabelaLista(String id, String descricao){
   
       
        String [] Colunas = new String[]{"Codigo","Descrição"};
   
     
                  dados1.add(new Object[]{id, descricao }) ;
             
       
       
           
        ModeloTabela modelo = new ModeloTabela(dados1, Colunas);
        jTable_lista.setModel(modelo);
        jTable_lista.getColumnModel().getColumn(0).setPreferredWidth(93);
        jTable_lista.getColumnModel().getColumn(0).setResizable(false);
        jTable_lista.getColumnModel().getColumn(1).setPreferredWidth(265);
        jTable_lista.getColumnModel().getColumn(1).setResizable(false);
   
     
        jTable_lista.getTableHeader().setReorderingAllowed(false);
        jTable_lista.setAutoResizeMode(jTable_lista.AUTO_RESIZE_OFF);
        jTable_lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
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
            java.util.logging.Logger.getLogger(Testebusca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testebusca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testebusca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testebusca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testebusca2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_teste;
    private javax.swing.JComboBox<String> jComboBox_bairro;
    private javax.swing.JComboBox<String> jComboBox_cidade;
    private javax.swing.JComboBox<String> jComboBox_estado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_lista;
    private javax.swing.JTable jTable_venda;
    private javax.swing.JTextField jTextField_desc_pesq;
    private javax.swing.JTextField jTextField_resultado;
    // End of variables declaration//GEN-END:variables




}
