package blue.lhf.kahvi.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Manifest;

public class ProjectUtils {
    public static Manifest getManifest() {
        return attemptAll("/META-INF/MANIFEST.MF");
    }

    private static Manifest attemptAll(String... locations) {
        for (String location : locations) {
            Manifest attempt = attempt(location);
            if (attempt != null) return attempt;
        }

        return null;
    }

    private static Manifest attempt(String location) {
        InputStream is = ProjectUtils.class.getResourceAsStream(location);
        if (is == null) return null;
        try {
            return new Manifest(is);
        } catch (IOException e) {
            return null;
        }
    }
}
