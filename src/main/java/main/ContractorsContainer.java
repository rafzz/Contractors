package main;

import java.awt.Color;


import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

import org.apache.log4j.*;




/**
 *
 * @author Rafzz
 */
public class ContractorsContainer {
	
	
	private static Logger log = Logger.getLogger(ContractorsContainer.class);
	
    private static DefaultListModel<Contractor> contractorsModelList = new DefaultListModel<>();
    
    public static void addContractor(JTextField agentFirstNameTextField, JTextField agentLastNameTextField, 
            JTextField companyNameTextField, JList contractorsList) {
    	
        String agentFirstName = agentFirstNameTextField.getText();
        String agentLastName = agentLastNameTextField.getText();
        String companyName = companyNameTextField.getText();

        if (formValidation(agentFirstNameTextField, agentLastNameTextField, companyNameTextField)) {
        	
            contractorsModelList.addElement(new Contractor(companyName, agentFirstName, agentLastName));
            contractorsList.setModel(contractorsModelList);
            
            log.info(contractorsModelList.toString());
        }
    }
    
    private static boolean formValidation(JTextField agentFirstName, JTextField agentLastName, JTextField companyName) {
        if (companyName.getText().equals(StringEnum.EMPTY.text)
                && agentLastName.getText().equals(StringEnum.EMPTY.text)
                && agentFirstName.getText().equals(StringEnum.EMPTY.text)) {

            agentFirstName.setBackground(Color.red);
            agentLastName.setBackground(Color.red);
            companyName.setBackground(Color.red);
            return false;

        } else if (companyName.getText().equals(StringEnum.EMPTY.text)
                && agentLastName.getText().equals(StringEnum.EMPTY.text)) {

            agentLastName.setBackground(Color.red);
            companyName.setBackground(Color.red);
            return false;

        } else if (companyName.getText().equals(StringEnum.EMPTY.text)
                && agentFirstName.getText().equals(StringEnum.EMPTY.text)) {

            agentFirstName.setBackground(Color.red);
            companyName.setBackground(Color.red);
            return false;

        } else if (!companyName.getText().equals(StringEnum.EMPTY.text)
                && agentFirstName.getText().equals(StringEnum.EMPTY.text)) {

            agentFirstName.setBackground(Color.red);
            return false;

        } else if (!companyName.getText().equals(StringEnum.EMPTY.text)
                && agentLastName.getText().equals(StringEnum.EMPTY.text)) {

            agentLastName.setBackground(Color.red);
            return false;
        }

        return true;

    }
    
    public static void removeContractor(JList contractorsList) {
        contractorsModelList.removeElement(contractorsList.getSelectedValue());
        log.info(contractorsModelList.toString());
    }
    
    public static boolean editContractor(JTextField agentFirstNameTextField, JTextField agentLastNameTextField, 
            JTextField companyNameTextField, JList contractorsList) {

        if (!contractorsList.isSelectionEmpty()) {
            Contractor contractor = (Contractor) contractorsList.getSelectedValue();
            agentFirstNameTextField.setText(contractor.getAgentFirstName());
            agentLastNameTextField.setText(contractor.getAgentLastName());
            companyNameTextField.setText(contractor.getCompanyName());
            return true;
        }
        return false;

    }
    
    public static boolean saveEdit(JTextField agentFirstNameTextField, JTextField agentLastNameTextField, 
            JTextField companyNameTextField, JList contractorsList) {
        String agentFirstName = agentFirstNameTextField.getText();
        String agentLastName = agentLastNameTextField.getText();
        String companyName = companyNameTextField.getText();

        if (formValidation(agentFirstNameTextField, agentLastNameTextField, companyNameTextField)) {
            Contractor contractor = (Contractor) contractorsList.getSelectedValue();
            contractor.setAgentFirstName(agentFirstName);
            contractor.setAgentLastName(agentLastName);
            contractor.setCompanyName(companyName);
            
            log.info(contractorsModelList.toString());
            
            return true;
            
            

        }
        return false;
    }
}
