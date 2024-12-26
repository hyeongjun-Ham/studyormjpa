package was.v3;

import java.net.URLDecoder;
import java.net.URLEncoder;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PercentEncodingMain {
    public static void main(String[] args) {
        String endoce = URLEncoder.encode("가", UTF_8);
        System.out.println("endoce = " + endoce);

        String decode = URLDecoder.decode(endoce, UTF_8);
        System.out.println("decode = " + decode);
    }
}
