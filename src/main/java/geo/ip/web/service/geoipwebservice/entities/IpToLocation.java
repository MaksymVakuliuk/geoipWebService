package geo.ip.web.service.geoipwebservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ip2location_db5")
public class IpToLocation {
    @Id
    private Long id;
    private int ipFrom;
    private int ipTo;
    private String countryCode;
    private String countryName;
    private String regionName;
    private String cityName;
    private double latitude;
    private double longitude;
}
