package clases;

public class Section {
    private Float limitLower;
    private Float limitUpper;
    private Float Percentage;

    public Section(){
        
    }
    
    public Section(Float limitLower, Float limitUpper, Float percentage) {
        this.limitLower = limitLower;
        this.limitUpper = limitUpper;
        Percentage = percentage;
    }
    public Float getLimitLower() {
        return limitLower;
    }
    public void setLimitLower(Float limitLower) {
        this.limitLower = limitLower;
    }
    public Float getLimitUpper() {
        return limitUpper;
    }
    public void setLimitUpper(Float limitUpper) {
        this.limitUpper = limitUpper;
    }
    public Float getPercentage() {
        return Percentage;
    }
    public void setPercentage(Float percentage) {
        Percentage = percentage;
    }
}
