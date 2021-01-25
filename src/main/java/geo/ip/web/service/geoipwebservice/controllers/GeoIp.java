package geo.ip.web.service.geoipwebservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geoip")
public class GeoIp {

    @GetMapping
    public String get() {
        return "hello";
    }

}
