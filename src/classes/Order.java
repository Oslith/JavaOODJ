/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author vallerie
 */
public class Order {
    private String OrderID;
    private String CustomerID;
    private String Date;
    private String VendorID;
    private String FoodID;
    private String Quantity;
    private Double Total;
    private String Status;
        
    public Order(String OrderID, String CustomerID, String Date, String VendorID, String FoodID, String Quantity, Double Total, String Status){
        this.OrderID = OrderID;
        this.CustomerID = CustomerID;
        this.Date = Date;
        this.VendorID = VendorID;
        this.FoodID = FoodID;
        this.Quantity = Quantity;
        this.Total = Total;
        this.Status = Status;
    }
    
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getVendorID() {
        return VendorID;
    }

    public void setVendorID(String VendorID) {
        this.VendorID = VendorID;
    }

    public String getFoodID() {
        return FoodID;
    }

    public void setFoodID(String FoodID) {
        this.FoodID = FoodID;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
