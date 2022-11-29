package cadastro;

import database.DB;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadConta extends javax.swing.JFrame {

    DB banco = new DB();
    DefaultTableModel model;
    String colunas[] = {"Código", "nome", "Número", "deposito","data","saldo"};

    public CadConta() {
        initComponents();

        model = new DefaultTableModel(null, colunas);
        jTable1.setModel(model);
    }

    public void listar() {
        fieldCodigo.setText("");
        btnome.setText("");
        fieldNumero.setText("");
        fielddeposito.setText("");
        tbdata.setText("");
        

        List<Conta> lista = banco.getContas();

        model.setRowCount(0);
        for (Conta conta : lista) {
            System.out.println(conta);
            model.addRow(new Object[]{conta.getId(),
                conta.getNome(),
                conta.getNumero(),
                  conta.getDeposito(),
                conta.getData(),});
              
        }
        jTable1.setModel(model);
    }

    public Conta selecionaRegistro() {
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex >= 0) {

            Conta contaSelecao = new Conta();
            contaSelecao.setId(Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString()));
            contaSelecao.setNome((model.getValueAt(selectedRowIndex, 1).toString()));
            contaSelecao.setNumero((model.getValueAt(selectedRowIndex, 2).toString()));
            contaSelecao.setDeposito(Double.parseDouble(model.getValueAt(selectedRowIndex, 3).toString()));
            contaSelecao.setData((model.getValueAt(selectedRowIndex, 4).toString()));
            
            return contaSelecao;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item");
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btvalor = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        saldototal = new javax.swing.JButton();
        paraconta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        deconta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        transfere = new javax.swing.JButton();
        btbusca = new javax.swing.JTextField();
        btpesquisa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoInserir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        btnome = new javax.swing.JTextField();
        fieldNumero = new javax.swing.JTextField();
        fielddeposito = new javax.swing.JTextField();
        tbdata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btvalor.setBackground(new java.awt.Color(255, 255, 255));
        btvalor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btvalor.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 70, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 130, -1));

        saldototal.setBackground(new java.awt.Color(0, 204, 204));
        saldototal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saldototal.setForeground(new java.awt.Color(0, 0, 0));
        saldototal.setText("Saldo Conta ");
        getContentPane().add(saldototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 140, -1));

        paraconta.setBackground(new java.awt.Color(255, 255, 255));
        paraconta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paraconta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(paraconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 90, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Para : Conta ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 80, -1));

        deconta.setBackground(new java.awt.Color(255, 255, 255));
        deconta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deconta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(deconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 90, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("De : Conta ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 70, -1));

        transfere.setBackground(new java.awt.Color(0, 204, 204));
        transfere.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfere.setForeground(new java.awt.Color(0, 0, 0));
        transfere.setText("Transfere");
        transfere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfereActionPerformed(evt);
            }
        });
        getContentPane().add(transfere, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        btbusca.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(btbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 110, -1));

        btpesquisa.setBackground(new java.awt.Color(0, 102, 102));
        btpesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btpesquisa.setText("Pesquisar ");
        getContentPane().add(btpesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Data:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 37, 20));

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "numero", "Nome", "Deposito", "Data", "Saldo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 152));

        botaoExcluir.setBackground(new java.awt.Color(153, 0, 0));
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        botaoAlterar.setBackground(new java.awt.Color(0, 102, 102));
        botaoAlterar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        botaoInserir.setBackground(new java.awt.Color(0, 51, 153));
        botaoInserir.setForeground(new java.awt.Color(255, 255, 255));
        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("deposito:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Número:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        fieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        fieldCodigo.setEnabled(false);
        getContentPane().add(fieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 121, -1));

        btnome.setBackground(new java.awt.Color(255, 255, 255));
        btnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnomeActionPerformed(evt);
            }
        });
        btnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnomeKeyPressed(evt);
            }
        });
        getContentPane().add(btnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, -1));

        fieldNumero.setBackground(new java.awt.Color(255, 255, 255));
        fieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNumeroKeyPressed(evt);
            }
        });
        getContentPane().add(fieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, -1));

        fielddeposito.setBackground(new java.awt.Color(255, 255, 255));
        fielddeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielddepositoActionPerformed(evt);
            }
        });
        fielddeposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fielddepositoKeyPressed(evt);
            }
        });
        getContentPane().add(fielddeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 120, -1));

        tbdata.setBackground(new java.awt.Color(255, 255, 255));
        tbdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdataActionPerformed(evt);
            }
        });
        getContentPane().add(tbdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/must2.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 610, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        Conta conta = new Conta();
        conta.setNumero((fieldNumero.getText()));
        conta.setNome(btnome.getText());
        conta.setDeposito(Double.parseDouble(fielddeposito.getText()));
        conta.setData(tbdata.getText());

        banco.insert(conta);

        listar();
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Conta conta = selecionaRegistro();
        if (conta != null) {
            fieldCodigo.setText(String.valueOf(conta.getId()));
            btnome.setText(String.valueOf(conta.getNome()));
            fieldNumero.setText(String.valueOf(conta.getNumero()));
             fielddeposito.setText(String.valueOf(conta.getDeposito()));
             tbdata.setText(String.valueOf(conta.getData()));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        Conta conta = selecionaRegistro();
        if (conta != null) {
            conta = banco.getContaById(Integer.parseInt(fieldCodigo.getText()));
            conta.setNome(btnome.getText());
            conta.setNumero((fieldNumero.getText()));
            conta.setDeposito(Double.parseDouble(fielddeposito.getText()));
            conta.setData(tbdata.getText());
            listar();
            JOptionPane.showMessageDialog(null, "Registro Salvo no Banco de Dados");
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Conta conta = selecionaRegistro();
        if (conta != null) {
            if (banco.delete(conta.getId())) {
                listar();
            }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void tbdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbdataActionPerformed

    private void fielddepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielddepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fielddepositoActionPerformed

    private void transfereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfereActionPerformed
        
        
    }//GEN-LAST:event_transfereActionPerformed

    private void btnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnomeActionPerformed
        
    }//GEN-LAST:event_btnomeActionPerformed

    private void btnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnomeKeyPressed
        if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            fieldNumero.requestFocus();    
        }
    }//GEN-LAST:event_btnomeKeyPressed

    private void fieldNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNumeroKeyPressed
         if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            fielddeposito.requestFocus();    
        }
    }//GEN-LAST:event_fieldNumeroKeyPressed

    private void fielddepositoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fielddepositoKeyPressed
         if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            tbdata.requestFocus();    
        }
    }//GEN-LAST:event_fielddepositoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JTextField btbusca;
    private javax.swing.JTextField btnome;
    private javax.swing.JButton btpesquisa;
    private javax.swing.JTextField btvalor;
    private javax.swing.JTextField deconta;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fielddeposito;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField paraconta;
    private javax.swing.JButton saldototal;
    private javax.swing.JTextField tbdata;
    private javax.swing.JButton transfere;
    // End of variables declaration//GEN-END:variables
}
