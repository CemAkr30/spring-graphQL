package cakar.cs.springgraphql.repositories;

import cakar.cs.springgraphql.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> getByTypeLike(String type);
}
