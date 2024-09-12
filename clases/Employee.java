package clases;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String dni;
    private String name;
    private String lastName;
    private String telephoneNumber;
    private String address;
    private String accountNumberBank;
    private List<Contrac> listContrac;
    private List <Paysheet> listPaysheet;
    private List <Position> listPosition;

    public Employee(){
        
    }
        
    public Employee(String dni, String name, String lastName, String telephoneNumber, String address,
            String accountNumberBank) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.accountNumberBank = accountNumberBank;
        this.listContrac = new ArrayList<>();
        this.listPaysheet = new ArrayList<>();
        this.listPosition = new ArrayList<>();
    }
    
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAccountNumberBank() {
        return accountNumberBank;
    }
    public void setAccountNumberBank(String accountNumberBank) {
        this.accountNumberBank = accountNumberBank;
    }
    public List<Contrac> getlistContrac() {
        return listContrac;
    }
    public void setlistContrac(List<Contrac> listContrac) {
        this.listContrac = listContrac;
    }
    public List<Paysheet> getListPaysheet() {
        return listPaysheet;
    }
    public void setListPaysheet(List<Paysheet> listPaysheet) {
        this.listPaysheet = listPaysheet;
    }
    public List<Position> getListPosition() {
        return listPosition;
    }
    public void setListPosition(List<Position> listPosition) {
        this.listPosition = listPosition;
    }
}
