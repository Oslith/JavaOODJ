/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS 10
 */
public class Administrator extends User{
    
    private JFrame frame;
    
    public Administrator(String Username, String Password, String Name, String ContactNumber){
        super.setUsername(Username);
        super.setPassword(Password);
        super.setName(Name);
        super.setRoles("admin");
        super.setContactNumber(ContactNumber);
    }
    public boolean CheckDup(JFrame Jframe, DefaultTableModel tableModel, String Username, String StoreName, String Location, String PhoneNumber) {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            this.frame = Jframe;
            String existingUsername = (String) tableModel.getValueAt(i, 0);
            String existingStoreName = (String) tableModel.getValueAt(i, 4);
            String existingLocation = (String) tableModel.getValueAt(i, 5);
            String existingPhoneNumber = (String) tableModel.getValueAt(i, 3);
            
            if (Username.equals(existingUsername)) {
                showErrorMessage("Username already exists. Please use a different username.");
                return true;
            } else if (StoreName.equals(existingStoreName)) {
                showErrorMessage("StoreName already exists. Please use a different StoreName.");
                return true;
            } else if (Location.equals(existingLocation)) {
                showErrorMessage("Location already exists. Please use a different Location.");
                return true;
            } else if (PhoneNumber.equals(existingPhoneNumber)) {
                showErrorMessage("PhoneNumber already exists. Please use a different PhoneNumber.");
                return true;
            }
        }
        return false;
    }   
    private void showErrorMessage(String message) {
        if (frame != null) {
            JOptionPane.showMessageDialog(frame, message);
        } else {
            // Handle the case where the frame reference is not available
            System.err.println("Cannot display message: " + message);
        }
    }
}
