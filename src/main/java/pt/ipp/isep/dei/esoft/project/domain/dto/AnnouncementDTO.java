package pt.ipp.isep.dei.esoft.project.domain.dto;

import pt.ipp.isep.dei.esoft.project.domain.model.Announcement;
import pt.ipp.isep.dei.esoft.project.domain.model.Employee;
import pt.ipp.isep.dei.esoft.project.domain.model.Property;
import pt.ipp.isep.dei.esoft.project.domain.shared.TypeOfBusiness;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Announcement dto.
 */
public class AnnouncementDTO {
    private float price;
    private TypeOfBusiness typeOfBusiness;
    private Property property;
    private Employee agent;

    /**
     * The Announcement dt os.
     */
    List<AnnouncementDTO> announcementDTOs = new ArrayList<>();


    /**
     * Instantiates a new Announcement dto.
     *
     * @param price          the price
     * @param typeOfBusiness the type of business
     * @param property       the property
     * @param agent          the agent
     */
    public AnnouncementDTO(float price, TypeOfBusiness typeOfBusiness, Property property, Employee agent) {
        this.price = price;
        this.typeOfBusiness = typeOfBusiness;
        this.property = property;
        this.agent = agent;
    }

    /**
     * Instantiates a new Announcement dto.
     */
    public AnnouncementDTO() {

    }

    /**
     * Instantiates a new Announcement dto.
     *
     * @param announcement the announcement
     */
    public AnnouncementDTO(Announcement announcement) {

        this.price = announcement.getPrice();
        this.typeOfBusiness = announcement.getTypeOfBusiness();
        this.property = announcement.getProperty();
        this.agent = announcement.getAgent();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Announcement {");
        sb.append("Price: ").append(price);
        sb.append(", Type Of Business: ").append(typeOfBusiness);
        sb.append(", Property: ").append(property);
        sb.append(", Agent: ").append(agent);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Gets announcement.
     *
     * @return the announcement
     */
    public AnnouncementDTO getAnnouncement() {

        return null;
    }

}



