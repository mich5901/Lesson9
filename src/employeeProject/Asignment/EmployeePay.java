package employeeProject.Asignment;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class EmployeePay extends javax.swing.JFrame {

    Employee emp[];
    int size = 0;
    NumberFormat nf;

    public EmployeePay() {
        initComponents();
        emp = new Employee[10];
        nf = NumberFormat.getCurrencyInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtrate = new javax.swing.JTextField();
        txthours = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        quitbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemp = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        FT = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lbltotalpay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Rate:");

        jLabel3.setText("Hours:");

        jLabel4.setText("Employee Type");

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        quitbtn.setText("Quit");
        quitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbtnActionPerformed(evt);
            }
        });

        tblemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Pay"
            }
        ));
        jScrollPane1.setViewportView(tblemp);

        jLabel5.setText("Total Pay:");

        buttonGroup1.add(FT);
        FT.setText("Full Time");
        FT.setActionCommand("FT");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Part Time");
        jRadioButton2.setActionCommand("PT");

        lbltotalpay.setBackground(new java.awt.Color(0, 0, 0));
        lbltotalpay.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalpay.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FT)
                                    .addComponent(addbtn))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(quitbtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jRadioButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtname))
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtrate, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                .addComponent(txthours))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(35, 35, 35)
                                        .addComponent(lbltotalpay, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txthours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FT)
                    .addComponent(jRadioButton2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(quitbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbltotalpay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        Employee temp;
        String nm, type;
        int hours;
        double rate;
        try {
            nm = txtname.getText();
            hours = Integer.parseInt(txthours.getText());
            rate = Double.parseDouble(txtrate.getText());
            type = buttonGroup1.getSelection().getActionCommand();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Must fill out form correctly.");
            return;
        }
        if (type.equals("FT")) 
            temp = new FTEmployee();
            else
            temp = new PTEmployee();
        
        if (temp.setName(nm) && temp.setHours(hours) && temp.setRate(rate)){
            emp[size] = temp;
            tblemp.setValueAt(temp.getName(), size, 0);
            tblemp.setValueAt(nf.format(temp.getPay()), size, 1);
            size++;
            lbltotalpay.setText(nf.format(Employee.getTotalPay()));
            clearform();
            return;
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void quitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitbtnActionPerformed

    public void clearform(){
        txtname.setText("");
        txtrate.setText("");
        txthours.setText("");
        buttonGroup1.clearSelection();
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FT;
    private javax.swing.JButton addbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltotalpay;
    private javax.swing.JButton quitbtn;
    private javax.swing.JTable tblemp;
    private javax.swing.JTextField txthours;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtrate;
    // End of variables declaration//GEN-END:variables
}
