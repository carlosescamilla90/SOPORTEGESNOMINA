package clases;

import java.util.Date;

public class Triennium {
    private Date dateBenning;
    private Float amount;
    private String categoryAssociated;
    
    public Triennium(Date dateBenning, Float amount, String categoryAssociated) {
        this.dateBenning = dateBenning;
        this.amount = amount;
        this.categoryAssociated = categoryAssociated;
    }
    public Date getDateBenning() {
        return dateBenning;
    }
    public void setDateBenning(Date dateBenning) {
        this.dateBenning = dateBenning;
    }
    public Float getAmount() {
        return amount;
    }
    public void setAmount(Float amount) {
        this.amount = amount;
    }
    public String getCategoryAssociated() {
        return categoryAssociated;
    }
    public void setCategoryAssociated(String categoryAssociated) {
        this.categoryAssociated = categoryAssociated;
    }
}
