/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.senactech.NLivrariaDAO.model.cliente;
import br.com.senactech.NLivrariaDAO.services.clienteServices;
import br.com.senactech.NLivrariaDAO.services.servicesFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static tlivrariaoojf.TLivrariaOOJF.cadClientes;

/**
 *
 * @author jairb
 */
public class jfCliente extends javax.swing.JFrame {

    /**
     * Creates new form jfCliente
     */
    public jfCliente() {
        initComponents();
        addRowToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCpfCnpj = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jrbCpf = new javax.swing.JRadioButton();
        jrbCnpj = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNomeCliente = new javax.swing.JTextField();
        jtfCpfCnpj = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Cliente");

        jLabel2.setText("Nome Cliente:");

        bgCpfCnpj.add(jrbCpf);
        jrbCpf.setText("CPF");
        jrbCpf.setToolTipText("");

        bgCpfCnpj.add(jrbCnpj);
        jrbCnpj.setText("CNPJ");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Telefone:");

        jtfNomeCliente.setToolTipText("");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idCliente", "Nome", "CPF", "CNPJ", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtClientes.setToolTipText("");
        jScrollPane2.setViewportView(jtClientes);
        jtClientes.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbCnpj))
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNomeCliente)
                            .addComponent(jtfEndereco)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCpf)
                    .addComponent(jrbCnpj)
                    .addComponent(jtfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jtfNomeCliente.getAccessibleContext().setAccessibleName("");

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

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        jtfNomeCliente.setText("");
        jtfCpfCnpj.setText("");
        jtfEndereco.setText("");
        jtfTelefone.setText("");
        bgCpfCnpj.clearSelection();
        jtfNomeCliente.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        jfCliente.this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel) jtClientes.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[6];//define vetor das colunas
        for (cliente listCli: cadClientes.getClientes()){
            rowData[0] = listCli.getIdCliente();
            rowData[1] = listCli.getNomeCliente();
            rowData[2] = listCli.getCpf();
            rowData[3] = listCli.getCnpj();
            rowData[4] = listCli.getTelefone();
            rowData[5] = listCli.getEndereco();
            model.addRow(rowData);
        }
        
    }
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        cliente cli = new cliente();
        cli.setNomeCliente(jtfNomeCliente.getText());
        cli.setTelefone(jtfTelefone.getText());
        cli.setEndereco(jtfEndereco.getText());
        boolean doc = false;

        int tPessoa = 0;
        if (jrbCpf.isSelected() && !jrbCnpj.isSelected()) {
            tPessoa = 1;
        } else if (!jrbCpf.isSelected() && jrbCnpj.isSelected()) {
            tPessoa = 2;
        }else{
            JOptionPane.showMessageDialog(this, "Selecione tipo de cliente.");
        }
        cliente cliCpfCnpj;
        cliCpfCnpj = cadClientes.pesqCli(tPessoa, jtfCpfCnpj.getText());
        if (jrbCpf.isSelected() && cliCpfCnpj.getCpf() == null) {
            cli.setCpf(jtfCpfCnpj.getText());
            cli.setCnpj(null);
            doc = false;
        } else if (jrbCnpj.isSelected() && cliCpfCnpj.getCnpj() == null) {
            cli.setCpf(null);
            cli.setCnpj(jtfCpfCnpj.getText());
            doc = false;
        }
        if (cadClientes.verificaCliente(cliCpfCnpj.getIdCliente())) {
            JOptionPane.showMessageDialog(this, "Este documento já existe!"
                    + "\nTente novamente!!!");
            doc = true;
        }
        //Cadastro a partir das validações
        if ((jrbCpf.isSelected() || jrbCnpj.isSelected()) && !doc && !jtfNomeCliente.getText().isEmpty() && !jtfCpfCnpj.getText().isEmpty()) {
            cli.setIdCliente(cadClientes.addIdCli());
            //cadClientes.addCliente(cli);
            clienteServices cliS = servicesFactory.getclienteServices();
            try {
                cliS.cadClienteBD(cli);
            } catch (SQLException ex) {
                Logger.getLogger(jfCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            addRowToTable();
            jbLimpar.doClick();
            JOptionPane.showMessageDialog(this, cli.getNomeCliente() + " cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Cadastro incompleto.");
        }
        
    }//GEN-LAST:event_jbSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCpfCnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JRadioButton jrbCnpj;
    private javax.swing.JRadioButton jrbCpf;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField jtfCpfCnpj;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNomeCliente;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables

}
