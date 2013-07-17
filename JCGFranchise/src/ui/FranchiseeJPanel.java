/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bp.*;
import ui.*;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Davidi
 */
public class FranchiseeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FranchisorJPanel
     */
    
    private JPanel content;
    
    public FranchiseeJPanel() {
        initComponents();
        jComboBox1.setSelectedIndex(0);
        changeContent();
    }
    
    public void setContent(JPanel c)
    {
        //This function erases the panel on the right and shows c instead of what was there.
        FlowLayout layout = new FlowLayout();
        contentPanel.setLayout(layout);
        if(content != null)
        {
            content.setVisible(false);
            contentPanel.remove(content);
        }
        
        content = null;  //Erase from memory
        content = c;
        
        contentPanel.add(content);
        content.setVisible(true);
    }
    private void changeContent()
    {
        //Changes the content based on selection of jComboBox1 and list
        
            if(jComboBox1.getSelectedIndex() == 0)  //Reservations
            {
                if (list.getSelectedIndex() == -1) {
                    //no selection so display overview
                    setContent(new ReservationsOverviewPanel());
                }
                if (list.getSelectedIndex() == 0){
                    setContent(new CreateReservationsJPanel(0));
                }
                if (list.getSelectedIndex() == 1){
                    setContent(new CreateReservationsJPanel(1));
                }
                if (list.getSelectedIndex() == 2){
                    setContent(new CreateReservationsJPanel(2));
                }
                if (list.getSelectedIndex() == 3){
                    setContent(new ReservationsOverviewPanel());
                }
          }
          if(jComboBox1.getSelectedIndex() == 1)  //Drivers
            {
                if (list.getSelectedIndex() == -1) {
                    //no selection so display overview
                    setContent(new DriversOverviewPanel());
                }
                if (list.getSelectedIndex() == 0){
                    setContent(new CreateEmployeeJPanel(0, true));
                }
                if (list.getSelectedIndex() == 1){
                    setContent(new CreateEmployeeJPanel(1, true));
                }
                if (list.getSelectedIndex() == 2){
                    setContent(new CreateEmployeeJPanel(2, true));
                }
                if (list.getSelectedIndex() == 3){
                    setContent(new DriversOverviewPanel());
                }
          }
          if(jComboBox1.getSelectedIndex() == 2)  //Vehicles
            {
                if (list.getSelectedIndex() == -1) {
                    //no selection so display overview
                    setContent(new VehiclesOverviewPanel());
                }
                if (list.getSelectedIndex() == 0){
                    setContent(new CreateVehicleJPanel(0));
                }
                if (list.getSelectedIndex() == 1){
                    setContent(new CreateVehicleJPanel(1));
                }
                if (list.getSelectedIndex() == 2){
                    setContent(new CreateVehicleJPanel(2));
                }
                if (list.getSelectedIndex() == 3){
                    setContent(new VehiclesOverviewPanel());
                }
          }
          if(jComboBox1.getSelectedIndex() == 3)  //Customers
            {
                if (list.getSelectedIndex() == -1) {
                    //no selection so display overview
                    setContent(new CustomersOverviewPanel());
                }
                if (list.getSelectedIndex() == 0){
                    setContent(new CreateCustomerJPanel(0));
                }
                if (list.getSelectedIndex() == 1){
                    setContent(new CreateCustomerJPanel(1));
                }
                if (list.getSelectedIndex() == 2){
                    setContent(new CreateCustomerJPanel(2));
                }
                if (list.getSelectedIndex() == 3){
                    setContent(new CustomersOverviewPanel());
                }
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnReturn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        contentPanel.setBackground(new java.awt.Color(153, 153, 153));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contentPanel.setPreferredSize(new java.awt.Dimension(550, 535));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JCG Franchise Management System");

        btnReturn1.setBackground(new java.awt.Color(255, 255, 255));
        btnReturn1.setText("Logout");
        btnReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reservations", "Drivers", "Vehicles", "Customers", "Promos" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        list.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Add", "Edit", "Delete", "View" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please select from the following:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(btnReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn1ActionPerformed
        
        String code = UIController.getInstance().UIRouter("dummydata", "LOGOUT");
       System.out.println(code);
       if(code == "1")
       {
           BaseJFrame.getInstance().setScreen("000");
       }
       else
       {
           BaseJFrame.getInstance().setScreen(code);
       }
    }//GEN-LAST:event_btnReturn1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        changeContent();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        // TODO add your handling code here:
        if (evt.getValueIsAdjusting() == false) {
            changeContent();
        }
    }//GEN-LAST:event_listValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn1;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    // End of variables declaration//GEN-END:variables
}
