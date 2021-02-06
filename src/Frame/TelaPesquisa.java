/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Controle.ControleProdutos;
import DAO.DAOProdutos;
import Model.Produtos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author beatr
 */
public class TelaPesquisa extends javax.swing.JFrame {
    
    ControleProdutos controleProdutos = new ControleProdutos();
    List<Produtos> listaProdutos = new ArrayList<>();

    /**
     * Creates new form TelaCadUsu
     */
    public TelaPesquisa() {
        initComponents();
        carregarProdutos();
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
        PesProdut = new javax.swing.JScrollPane();
        txtPesProdut = new javax.swing.JTextPane();
        Produto = new javax.swing.JTextField();
        BarraPesquisa = new javax.swing.JTextField();
        Tabela = new javax.swing.JScrollPane();
        TabPesProdC = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnPesqEnd = new javax.swing.JButton();
        btnsair2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Produtos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesProdut.setEditable(false);
        txtPesProdut.setBackground(new java.awt.Color(255, 229, 77));
        txtPesProdut.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtPesProdut.setText("          Pesquisa de produto ");
        PesProdut.setViewportView(txtPesProdut);

        jPanel1.add(PesProdut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 330, 40));

        Produto.setEditable(false);
        Produto.setBackground(new java.awt.Color(255, 255, 255));
        Produto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Produto.setText("Pesquise:");
        Produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, -1));

        BarraPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 420, -1));

        TabPesProdC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabPesProdC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TabPesProdC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Empresa", "Produto", "Marca", "Preço"
            }
        ));
        Tabela.setViewportView(TabPesProdC);
        if (TabPesProdC.getColumnModel().getColumnCount() > 0) {
            TabPesProdC.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 620, 240));

        btnPesquisar.setBackground(new java.awt.Color(255, 229, 77));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("");
        btnPesquisar.setActionCommand("");
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 100, 30));

        btnPesqEnd.setBackground(new java.awt.Color(255, 229, 77));
        btnPesqEnd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesqEnd.setText("Pesquisar Endereço da Empresa");
        btnPesqEnd.setToolTipText("");
        btnPesqEnd.setActionCommand("");
        btnPesqEnd.setBorderPainted(false);
        btnPesqEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqEndActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesqEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 220, -1));

        btnsair2.setBackground(new java.awt.Color(255, 229, 77));
        btnsair2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsair2.setText("Sair");
        btnsair2.setToolTipText("");
        btnsair2.setActionCommand("");
        btnsair2.setBorderPainted(false);
        btnsair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsair2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnsair2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisarProduto(BarraPesquisa.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
        private void pesquisarProduto(String descricao){
        DefaultTableModel modelo7 = (DefaultTableModel) TabPesProdC.getModel();
        modelo7.setNumRows(0);
        DAOProdutos pdao = new DAOProdutos();
       
        for(Produtos p: pdao.readForProdutos(descricao)){
           
            modelo7.addRow(new Object[]{
                p.getProId(),
                p.getProEmpresa(),
                p.getProDescricao(),
                p.getProMarca(),
                p.getProPreco()
            });
        }    
    }
    
    private void btnPesqEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqEndActionPerformed
        // TODO add your handling code here:
        TabEndereco objeto9 = new TabEndereco();
        objeto9.setVisible(true);
    }//GEN-LAST:event_btnPesqEndActionPerformed

    private void btnsair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsair2ActionPerformed
        // TODO add your handling code here:
        TelaLogin objeto9 = new TelaLogin();
        objeto9.setVisible(true);
    }//GEN-LAST:event_btnsair2ActionPerformed
    
    private void carregarProdutos(){
        listaProdutos = controleProdutos.getListaProdutosControle();
        DefaultTableModel modelo4 = (DefaultTableModel) TabPesProdC.getModel();
        modelo4.setNumRows(0);
        
        for (int i = 0; i < listaProdutos.size(); i++){
            modelo4.addRow(new Object[]{
                listaProdutos.get(i).getProId(),
                listaProdutos.get(i).getProEmpresa(),
                listaProdutos.get(i).getProDescricao(),
                listaProdutos.get(i).getProMarca(),
                listaProdutos.get(i).getProPreco()
            });
        }
        
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
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraPesquisa;
    private javax.swing.JScrollPane PesProdut;
    private javax.swing.JTextField Produto;
    private javax.swing.JTable TabPesProdC;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnPesqEnd;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnsair2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane txtPesProdut;
    // End of variables declaration//GEN-END:variables
}
