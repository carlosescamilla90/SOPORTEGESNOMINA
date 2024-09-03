package clases;

public class Perception {
    private String description;
    private Float amount;
    
    public Perception(String description, Float amount) {
        this.description = description;
        this.amount = amount;
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
}
