package EP3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author douglasjtds
 */
public class TelaInserirReporter extends javax.swing.JFrame {

    private ArrayList<Reporter> listaDeReporter;
    
    /**
     * Creates new form TelaInserirReporter
     * @param listaDeReporter
     */
    
    public TelaInserirReporter(ArrayList<Reporter> listaDeReporter) {
        initComponents();
        this.listaDeReporter = listaDeReporter;
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
        CampoNomeReporter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoIdReporter = new javax.swing.JTextField();
        botaoCadastrarReporter = new java.awt.Button();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Reporter");

        jLabel1.setText("Nome completo:");

        jLabel2.setText("Adicione as informações do novo repórter:");

        CampoNomeReporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeReporterActionPerformed(evt);
            }
        });

        jLabel3.setText("Id:");

        CampoIdReporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdReporterActionPerformed(evt);
            }
        });

        botaoCadastrarReporter.setLabel("Cadastrar");
        botaoCadastrarReporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarReporterActionPerformed(evt);
            }
        });

        button1.setLabel("Cancelar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(botaoCadastrarReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CampoNomeReporter, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoIdReporter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoNomeReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoIdReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCadastrarReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarReporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarReporterActionPerformed
        //Cadastrar um novo reporter:
        Reporter rep = new Reporter(CampoNomeReporter.getText(), new Integer (CampoIdReporter.getText()));
        listaDeReporter.add(rep);
        JOptionPane.showMessageDialog(null, "Repórter " + rep.getNomeCompletoReporter() + "cadastrado com sucesso.");
        CampoNomeReporter.setText("");
        CampoIdReporter.setText("");        
    }//GEN-LAST:event_botaoCadastrarReporterActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void CampoNomeReporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeReporterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeReporterActionPerformed

    private void CampoIdReporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdReporterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdReporterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoIdReporter;
    private javax.swing.JTextField CampoNomeReporter;
    private java.awt.Button botaoCadastrarReporter;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
