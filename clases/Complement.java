package clases;

public class Complement {
    private String description;
    private Float amount;
    private String type;
    
    public Complement(String description, Float amount, String type) {
        this.description = description;
        this.amount = amount;
        this.type = type;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Float getAmount() {
        return amount;
    }
    public void setAmount(Float amount) {
        this.amount = amount;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
