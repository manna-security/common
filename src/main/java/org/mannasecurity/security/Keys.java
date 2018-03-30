package org.mannasecurity.security;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class Keys {

    public static PrivateKey rsaFromFile(String filename)
        throws Exception {

        byte[] encodedKeyBytes = Files.readAllBytes(Paths.get(filename));
        String encodedKeyString = new String(encodedKeyBytes, StandardCharsets.UTF_8);

        // pull out key
        encodedKeyString = encodedKeyString
            .replace("-----BEGIN RSA PRIVATE KEY-----\n", "")
            .replace("-----BEGIN PRIVATE KEY-----\n", "")
            .replace("-----END RSA PRIVATE KEY-----", "")
            .replace("-----END PRIVATE KEY-----\n", "")
            .trim();

        // Base64 decode the data
        Iterable<String> split = Splitter.on("\n").split(encodedKeyString);
        String encoded = Joiner.on("").join(split);

        byte[] decoded = Base64.getDecoder().decode(encoded.getBytes(StandardCharsets.UTF_8));

        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decoded);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

}
