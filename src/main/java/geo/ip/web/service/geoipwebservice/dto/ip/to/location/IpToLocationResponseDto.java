package geo.ip.web.service.geoipwebservice.dto.ip.to.location;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IpToLocationResponseDto {
    private String canonicalIPv4Representation;
    private String cityName;
    private String countryCode;
    private String countryName;
    private int maiPv4;
    private double latitude;
    private double longitude;
    private String regionName;
}
