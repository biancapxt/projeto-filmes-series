/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controller.c_Filme;
import javax.swing.table.DefaultTableModel;

public class PesquisarFilme extends javax.swing.JInternalFrame {

    DefaultTableModel tabela;

    public PesquisarFilme() {
        initComponents();
        tabela = new DefaultTableModel();
        tabela.addColumn("id");
        tabela.addColumn("Nome");
        tabela.addColumn("Genero");
        tabela.addColumn("Ano");
        tabela.addColumn("Assistido");
        tb_filme.setModel(tabela);
        pesquisar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_filme = new javax.swing.JTable();
        tf_pesquisa = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Pesquisar Filme");

        tb_filme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_filme);

        tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisaActionPerformed(evt);
            }
        });

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tf_pesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(bt_pesquisar)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        limparTabela();
        String dados[][] = c_Filme.Pesquisar(tf_pesquisa.getText()).clone();
        for (int i = 0; i < dados.length; i++) {
            tabela.addRow(new String[]{dados[i][0], dados[i][1], dados[i][2], dados[i][3], dados[i][4]});
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void tf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_filme;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables

    public void pesquisar() {
        String dados[][] = c_Filme.Pesquisar().clone();
        for (int i = 0; i < dados.length; i++) {
            tabela.addRow(new String[]{dados[i][0], dados[i][1], dados[i][2], dados[i][3], dados[i][4]});
        }
    }

    public void limparTabela() {
        for (int i = tabela.getRowCount() - 1; i >= 0; i--) {
            tabela.removeRow(i);
        }
    }

}
