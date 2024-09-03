package clases;

import java.util.Date;
import java.util.List;

public class Contrac {
    private Date dateHigh;
    private Date dateLow;
    private String category;
    private String DestinationPosition;
    private Float baseSalary;
    private Employee employee;
    private List<Complement> listComplement;
    private List<Triennium> listTriennium;
    
    public Contrac(Date dateHigh, Date dateLow, String category, String destinationPosition, Float baseSalary,
            Employee employee, List<Complement> listComplement, List<Triennium> listTriennium) {
        this.dateHigh = dateHigh;
        this.dateLow = dateLow;
        this.category = category;
        DestinationPosition = destinationPosition;
        this.baseSalary = baseSalary;
        this.employee = employee;
        this.listComplement = listComplement;
        this.listTriennium = listTriennium;
    }
    public Date getDateHigh() {
        return dateHigh;
    }
    public void setDateHigh(Date dateHigh) {
        this.dateHigh = dateHigh;
    }
    public Date getDateLow() {
        return dateLow;
    }
    public void setDateLow(Date dateLow) {
        this.dateLow = dateLow;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDestinationPosition() {
        return DestinationPosition;
    }
    public void setDestinationPosition(String destinationPosition) {
        DestinationPosition = destinationPosition;
    }
    public Float getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Float baseSalary) {
        this.baseSalary = baseSalary;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public List<Complement> getListComplement() {
        return listComplement;
    }
    public void setListComplement(List<Complement> listComplement) {
        this.listComplement = listComplement;
    }
    public List<Triennium> getListTriennium() {
        return listTriennium;
    }
    public void setListTriennium(List<Triennium> listTriennium) {
        this.listTriennium = listTriennium;
    }
}
