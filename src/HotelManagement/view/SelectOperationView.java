/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HotelManagement.view;

import javax.swing.JFrame;


/**
 *
 * @author kavindi
 */
public class SelectOperationView extends javax.swing.JFrame {

    /**
     * Creates new form SelectOperationView
     */
    public SelectOperationView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        RCategory = new javax.swing.JButton();
        Rooms = new javax.swing.JButton();
        Customer = new javax.swing.JButton();
        resevation = new javax.swing.JButton();
        manageUser = new javax.swing.JButton();
        Packages = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOTEL MANAGEMENT SYSTEM");

        RCategory.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        RCategory.setText("Manage Room Categories");
        RCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCategoryActionPerformed(evt);
            }
        });

        Rooms.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Rooms.setText("Manage Rooms");
        Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsActionPerformed(evt);
            }
        });

        Customer.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Customer.setText("Manage Customers");
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });

        resevation.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        resevation.setText("Manage Reservation");
        resevation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resevationActionPerformed(evt);
            }
        });

        manageUser.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        manageUser.setText("Manage Users");
        manageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserActionPerformed(evt);
            }
        });

        Packages.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Packages.setText("Manage Packages");
        Packages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resevation, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Packages, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Packages, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resevation, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCategoryActionPerformed
        manageRoomCategory();
    }//GEN-LAST:event_RCategoryActionPerformed

    private void RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsActionPerformed
        manageRooms();
    }//GEN-LAST:event_RoomsActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        manageCustomer();
    }//GEN-LAST:event_CustomerActionPerformed

    private void resevationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resevationActionPerformed
           manageReservstions();
    }//GEN-LAST:event_resevationActionPerformed

    private void manageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserActionPerformed
       manageUser();
    }//GEN-LAST:event_manageUserActionPerformed

    private void PackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagesActionPerformed
       managePackages();
    }//GEN-LAST:event_PackagesActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Customer;
    private javax.swing.JButton Packages;
    private javax.swing.JButton RCategory;
    private javax.swing.JButton Rooms;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton manageUser;
    private javax.swing.JButton resevation;
    // End of variables declaration//GEN-END:variables

    private void manageUser() {
            new userView().setVisible(true); 
    }

    private void manageCustomer() {
            new CustomerView().setVisible(true);
    }

    private void manageRoomCategory() {
        new RoomCategoryView().setVisible(true);
    }

    private void manageRooms() {
        new RoomsView().setVisible(true);
    }

    private void managePackages() {
        new PackageView().setVisible(true);
    }

    private void manageReservstions() {
       new ResevationView().setVisible(true);
    }
}