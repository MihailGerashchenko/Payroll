package org.example.model.entity;

public class Seniour extends Manager {

    private String description;

    public Seniour(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Seniour{" +
                "description='" + description + '\'' + super.toString();
    }
}
