
import javax.swing.table.DefaultTableModel;


public class StokUygulamasi extends javax.swing.JFrame {

    
    public StokUygulamasi() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_urun_ismi = new javax.swing.JTextField();
        cb_kategori = new javax.swing.JComboBox<>();
        tf_fiyat = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        urun_tablosu = new javax.swing.JTable();
        ekle_butonu = new javax.swing.JButton();
        guncelle_butonu = new javax.swing.JButton();
        sil_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ürün İsmi : ");

        jLabel2.setText("Kategori : ");

        jLabel3.setText("Fiyat :");

        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kültür Sanat", "Yemek", "Elektronik" }));

        tf_fiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fiyatActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 51));

        urun_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        ));
        urun_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urun_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urun_tablosu);

        ekle_butonu.setText("Ürün Ekle");
        ekle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonuActionPerformed(evt);
            }
        });

        guncelle_butonu.setText("Ürün Güncelle");
        guncelle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonuActionPerformed(evt);
            }
        });

        sil_butonu.setText("Ürün Sil");
        sil_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_urun_ismi)
                            .addComponent(cb_kategori, 0, 155, Short.MAX_VALUE)
                            .addComponent(tf_fiyat))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ekle_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guncelle_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(sil_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_urun_ismi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekle_butonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle_butonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil_butonu))
                .addGap(18, 18, 18)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void tf_fiyatActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void ekle_butonuActionPerformed(java.awt.event.ActionEvent evt) {
        mesaj_yazisi.setText("");
        DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
        
        if (tf_urun_ismi.getText().trim().equals("")) {
            
            mesaj_yazisi.setText("Ürün ismi boş bırakılamaz...");
        }
        else {
            Object[] eklenecek = {tf_urun_ismi.getText(),cb_kategori.getSelectedItem().toString(),tf_fiyat.getText()};
            
            model.addRow(eklenecek);
            
        }
        
        
        
    }

    private void guncelle_butonuActionPerformed(java.awt.event.ActionEvent evt) {
        mesaj_yazisi.setText("");
        
        DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        if (secili_row == -1) {
            
            if (urun_tablosu.getRowCount() == 0 ) {
                
                mesaj_yazisi.setText("Ürün tablosu şu anda boş....");
            }
            else {
                
                mesaj_yazisi.setText("Lütfen güncellenecek bir ürün seçin...");
            }
        }
        else {
            
            model.setValueAt(tf_urun_ismi.getText(),secili_row,0);
            model.setValueAt(cb_kategori.getSelectedItem().toString(),secili_row,1);
            
            model.setValueAt(tf_fiyat.getText(),secili_row,2);
            
            mesaj_yazisi.setText("Ürün başarıyla güncellendi...");
            
        }
        
    }

    private void urun_tablosuMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        tf_urun_ismi.setText(model.getValueAt(secili_row,0).toString());
        cb_kategori.setSelectedItem(model.getValueAt(secili_row,1).toString());
        tf_fiyat.setText(model.getValueAt(secili_row,2).toString());
        
    }

    private void sil_butonuActionPerformed(java.awt.event.ActionEvent evt) {
        mesaj_yazisi.setText("");
        
        DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        if (secili_row == -1) {
            if (urun_tablosu.getRowCount() == 0 ) {
                
                mesaj_yazisi.setText("Ürün tablosu şu anda boş...");
            }
            else {
                
                mesaj_yazisi.setText("Lütfen silinecek bir ürün seçin...");
            }
        }
        else {
            
            model.removeRow(secili_row);
            
            mesaj_yazisi.setText("Ürün başarıyla silindi...");
        }

        
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    
    private javax.swing.JComboBox<String> cb_kategori;
    private javax.swing.JButton ekle_butonu;
    private javax.swing.JButton guncelle_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil_butonu;
    private javax.swing.JTextField tf_fiyat;
    private javax.swing.JTextField tf_urun_ismi;
    private javax.swing.JTable urun_tablosu;
    
}
