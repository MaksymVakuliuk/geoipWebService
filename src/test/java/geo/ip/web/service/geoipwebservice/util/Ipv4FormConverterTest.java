package geo.ip.web.service.geoipwebservice.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Ipv4FormConverterTest {

    @Test
    public void decimalToDotDecimal() {
        assertEquals("8.8.8.8", Ipv4FormConverter.decimalToDotDecimal(134744072));
    }

    @Test
    public void dotDecimalToDecimal() {
        assertEquals(134744072, Ipv4FormConverter.dotDecimalToDecimal("8.8.8.8"));
    }
}
