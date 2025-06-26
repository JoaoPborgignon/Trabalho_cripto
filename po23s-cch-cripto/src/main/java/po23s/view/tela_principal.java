package po23s.view;


import po23s.http.ClienteHttp;
import po23s.model.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

// classe principal da interface, herda da JFrame
public class tela_principal extends javax.swing.JFrame {
   
    // array que guarda objetos Moeda (com nome, valor de compra e venda)
    ArrayList<Moeda> listaDeMoedas = new ArrayList<>();

    // listas gráficas (uma pra cada campo da moeda)
    DefaultListModel<String> lista_ticker = new DefaultListModel<>();
    DefaultListModel<String> lista_venda = new DefaultListModel<>();
    DefaultListModel<String> lista_compra = new DefaultListModel<>();

    // construtor
    public tela_principal() {
        initComponents(); // inicializa todos os componentes da interface
        getContentPane().setBackground(new java.awt.Color(27, 27, 27)); // define cor de fundo da janela
    }

    private void initComponents() {

        //inicia tudo
        txt_ticker = new javax.swing.JTextField();
        button_add = new javax.swing.JButton();
        button_update = new javax.swing.JButton();
        button_remove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_ticker = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_venda = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList_compra = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();

        // define o comportamento padrão ao fechar a janela (encerra o programa)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(27, 27, 27));


        button_add.setBackground(new java.awt.Color(255, 163, 26));
        button_add.setText("Adicionar");
        button_add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
       
        // define as ações do add ao sere clicado
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_update.setBackground(new java.awt.Color(255, 163, 26));
        button_update.setText("Atualizar");
        button_update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // define as ações do update ao sere clicado
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        button_remove.setBackground(new java.awt.Color(255, 163, 26));
        button_remove.setText("Remover");
        button_remove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // define as ações do remove ao sere clicado
        button_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_removeActionPerformed(evt);
            }
        });

        jList_ticker.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectLinha(evt, "ticker");
            }
        });
        jList_venda.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectLinha(evt, "venda");
            }
        });
        jList_compra.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectLinha(evt, "compra");
            }
        });
        
        //lista do ticker
        jList_ticker.setBackground(new java.awt.Color(178, 178, 178));
        jList_ticker.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList_ticker.setModel(lista_ticker);
        jScrollPane2.setViewportView(jList_ticker);

        // lista do venda
        jList_venda.setBackground(new java.awt.Color(178, 178, 178));
        jList_venda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList_venda.setModel(lista_venda);
        jScrollPane4.setViewportView(jList_venda);

        // lista do compra
        jList_compra.setBackground(new java.awt.Color(178, 178, 178));
        jList_compra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList_compra.setModel(lista_compra);
        jScrollPane5.setViewportView(jList_compra);

        // texto do ticker
        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ticker");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // texto do compra
        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Compra");
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // texto do venda
        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Venda");
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // texto no topo do ticker, que indica o nome da moeda
        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(27, 27, 27));
        jTextField4.setForeground(new java.awt.Color(255, 163, 26));
        jTextField4.setText("      Ticker");
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ticker, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(button_add, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_update, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_remove, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ticker)
                    .addComponent(button_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {
        // primeiro checa se tem pelo menos 2 caracteres
        if (txt_ticker.getText().length() < 2) {
            // abre uma janela de erro se o input for muito curto
            Jdialog_caracteres caracteres = new Jdialog_caracteres(this, false);
            caracteres.setVisible(true);
        } else {
            // cria objeto http e busca os dados da moeda digitada
            ClienteHttp novo = new ClienteHttp();
            String novoLink = novo.buscaDados(Util.link(txt_ticker.getText()));

            try {
                // tenta construir um objeto moeda com os dados recebidos
                Moeda proximaMoeda = new Moeda(novoLink, this);

                // só adiciona a moeda se ela ainda não estiver na lista
                if (Util.isOnArray(proximaMoeda, listaDeMoedas) == false) {
                    listaDeMoedas.add(proximaMoeda); // adiciona ao ArrayList
                    addMoedaTolista(proximaMoeda);   // adiciona às listas visuais
                }

                // limpa o campo de texto depois de adicionar
                txt_ticker.setText("");
            } catch (Exception e) {
                // se não conseguir criar a moeda, mostra um jdialog avisando o usuario
                txt_ticker.setText("");
                Jdialog_nao_encontrado nao_encontrado = new Jdialog_nao_encontrado(this, true);
                nao_encontrado.setVisible(true);
            }
    }
}


    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        // guarda o tamanho do array
        int tamanho = listaDeMoedas.size();

        // adiciona uma copia do array, após consultar a api novamente para todas as moedas, no final do array
        for (int i = 0; i < tamanho; i++) {
            ClienteHttp atualizar = new ClienteHttp();
            String atualizarLink = atualizar.buscaDados(Util.link(listaDeMoedas.get(i).getNomeMoeda()));
            try {
                Moeda temp = new Moeda(atualizarLink, this);
                listaDeMoedas.add(temp);
            } catch (Exception e) {
                txt_ticker.setText("");

                Jdialog_nao_encontrado nao_encontrado = new Jdialog_nao_encontrado(this, true);
                nao_encontrado.setVisible(true);
            }
            
        }

        // remove os elementos iniciais do array, deixando apena os atualizados
        listaDeMoedas.subList(0, tamanho).clear();

        // apaga lista
        lista_ticker.clear();
        lista_venda.clear();
        lista_compra.clear();
        
        for (int i = 0; i < tamanho; i++) {
            addMoedaTolista(listaDeMoedas.get(i));
        }
        
        popup_atualizar popup = new popup_atualizar(this, false);
        popup.setVisible(true);

    }//GEN-LAST:event_button_updateActionPerformed

    private void button_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_removeActionPerformed
        int idxTicker = jList_ticker.getSelectedIndex();
        int idxVenda = jList_venda.getSelectedIndex();
        int idxCompra = jList_compra.getSelectedIndex();

        if (idxTicker >=0 && idxVenda >=0 && idxCompra >= 0) {
            lista_ticker.removeElementAt(idxTicker);
            lista_venda.removeElementAt(idxVenda);
            lista_compra.removeElementAt(idxCompra);
            listaDeMoedas.remove(idxCompra);
        }else{
          Jdialog_remover dJdialog_remover = new Jdialog_remover(this, true);
          dJdialog_remover.setVisible(true);
        }
       
        
    }//GEN-LAST:event_button_removeActionPerformed


    private void selectLinha(javax.swing.event.ListSelectionEvent evt, String nome) {
        JList<?> lista = (JList<?>) evt.getSource();
        int index = lista.getSelectedIndex();

        if (nome == "ticker") {
           jList_venda.setSelectedIndex(index);
           jList_compra.setSelectedIndex(index);
        }
        if (nome == "venda") {
            jList_ticker.setSelectedIndex(index);
            jList_compra.setSelectedIndex(index);
        }
        if (nome == "compra") {
        jList_ticker.setSelectedIndex(index);
           jList_venda.setSelectedIndex(index);

        }
    }
    
    private void addMoedaTolista(Moeda coin){
        lista_ticker.addElement(coin.getNomeMoeda());
        lista_compra.addElement(coin.getCompraMoeda());
        lista_venda.addElement(coin.getVendaMoeda());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_remove;
    private javax.swing.JButton button_update;


    private javax.swing.JList<String> jList_compra;
    private javax.swing.JList<String> jList_ticker;
    private javax.swing.JList<String> jList_venda;

    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;

    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txt_ticker;
    // End of variables declaration//GEN-END:variables
}
