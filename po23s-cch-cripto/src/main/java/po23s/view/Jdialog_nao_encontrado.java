
package po23s.view;

public class Jdialog_nao_encontrado extends javax.swing.JDialog {
    private final java.awt.Frame parent;
    
    public Jdialog_nao_encontrado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent; // guarda a referência
        initComponents();
    }
    

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 163, 26));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ticker não encontrado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(parent); // centraliza na janela principal
    
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                dispose(); // Fecha o JDialog após 4 segundos
            }
        }, 1000);
    }
    

    private javax.swing.JLabel jLabel1;
   
}
