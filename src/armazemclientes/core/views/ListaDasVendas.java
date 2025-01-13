/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package armazemclientes.core.views;

import armazemclientes.core.controlador.VendaControlador;
import armazemclientes.core.dao.conexao.ConexaoJDBC;
import armazemclientes.core.entidade.VendaEntidade;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author CLIENTE
 */
public class ListaDasVendas extends javax.swing.JFrame {

    private List<VendaEntidade> banco;
    private DefaultTableModel model;
    /**
     * Creates new form ListaDasVendas
     */
    public ListaDasVendas() {
        initComponents();
        banco = new VendaControlador().listarVendas();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        for(VendaEntidade venda : banco){
            model.addRow(new String [] {"" + venda.getId(), "" + venda.getValorVenda(), "" + venda.getFp()});
        }
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
        valor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botaoFechamento = new javax.swing.JButton();
        botaoDeletar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Feedback financeiro");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Lucro Total:");

        valor.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Venda", "FormaPagamento"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        botaoFechamento.setBackground(new java.awt.Color(102, 255, 51));
        botaoFechamento.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botaoFechamento.setText("Fechamento diário");
        botaoFechamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFechamentoActionPerformed(evt);
            }
        });

        botaoDeletar.setBackground(new java.awt.Color(204, 255, 204));
        botaoDeletar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botaoDeletar.setText("Cancelar venda");
        botaoDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        jMenu1.setText("RETORNAR");
        jMenu1.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N

        jMenuItem1.setText("REGISTRAR VENDA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        
    }//GEN-LAST:event_valorActionPerformed

    private void botaoFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFechamentoActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        if(jTable2.getSelectedRowCount() > 1){
            int result = JOptionPane.showConfirmDialog(null, "Deseja calcular o lucro total?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                double total=0;
                int[] getSelectedRows = jTable2.getSelectedRows();
                for(int i = 0; i < jTable2.getSelectedRows().length; i++){
                    double calculation = Double.parseDouble((String) jTable2.getValueAt(getSelectedRows[i], 1).toString());
                    total+=calculation;
                }
                valor.setText(String.valueOf("R$" + total));
            }
            else if(result == JOptionPane.NO_OPTION){}
            else if(result == JOptionPane.CANCEL_OPTION){}
        }
    }//GEN-LAST:event_botaoFechamentoActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        if(jTable2.getSelectedRowCount() == 1){
            int response = JOptionPane.showConfirmDialog(null, "Deseja cancelar a venda?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                int row = jTable2.getSelectedRow();
                String cell = jTable2.getModel().getValueAt(row, 0).toString();
                String sql = "DELETE FROM DADOSVENDA WHERE IDDADOSVENDA="+ cell;
                PreparedStatement ps;
                try{

                    ps = ConexaoJDBC.getConexao().prepareStatement(sql);
                    ps.execute();

                }catch(SQLException e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao cancelar a venda!");
                }
                JOptionPane.showMessageDialog(null, "Venda cancelada com sucesso!");
                model.removeRow(jTable2.getSelectedRow());
            }
            else if(response == JOptionPane.NO_OPTION){

            }else if(response == JOptionPane.CANCEL_OPTION){}
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InterfaceDireta interD = new InterfaceDireta();
        interD.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDasVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoFechamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}