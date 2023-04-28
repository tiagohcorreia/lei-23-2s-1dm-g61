package app.domain.model;
import app.domain.shared.TypeOfBusiness;

import java.util.NoSuchElementException;

public class Announcement {
    private int announcementID;
    private boolean visible;
    private float price;
    private float commission;
    private TypeOfBusiness typeOfBusiness;
    private Property property;
    private Employee agent;

    //Full constructor
    public Announcement(int announcementID, boolean visible, float price, float commission, TypeOfBusiness typeOfBusiness, Property property, Employee agent) {
        this.setAnnouncementID(announcementID);
        this.setVisible(visible);
        this.setPrice(price);
        this.setCommission(commission);
        this.setTypeOfBusiness(typeOfBusiness);
        this.setProperty(property);
        this.setAgent(agent);
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        if (price < 0){
            throw new IllegalArgumentException("Invalid commission value.");
        }
        this.commission = commission;
    }

    //Default constructor
    public Announcement(){
        this.setAnnouncementID(0);
        this.setVisible(false);
        this.setPrice(0);
        this.setCommission(0);
        this.setTypeOfBusiness(TypeOfBusiness.BUY);
        this.setProperty(null);
        this.setAgent(null);
    }

    //Copy constructor
    public Announcement(Announcement anotherAnnouncement){
        this.setAnnouncementID(anotherAnnouncement.getAnnouncementID());
        this.setVisible(anotherAnnouncement.isVisible());
        this.setPrice(anotherAnnouncement.getPrice());
        this.setCommission(anotherAnnouncement.getCommission());
        this.setTypeOfBusiness(anotherAnnouncement.getTypeOfBusiness());
        this.setProperty(anotherAnnouncement.getProperty());
        this.setAgent(anotherAnnouncement.getAgent());
    }

    public Announcement getAnnouncement() { return new Announcement(this); }

    public Announcement getAnnouncement(String typeOfBusiness, String typeOfProperty, int numberOfBedrooms){
        if (this.isVisible() && typeOfBusiness.equals(this.typeOfBusiness.toString()) && typeOfProperty.equals(this.property.getClass().getSimpleName()) && numberOfBedrooms == 300){
        //if (this.isVisible() && typeOfBusiness.equals(this.typeOfBusiness.toString()) && typeOfProperty.equals(this.property.getClass().getSimpleName()) && numberOfBedrooms == this.property.getBedrooms()){
            return new Announcement(this);
        }
        else
            throw new NoSuchElementException("No entries found.");
    }
    public int getAnnouncementID() {
        return announcementID;
    }

    public void setAnnouncementID(int announcementID) { this.announcementID = announcementID; }

    public boolean isVisible() {
        return this.visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0){
            throw new IllegalArgumentException("Invalid price value.");
        }
        this.price = price;
    }

    public TypeOfBusiness getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void setTypeOfBusiness(TypeOfBusiness typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Employee getAgent() {
        return agent;
    }

    public void setAgent(Employee agent) {
        this.agent = agent;
    }

    //TO-FIX
    public String toString(){
        return String.format("Announcement - " +
                "ID: %d\t" +
                "Visible: %s\t" +
                "Business Type: %s\t" +
                "Property: %s\t" +
                "Price: %f\t" +
                "Commission: %f\t" +
                "Agent: %s\t",
                this.announcementID,
                "true",
                this.typeOfBusiness.toString(),
                this.property.toString(),
                this.price,
                this.commission,
                this.agent.toString());
    }
}
