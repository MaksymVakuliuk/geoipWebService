package geo.ip.web.service.geoipwebservice.util;

import geo.ip.web.service.geoipwebservice.exceptions.ConvertIpException;
import java.util.Arrays;
import java.util.StringJoiner;

public class Ipv4FormConverter {
    private static final int OCTET_NUMBERS = 4;

    public static String decimalToDotDecimal(int ipv4) {
        StringJoiner ipStr = new StringJoiner(".");
        int[] ip = new int[4];
        for (int i = 0, divisional = 16777216; i < OCTET_NUMBERS; i++, divisional /= 256) {
            ip[i] = (ipv4 / divisional) % 256;
            ipStr.add(Integer.toString(ip[i]));
        }
        return ipStr.toString();
    }

    public static int dotDecimalToDecimal(String ipStr) {
        int[] ipFromStr = Arrays.stream(ipStr.split("\\."))
                .mapToInt(Integer::parseInt)
                .peek(i -> {
                    if (i > 256 || i < 0) {
                        throw new ConvertIpException("Not correct ip address.");
                    }
                })
                .toArray();
        return 16777216 * ipFromStr[0]
                + 65536 * ipFromStr[1]
                + 256 * ipFromStr[2]
                + ipFromStr[3];

    }
}
