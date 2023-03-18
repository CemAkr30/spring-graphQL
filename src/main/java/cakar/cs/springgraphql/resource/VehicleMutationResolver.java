package cakar.cs.springgraphql.resource;


import cakar.cs.springgraphql.dtos.VehicleDTO;
import cakar.cs.springgraphql.entities.Vehicle;
import cakar.cs.springgraphql.repositories.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Save,Update and Delete tarzında işlemler yapılacak mutation resolver
 */

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;


    public Vehicle createVehicle(VehicleDTO dto) {
        return vehicleRepository.save(dtoToEntity(dto));
    }

    private Vehicle dtoToEntity(VehicleDTO dto){
        Vehicle vehicle = new Vehicle();
        vehicle.setType(dto.getType());
        vehicle.setModelCode(dto.getModelCode());
        vehicle.setBrandName(dto.getBrandName());
        vehicle.setLaunchDate(new Date());
        return vehicle;
    }

}
