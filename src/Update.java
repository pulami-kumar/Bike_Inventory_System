
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kumar
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updatePanel = new javax.swing.JPanel();
        bikeIDLabel = new javax.swing.JLabel();
        manufacturerLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        colourLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        bikeIDText = new javax.swing.JTextField();
        manufacturerText = new javax.swing.JTextField();
        modelText = new javax.swing.JTextField();
        colourText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        categoryComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Bike Information");

        updatePanel.setLayout(null);

        bikeIDLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bikeIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        bikeIDLabel.setText("Bike ID");
        updatePanel.add(bikeIDLabel);
        bikeIDLabel.setBounds(50, 60, 60, 14);

        manufacturerLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        manufacturerLabel.setForeground(new java.awt.Color(255, 255, 255));
        manufacturerLabel.setText("Manufacturer");
        updatePanel.add(manufacturerLabel);
        manufacturerLabel.setBounds(50, 110, 100, 14);

        modelLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(255, 255, 255));
        modelLabel.setText("Model");
        updatePanel.add(modelLabel);
        modelLabel.setBounds(50, 160, 70, 14);

        categoryLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        categoryLabel.setText("Category");
        updatePanel.add(categoryLabel);
        categoryLabel.setBounds(50, 210, 80, 14);

        colourLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        colourLabel.setForeground(new java.awt.Color(255, 255, 255));
        colourLabel.setText("Colour");
        updatePanel.add(colourLabel);
        colourLabel.setBounds(50, 260, 60, 14);

        priceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Price");
        updatePanel.add(priceLabel);
        priceLabel.setBounds(50, 310, 60, 14);
        updatePanel.add(bikeIDText);
        bikeIDText.setBounds(170, 50, 130, 30);

        manufacturerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerTextActionPerformed(evt);
            }
        });
        updatePanel.add(manufacturerText);
        manufacturerText.setBounds(170, 100, 130, 30);

        modelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTextActionPerformed(evt);
            }
        });
        updatePanel.add(modelText);
        modelText.setBounds(170, 150, 130, 30);
        updatePanel.add(colourText);
        colourText.setBounds(170, 250, 130, 30);

        priceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextActionPerformed(evt);
            }
        });
        updatePanel.add(priceText);
        priceText.setBounds(170, 300, 130, 30);

        updateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        updatePanel.add(updateButton);
        updateButton.setBounds(140, 360, 80, 30);

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        updatePanel.add(clearButton);
        clearButton.setBounds(250, 360, 80, 30);

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Street", "Sports", "Nacked", "Cruisers", "Off-Road" }));
        updatePanel.add(categoryComboBox);
        categoryComboBox.setBounds(170, 200, 130, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/manipulate.jpg"))); // NOI18N
        updatePanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int bikeID= 0, price=0;
        String bikeIDTxt = bikeIDText.getText();
        String manufacturer = manufacturerText.getText();
        String model = modelText.getText();
        String category = (String) categoryComboBox.getSelectedItem();        
        String colour = colourText.getText();        
        String priceTxt = priceText.getText();
        if(bikeIDTxt.isEmpty() || manufacturer.isEmpty() || model.isEmpty() || category.equals("None") || colour.isEmpty() || priceTxt.isEmpty()){
            JOptionPane.showMessageDialog(updatePanel, "Please, Fill up all the above fields.");  
        }else{        
            try{
                bikeID = Integer.parseInt(bikeIDTxt);
                price = Integer.parseInt(priceTxt);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(updatePanel, "Please, Enter Bike Number/ Price in number format.");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(updatePanel, "Error:" + ex);
            }
            if (bikeID<=0 || price<=0){
                JOptionPane.showMessageDialog(updatePanel, "Please, Enter the Bike Number/ Price value greater than 0");                
            }else{   
                boolean sucessfull = BikeInfo.updateInformation(bikeIDTxt, manufacturer, model, category, colour, priceTxt);
                if (sucessfull){
                    dispose();
                    BikeInfo.setterUpdateWindowStatus(); 
                }                
            }
        } 
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        bikeIDText.setText(null);
        manufacturerText.setText(null);
        modelText.setText(null);
        categoryComboBox.setSelectedItem("Select");        
        colourText.setText(null);        
        priceText.setText(null);        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void modelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTextActionPerformed

    private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextActionPerformed

    private void manufacturerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerTextActionPerformed

    
    public void setValueAtField(String bikeNo, String manufacturer, String model, String category, String colour, String price){
        bikeIDText.setText(""+ bikeNo);
        manufacturerText.setText(""+ manufacturer);
        modelText.setText(""+ model);
        categoryComboBox.setSelectedItem(category);
        colourText.setText(""+ colour);
        priceText.setText(""+ price);        
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bikeIDLabel;
    private javax.swing.JTextField bikeIDText;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel colourLabel;
    private javax.swing.JTextField colourText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JTextField manufacturerText;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelText;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}