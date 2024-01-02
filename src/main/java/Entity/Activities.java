package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Activities {
    public String activityName;

    @ManyToOne
    private Passenger passengers;

    private String description;

    private Integer cost;

    private Integer capacity ;



}
