package core.utils;

import com.moandjiezana.toml.Toml;
import core.io.toml.LoadTOML;

public class ConfigTOML {
    private static final Toml config = LoadTOML.loadTOML("config.toml");

    public static Toml getConfig() {
        return config;
    }
}
