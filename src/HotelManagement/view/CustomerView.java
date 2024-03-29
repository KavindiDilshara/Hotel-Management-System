/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HotelManagement.view;

import HotelManagement.Controller.CustomerController;
import HotelManagement.dto.CustDto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
/**
 *
 * @author kavindi
 */
public class CustomerView extends javax.swing.JFrame {

    private CustomerController customerController;
    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        customerController = new CustomerController();
        initComponents();
        loadTable();
        
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
        jSeparator1 = new javax.swing.JSeparator();
        labCustId = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        labtitle = new javax.swing.JLabel();
        txttitle = new javax.swing.JTextField();
        labaddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        labName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labtelnum = new javax.swing.JLabel();
        txtTelNum = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        custTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Manage Customer ");

        labCustId.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        labCustId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labCustId.setText("Customer ID");

        labtitle.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        labtitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labtitle.setText("Title");

        labaddress.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        labaddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labaddress.setText("Address");

        labName.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        labName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labName.setText("Name");

        labtelnum.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        labtelnum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labtelnum.setText("Telephone num");

        btSave.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        btSave.setText("Save");
        btSave.setAlignmentY(0.0F);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btUpdate.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        btUpdate.setText("Update");
        btUpdate.setAlignmentY(0.0F);
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        btDelete.setText("Delete");
        btDelete.setAlignmentY(0.0F);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        custTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        custTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(custTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)
                        .addGap(0, 345, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labtelnum, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labtelnum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        updateCustomer();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void custTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custTableMouseClicked
            searchCustomer();
    }//GEN-LAST:event_custTableMouseClicked

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        saveCustomer();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
       deleteCustomer();
    }//GEN-LAST:event_btDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btUpdate;
    private javax.swing.JTable custTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labCustId;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labaddress;
    private javax.swing.JLabel labtelnum;
    private javax.swing.JLabel labtitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTelNum;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {

        try {
            String[] columns = {"CustomerID", "Name", "Address", "Telephone No"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            custTable.setModel(dtm);
            List<CustDto> custDtos = customerController.getAll();
            for(CustDto dto : custDtos){
                Object[] rowData = {dto.getCustID(),dto.getTitle() + " " + dto.getName(),dto.getAddress(),dto.getTelNo()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }

}

    private void updateCustomer() {
        
        try {
            CustDto dto = new CustDto(txtCustId.getText(),txttitle.getText(),txtName.getText(),txtAddress.getText(),txtTelNum.getText());
            String rsp = customerController.updateCustomer(dto);
            JOptionPane.showMessageDialog(this, rsp);
            
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        loadTable();
        clearData();
        
    }

    private void searchCustomer() {
        try {
            String id = custTable.getValueAt(custTable.getSelectedRow(), 0).toString();
            CustDto dto = customerController.searchCustomer(id);
            if (dto != null) {
                txtCustId.setText(dto.getCustID());
                txttitle.setText(dto.getTitle());
                txtName.setText(dto.getName());
                txtAddress.setText(dto.getAddress());
                txtTelNum.setText(dto.getTelNo());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void saveCustomer() {
        
        try {
            CustDto dto = new CustDto(txtCustId.getText(),txttitle.getText(),txtName.getText(),txtAddress.getText(),txtTelNum.getText());
            String rsp = customerController.saveCustomer(dto);
            JOptionPane.showMessageDialog(this, rsp);
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadTable();
        clearData();
    }

    private void deleteCustomer() {
        try {
            String id = txtCustId.getText();
            String rsp = customerController.deleteCustomer(id);
            JOptionPane.showMessageDialog(this, rsp);
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        loadTable();
        clearData();
    }

    public void clearData(){
        txtCustId.setText("");
        txttitle.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtTelNum.setText("");

    }
    


}
