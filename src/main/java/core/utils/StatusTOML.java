package core.utils;

import com.moandjiezana.toml.Toml;
import core.io.toml.LoadTOML;

public class StatusTOML {
    private static final Toml status = LoadTOML.loadTOML("status.toml");

    public static Toml getStatus() {
        return status;
    }
}
