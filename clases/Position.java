package clases;

import java.util.Date;

public class Position {
    private String namePosition;
    private Date dateBeginning;
    private Date dateEnd;
    private Float amount;
    
    public Position(String namePosition, Date dateBeginning, Date dateEnd, Float amount) {
        this.namePosition = namePosition;
        this.dateBeginning = dateBeginning;
        this.dateEnd = dateEnd;
        this.amount = amount;
    }
    
    public String getnamePosition() {
        return namePosition;
    }
    public void setnamePosition(String namePosition) {
        this.namePosition = namePosition;
    }
    public Date getDateBeginning() {
        return dateBeginning;
    }
    public void setDateBeginning(Date dateBeginning) {
        this.dateBeginning = dateBeginning;
    }
    public Date getDateEnd() {
        return dateEnd;
    }
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
    public Float getAmount() {
        return amount;
    }
    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
