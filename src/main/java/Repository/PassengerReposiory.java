package Repository;

import Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerReposiory extends JpaRepository<Passenger,Long> {
}
