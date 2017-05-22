
import java.awt.Color;


/**
 *
 * @author Rafzz
 */
public class ContractorsGUI extends javax.swing.JFrame {


    public ContractorsGUI() {
        initComponents();
    }
    
    public void resetFormColor() {
        agentFirstNameTextField.setBackground(Color.WHITE);
        agentLastNameTextField.setBackground(Color.WHITE);
        companyNameTextField.setBackground(Color.WHITE);
    }
    
    private void editMode() {
        saveEditButton.setEnabled(true);
        contractorsList.setEnabled(false);
        removeContractorButton.setEnabled(false);
        editButton.setEnabled(false);
        addButton.setEnabled(false);
        
    }

    private void addAndRemoveMode() {
        saveEditButton.setEnabled(false);
        contractorsList.setEnabled(true);
        removeContractorButton.setEnabled(true);
        editButton.setEnabled(true);
        addButton.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        companyNameLabel = new javax.swing.JLabel();
        companyNameTextField = new javax.swing.JTextField();
        agnetFirstNameLabel = new javax.swing.JLabel();
        agentFirstNameTextField = new javax.swing.JTextField();
        agentLastNameLabel = new javax.swing.JLabel();
        agentLastNameTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        contractorsListLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        removeContractorButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contractorsList = new javax.swing.JList<>();
        saveEditButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        companyNameLabel.setText("Company name:");

        agnetFirstNameLabel.setText("Agent First name:");

        agentLastNameLabel.setText("Agent Last name:");

        addButton.setText("Add Contractor");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonClick(evt);
            }
        });

        contractorsListLabel.setText("Contractors List:");

        removeContractorButton.setText("Remove Contractor");
        removeContractorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonClick(evt);
            }
        });

        editButton.setText("Edit Contractor");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonClick(evt);
            }
        });

        jScrollPane1.setViewportView(contractorsList);

        saveEditButton.setText("Save Edit");
        saveEditButton.setEnabled(false);
        saveEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditButtonClick(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveEditButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(companyNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(companyNameTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(agnetFirstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agentFirstNameTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(agentLastNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agentLastNameTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contractorsListLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(removeContractorButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editButton)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNameLabel)
                    .addComponent(companyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agnetFirstNameLabel)
                    .addComponent(agentFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentLastNameLabel)
                    .addComponent(agentLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(saveEditButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(contractorsListLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeContractorButton)
                    .addComponent(editButton))
                .addGap(38, 38, 38)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonClick
        resetFormColor();
        ContractorsContainer.addContractor( agentFirstNameTextField,  agentLastNameTextField, companyNameTextField, contractorsList);
    }//GEN-LAST:event_addButtonClick

    private void removeButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonClick
        ContractorsContainer.removeContractor( contractorsList);
    }//GEN-LAST:event_removeButtonClick

    private void editButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonClick
        //editContractor true if successful
        if(ContractorsContainer.editContractor( agentFirstNameTextField,  agentLastNameTextField, companyNameTextField, contractorsList)){
            editMode();
        }
    }//GEN-LAST:event_editButtonClick

    private void saveEditButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEditButtonClick
        resetFormColor();
        //saveEdit return true if successful
        if(ContractorsContainer.saveEdit( agentFirstNameTextField,  agentLastNameTextField, companyNameTextField, contractorsList)){
            addAndRemoveMode();
        }

    }//GEN-LAST:event_saveEditButtonClick

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContractorsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField agentFirstNameTextField;
    private javax.swing.JLabel agentLastNameLabel;
    private javax.swing.JTextField agentLastNameTextField;
    private javax.swing.JLabel agnetFirstNameLabel;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JTextField companyNameTextField;
    private javax.swing.JList<Contractor> contractorsList;
    private javax.swing.JLabel contractorsListLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton removeContractorButton;
    private javax.swing.JButton saveEditButton;
    // End of variables declaration//GEN-END:variables
}
