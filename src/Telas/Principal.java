package Telas;

import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagens/iconserie.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        area_interna = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_filmes = new javax.swing.JMenu();
        add_filme = new javax.swing.JMenuItem();
        m_alterarfilme = new javax.swing.JMenuItem();
        exibir_filme = new javax.swing.JMenuItem();
        menu_serie = new javax.swing.JMenu();
        add_serie = new javax.swing.JMenuItem();
        m_alterserie = new javax.swing.JMenuItem();
        exibir_serie = new javax.swing.JMenuItem();
        menu_pesquisar = new javax.swing.JMenu();
        menu_sobre = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Filmes & Séries");
        setResizable(false);

        area_interna.setBackground(new java.awt.Color(204, 204, 204));
        area_interna.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout area_internaLayout = new javax.swing.GroupLayout(area_interna);
        area_interna.setLayout(area_internaLayout);
        area_internaLayout.setHorizontalGroup(
            area_internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        area_internaLayout.setVerticalGroup(
            area_internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        menu_filmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfilme.png"))); // NOI18N
        menu_filmes.setText("Filmes");

        add_filme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        add_filme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon3.png"))); // NOI18N
        add_filme.setText("Adicionar Filme");
        add_filme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_filmeActionPerformed(evt);
            }
        });
        menu_filmes.add(add_filme);

        m_alterarfilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        m_alterarfilme.setText("Alterar Filme");
        m_alterarfilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_alterarfilmeActionPerformed(evt);
            }
        });
        menu_filmes.add(m_alterarfilme);

        exibir_filme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lista.png"))); // NOI18N
        exibir_filme.setText("Exibir Filmes");
        exibir_filme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibir_filmeActionPerformed(evt);
            }
        });
        menu_filmes.add(exibir_filme);

        jMenuBar1.add(menu_filmes);

        menu_serie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/netflix.png"))); // NOI18N
        menu_serie.setText("Séries");

        add_serie.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        add_serie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/netflix.png"))); // NOI18N
        add_serie.setText("Adicionar Série");
        add_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_serieActionPerformed(evt);
            }
        });
        menu_serie.add(add_serie);

        m_alterserie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        m_alterserie.setText("Alterar Série");
        m_alterserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_alterserieActionPerformed(evt);
            }
        });
        menu_serie.add(m_alterserie);

        exibir_serie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lista.png"))); // NOI18N
        exibir_serie.setText("Exibir Séries");
        exibir_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibir_serieActionPerformed(evt);
            }
        });
        menu_serie.add(exibir_serie);

        jMenuBar1.add(menu_serie);

        menu_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisa.png"))); // NOI18N
        menu_pesquisar.setText("Pesquisar");
        menu_pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_pesquisarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_pesquisar);

        menu_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/about.png"))); // NOI18N
        menu_sobre.setText("Sobre");
        menu_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sobreMouseClicked(evt);
            }
        });
        menu_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(area_interna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(area_interna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_serieActionPerformed

        NovoSerie novoserie = new NovoSerie();
        area_interna.add(novoserie);
        novoserie.setVisible(true);
    }//GEN-LAST:event_add_serieActionPerformed

    private void add_filmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_filmeActionPerformed

        NovoFilme novofilme = new NovoFilme();
        area_interna.add(novofilme);
        novofilme.setVisible(true);


    }//GEN-LAST:event_add_filmeActionPerformed

    private void menu_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sobreActionPerformed

    }//GEN-LAST:event_menu_sobreActionPerformed

    private void exibir_filmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibir_filmeActionPerformed

        ExibirFilmes exibirfilmes = new ExibirFilmes();
        area_interna.add(exibirfilmes);
        exibirfilmes.setVisible(true);

    }//GEN-LAST:event_exibir_filmeActionPerformed

    private void exibir_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibir_serieActionPerformed

        ExibirSeries exibirseries = new ExibirSeries();
        area_interna.add(exibirseries);
        exibirseries.setVisible(true);

    }//GEN-LAST:event_exibir_serieActionPerformed

    private void menu_sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sobreMouseClicked

        Sobre sobre = new Sobre();
        area_interna.add(sobre);
        sobre.setVisible(true);

    }//GEN-LAST:event_menu_sobreMouseClicked

    private void m_alterserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_alterserieActionPerformed
        AlterarSerie alterarserie = new AlterarSerie();
        area_interna.add(alterarserie);
        alterarserie.setVisible(true);
    }//GEN-LAST:event_m_alterserieActionPerformed

    private void m_alterarfilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_alterarfilmeActionPerformed
        AlterarFilme alterarfilme = new AlterarFilme();
        area_interna.add(alterarfilme);
        alterarfilme.setVisible(true);
    }//GEN-LAST:event_m_alterarfilmeActionPerformed

    private void menu_pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_pesquisarMouseClicked
        PesquisarTodos pesquisartodos = new PesquisarTodos();
        area_interna.add(pesquisartodos);
        pesquisartodos.setVisible(true);
    }//GEN-LAST:event_menu_pesquisarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_filme;
    private javax.swing.JMenuItem add_serie;
    private javax.swing.JDesktopPane area_interna;
    private javax.swing.JMenuItem exibir_filme;
    private javax.swing.JMenuItem exibir_serie;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem m_alterarfilme;
    private javax.swing.JMenuItem m_alterserie;
    private javax.swing.JMenu menu_filmes;
    private javax.swing.JMenu menu_pesquisar;
    private javax.swing.JMenu menu_serie;
    private javax.swing.JMenu menu_sobre;
    // End of variables declaration//GEN-END:variables
}
