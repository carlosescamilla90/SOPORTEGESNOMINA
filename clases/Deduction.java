package clases;

import java.util.ArrayList;
import java.util.List;

public class Deduction {
    private String description;
    private Float percentageFijo;
    private List<Section> sectionsList;
    
    public Deduction(String description, Float percentageFijo, List<Section> sectionsList) {
        this.description = description;
        this.percentageFijo = percentageFijo;
        this.sectionsList = new ArrayList<>();
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Float getpercentageFijo() {
        return percentageFijo;
    }
    public void setpercentageFijo(Float percentageFijo) {
        this.percentageFijo = percentageFijo;
    }
    public List<Section> getSectionsList() {
        return sectionsList;
    }
    public void setSectionsList(List<Section> sectionsList) {
        this.sectionsList = sectionsList;
    }
}

