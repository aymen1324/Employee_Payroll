
package employ_payroll;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author beye
 */
public class MainPayrollFrame extends javax.swing.JFrame {
  
    // ADD THESE THREE LINES HERE:
    java.sql.Connection conn = null;
    java.sql.PreparedStatement pst = null;
    java.sql.ResultSet rs = null;
    
   
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainPayrollFrame.class.getName());

    /**
     * Creates new form MainPayrollFrame
     */
    public MainPayrollFrame() {
        initComponents();
        conn = db.java_db();
        this.setLocationRelativeTo(null);
         stylingUI();
    }
private void stylingUI() {
    // 1. Frame Background
    this.getContentPane().setBackground(new java.awt.Color(244, 244, 247));
// Set the Font explicitly to Segoe UI, Plain, Size 14
java.awt.Font segoeFont = new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14);


    // 2. Search Fields (Consolidated)
    txtId.setFont(segoeFont);
    txtId.putClientProperty("JTextField.placeholderText", "Employee ID ");
    txtId.putClientProperty("JTextField.arc", 10); 
    txtName.setFont(segoeFont);
    txtName.putClientProperty("JTextField.placeholderText", "Employee Name ");
    txtName.putClientProperty("JTextField.arc", 10);
   
   // 4. Salary Field Placeholders (Using $ 0.00)
    txtBaseSalary.setFont(segoeFont);
    txtBaseSalary.putClientProperty("JTextField.placeholderText", "$ 0.00");
    txtBaseSalary.putClientProperty("JTextField.arc", 15);

    txtAllowance.setFont(segoeFont);
    txtAllowance.putClientProperty("JTextField.placeholderText", "$ 0.00");
    txtAllowance.putClientProperty("JTextField.arc", 15);

    txtDeduction.setFont(segoeFont);
    txtDeduction.putClientProperty("JTextField.placeholderText", "$ 0.00");
    txtDeduction.putClientProperty("JTextField.arc", 15);

    // 3. Action Buttons
    jButton2.putClientProperty("JButton.buttonType", "roundRect");
    btnSave.putClientProperty("JButton.buttonType", "roundRect");
    btnUpdate.putClientProperty("JButton.buttonType", "roundRect");
    btnClear.putClientProperty("JButton.buttonType", "roundRect");
    jButton5.putClientProperty("JButton.buttonType", "roundRect");
    
  

