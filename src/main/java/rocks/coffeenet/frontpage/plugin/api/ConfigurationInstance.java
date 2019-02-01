package rocks.coffeenet.frontpage.plugin.api;

import java.util.HashMap;
import java.util.Map;

public interface ConfigurationInstance {

    /**
     * Get configuration by given key
     *
     * @param key to retrieve the value defined by the plugin
     *
     * @return the value of the given key
     */
    String get(String key);

    class Builder {
        private Map<String, String> fields = new HashMap<>();

        public ConfigurationInstance.Builder withField(String key, String value) {
            fields.put(key, value);
            return this;
        }

        public ConfigurationInstance build() {
            return key -> fields.get(key);
        }
    }
}
