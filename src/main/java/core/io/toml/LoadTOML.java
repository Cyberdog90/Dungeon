package core.io.toml;

import com.moandjiezana.toml.Toml;

import java.io.File;

public class LoadTOML {
    public static Toml loadTOML(String fileName) {
        return new Toml().read(new File("src/main/resources/" + fileName));
    }
}
