package clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paysheet {
    private Date dateEmission;
    private Float amountGross;
    private Float amountNet;
    private List<Perception> listPerception;
    private List<Deduction> listDeduction;

    public Paysheet(Date dateEmission, Float amountGross, Float amountNet, List<Perception> listPerception,
            List<Deduction> listDeduction) {
        this.dateEmission = dateEmission;
        this.amountGross = amountGross;
        this.amountNet = amountNet;
        this.listPerception = new ArrayList<>();
        this.listDeduction = new ArrayList<>();
    }
    public Date getDateEmission() {
        return dateEmission;
    }
    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }
    public Float getAmountGross() {
        return amountGross;
    }
    public void setAmountGross(Float amountGross) {
        this.amountGross = amountGross;
    }
    public Float getAmountNet() {
        return amountNet;
    }
    public void setAmountNet(Float amountNet) {
        this.amountNet = amountNet;
    }
    public List<Perception> getListPerception() {
        return listPerception;
    }
    public void setListPerception(List<Perception> listPerception) {
        this.listPerception = listPerception;
    }
    public List<Deduction> getListDeduction() {
        return listDeduction;
    }
    public void setListDeduction(List<Deduction> listDeduction) {
        this.listDeduction = listDeduction;
    }
}
