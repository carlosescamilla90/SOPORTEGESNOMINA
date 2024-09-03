package clases;

import java.util.Date;

public class Position {
    private String nombrePosition;
    private Date dateBeginning;
    private Date dateEnd;
    private Float amount;
    
    public Position(String nombrePosition, Date dateBeginning, Date dateEnd, Float amount) {
        this.nombrePosition = nombrePosition;
        this.dateBeginning = dateBeginning;
        this.dateEnd = dateEnd;
        this.amount = amount;
    }
    
    public String getNombrePosition() {
        return nombrePosition;
    }
    public void setNombrePosition(String nombrePosition) {
        this.nombrePosition = nombrePosition;
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
