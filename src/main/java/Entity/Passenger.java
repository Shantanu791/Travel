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
public class Passenger {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long passengerId;

    private String passengerName;

    @Enumerated(EnumType.ORDINAL)
    public PackageType passengerType;

    @OneToMany
    private List<Activities> activities;

}
