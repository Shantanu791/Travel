package Repository;

import Entity.TravelPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItineraryRepository extends JpaRepository<TravelPackage,Long> {
}
