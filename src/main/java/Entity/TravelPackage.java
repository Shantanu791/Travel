package Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TravelPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long packageID;

    public List<Passenger> passengers;


    public String packageName;

    public List<Destination> destinations;

    public Integer passengerCapacity;

    @Enumerated(EnumType.STRING)
    public PackageType packageType;


}

