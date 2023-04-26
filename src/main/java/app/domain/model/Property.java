package app.domain.model;

import java.util.ArrayList;
import java.util.Objects;

public class Property {
    private int propertyID;
    private float area;
    City location;
    float cityCentreDistance;
    private ArrayList<String> photographs;


    //Constructor

    public Property(int propertyID, float area, City location, float cityCentreDistance, ArrayList<String> photographs) {
        this.propertyID = propertyID;
        this.area = area;
        this.location = location;
        this.cityCentreDistance = cityCentreDistance;
        this.photographs = photographs;
    }
    // Getters and Setters

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public City getLocation() {
        return location;
    }

    public void setLocation(City location) {
        this.location = location;
    }

    public float getCityCentreDistance() {
        return cityCentreDistance;
    }

    public void setCityCentreDistance(float cityCentreDistance) {
        this.cityCentreDistance = cityCentreDistance;
    }

    public ArrayList<String> getPhotographs() {
        return photographs;
    }

    public void setPhotographs(ArrayList<String> photographs) {
        this.photographs = photographs;
    }

    //ToString()
    @Override
    public String toString() {
        return "Property{" +
                "propertyID=" + propertyID +
                ", area=" + area +
                ", address='" + location + '\'' +
                ", cityCentreDistance=" + cityCentreDistance +
                ", photographs=" + photographs +
                '}';
    }
    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return propertyID == property.propertyID && Float.compare(property.area, area) == 0 && Float.compare(property.cityCentreDistance, cityCentreDistance) == 0 && Objects.equals(location, property.location) && Objects.equals(photographs, property.photographs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyID, area, location, cityCentreDistance, photographs);
    }

}
