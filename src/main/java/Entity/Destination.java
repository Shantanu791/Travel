package Entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Destination {

    public String destinationName;

    private List<Activities> activities;

}
