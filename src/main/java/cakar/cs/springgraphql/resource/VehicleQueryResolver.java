package cakar.cs.springgraphql.resource;

import cakar.cs.springgraphql.entities.Vehicle;
import cakar.cs.springgraphql.repositories.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


/**
 * @Select&&@Get Query yani datayı çekebileceğimiz resolver graphQL
 */
@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicle(String type){
        return vehicleRepository.getByTypeLike(type);
    }
    public Optional<Vehicle> getById(Long id){
        return vehicleRepository.findById(id);
    }

}
