package cakar.cs.springgraphql.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "model_code")
    private String modelCode;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "launch_date")
    private Date launchDate;

}