// If leadingText still fails, try leadingIcon with a simple label-like approach
// Or try this as a fallback to see if it's a version quirk:
   txtBaseSalary.putClientProperty("FlatLaf.style", "showClearButton: true");
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtDeduction = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAllowance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBaseSalary = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblNetResult = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jMenuItem1.setText("jMenuItem1");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, 200));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        txtId.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtId.addActionListener(this::txtIdActionPerformed);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        txtName.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtName.addActionListener(this::txtNameActionPerformed);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 15, 190, 30));

        jButton4.setBackground(new java.awt.Color(210, 210, 215));
        jButton4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(28, 55, 90));
        jButton4.setText("SEARCH");
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 820, 110));

        jPanel2.setBackground(new java.awt.Color(184, 193, 200));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("04 May 2026");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 960, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(184, 193, 200));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 90, -1));

        btnSave.setBackground(new java.awt.Color(184, 193, 200));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(this::btnSaveActionPerformed);
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 90, -1));

        btnUpdate.setBackground(new java.awt.Color(184, 193, 200));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 100, -1));

        jButton2.setBackground(new java.awt.Color(184, 193, 200));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 120, 35));

        btnClear.setBackground(new java.awt.Color(184, 193, 200));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(this::btnClearActionPerformed);
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 90, -1));

        jPanel5.setBackground(new java.awt.Color(233, 236, 239));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDeduction.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 55, 90), 1, true));
        txtDeduction.addActionListener(this::txtDeductionActionPerformed);
        jPanel5.add(txtDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 55, 90));
        jLabel5.setText("Deduction");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 30));

        txtAllowance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 55, 90), 1, true));
        txtAllowance.addActionListener(this::txtAllowanceActionPerformed);
        jPanel5.add(txtAllowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 55, 90));
        jLabel4.setText("Allowance");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 55, 90));
        jLabel3.setText("Base Salary");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 30));

        txtBaseSalary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 55, 90), 1, true));
        txtBaseSalary.addActionListener(this::txtBaseSalaryActionPerformed);
        jPanel5.add(txtBaseSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 250, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 680, 220));

        jPanel6.setBackground(new java.awt.Color(184, 193, 200));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(28, 55, 90));
        jLabel6.setText("Payroll Details");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 680, 60));

        jPanel7.setBackground(new java.awt.Color(144, 164, 174));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(144, 164, 174), 5, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNetResult.setBackground(new java.awt.Color(51, 0, 255));
        lblNetResult.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblNetResult.setForeground(new java.awt.Color(67, 160, 71));
        lblNetResult.setText(" $");
        jPanel7.add(lblNetResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Reslt (Net Salary):");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 680, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 960, 530));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/gear1.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 120, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                        
                                         
    try {
        // 1. Get the connection from your db class
        conn = db.java_db(); 
        
        // 2. Define the SQL string
        String sql = "SELECT * FROM employees WHERE id = ?";
        
        // 3. IMPORTANT: You MUST prepare the statement BEFORE using pst.setString
        pst = conn.prepareStatement(sql); 
        
        // 4. Now that pst is "Prepared", you can fill the '?'
        pst.setString(1, txtId.getText());
        
        // 5. Run the search
        rs = pst.executeQuery();

        if (rs.next()) {
            txtName.setText(rs.getString("name"));
            txtBaseSalary.setText(rs.getString("base_salary"));
            txtAllowance.setText(rs.getString("allowance"));
            txtDeduction.setText(rs.getString("deduction"));
            lblNetResult.setText("Total: " + rs.getString("net_salary"));
        } else {
            JOptionPane.showMessageDialog(null, "Record not found!");
        }
        
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        // Good practice: close the result set and statement
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            // Ignore closure errors
        }
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        // Empty out all text fields
        txtId.setText("");
        txtName.setText("");
        txtBaseSalary.setText("");
        txtAllowance.setText("");
        txtDeduction.setText("");

        // Reset the result label to its default state
        lblNetResult.setText("Total: 0.0");

        // Optional: Put the cursor back in the ID field for the next entry
        txtId.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // 1. Get the numbers from the text fields
            double base = Double.parseDouble(txtBaseSalary.getText());
            double allowance = Double.parseDouble(txtAllowance.getText());
            double deduction = Double.parseDouble(txtDeduction.getText());

            // 2. Do the math
            double netSalary = base + allowance - deduction;

            // 3. Show the result in a Label or the Net Salary field
            // Assuming you have a label named lblNetResult
            lblNetResult.setText("Total: " + netSalary);

        } catch (NumberFormatException e) {
            // This part handles the "Validate numeric fields" requirement
            JOptionPane.showMessageDialog(this, "Please enter valid numbers only!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDeductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeductionActionPerformed

    private void txtBaseSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaseSalaryActionPerformed

    private void txtAllowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllowanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllowanceActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
try {
    // 1. Get the ID from the Search/ID field
    String id = txtId.getText(); 
    
    if(id.equals("")) {
        JOptionPane.showMessageDialog(null, "Please search for an employee first!");
        return;
    }

    // 2. Get the values from the input fields
    String name = txtName.getText();
    String base = txtBaseSalary.getText();
    String allowance = txtAllowance.getText();
    String deduction = txtDeduction.getText();

    // 3. Calculate the net salary
    double net = Double.parseDouble(base) + Double.parseDouble(allowance) - Double.parseDouble(deduction);
    String netString = String.valueOf(net);

    // 4. Database Operation
    String sql = "UPDATE employees SET name=?, base_salary=?, allowance=?, deduction=?, net_salary=? WHERE id=?";

    pst = conn.prepareStatement(sql);
    pst.setString(1, name);
    pst.setString(2, base);
    pst.setString(3, allowance);
    pst.setString(4, deduction);
    pst.setString(5, netString);
    pst.setString(6, id); 

    int updated = pst.executeUpdate(); // Use executeUpdate() for UPDATE queries

    if (updated > 0) {
        JOptionPane.showMessageDialog(null, "Record Updated Successfully");
        // Update the label on the screen
        lblNetResult.setText("Total: " + netString);
    } else {
        JOptionPane.showMessageDialog(null, "No record found with ID: " + id);
    }

} catch (HeadlessException | NumberFormatException | SQLException e) {
    JOptionPane.showMessageDialog(null, "Update Failed: " + e.getMessage());
}
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            // REMOVED: java.sql.Connection conn = ... (We already have 'conn' from the constructor)

            String sql = "INSERT INTO employees (id, name, base_salary, allowance, deduction, net_salary) VALUES (?, ?, ?, ?, ?, ?)";

            // REMOVED 'java.sql.PreparedStatement' from the front
            pst = conn.prepareStatement(sql);

            pst.setString(1, txtId.getText());
            pst.setString(2, txtName.getText());
            pst.setString(3, txtBaseSalary.getText());
            pst.setString(4, txtAllowance.getText());
            pst.setString(5, txtDeduction.getText());

            double base = Double.parseDouble(txtBaseSalary.getText());
            double allow = Double.parseDouble(txtAllowance.getText());
            double deduct = Double.parseDouble(txtDeduction.getText());
            double net = base + allow - deduct;
            pst.setDouble(6, net);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Employee Data Saved Successfully!");

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {
                String sql = "DELETE FROM employees WHERE id=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtId.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                // Trigger a method here to clear your text fields!
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    try {
        com.formdev.flatlaf.FlatLightLaf.setup(); // Must be the FIRST line
    } catch (Exception ex) {
        System.err.println("Failed to initialize LaF");
    }
    java.awt.EventQueue.invokeLater(() -> {
        new MainPayrollFrame().setVisible(true);
    });

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainPayrollFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblNetResult;
    private javax.swing.JTextField txtAllowance;
    private javax.swing.JTextField txtBaseSalary;
    private javax.swing.JTextField txtDeduction;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
