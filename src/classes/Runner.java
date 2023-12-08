/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author USER
 */
public class Runner extends User {
    private String DoB;
    private String Gender;
    private String Address;
    private String Balance;

    public Runner(String Roles, String Username, String Password, String Name,
            String ContactNumber, String DoB, String Gender, String Address, String Balance) {
        super.setUsername(Username);
        super.setPassword(Password);
        super.setName(Name);
        super.setRoles("Runner");
        super.setContactNumber(ContactNumber);
        this.DoB = DoB;
        this.Gender = Gender;
        this.Address = Address;
        this.Balance = Balance;
    }
    
    

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }
    
    
    
}
