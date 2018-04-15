package coffee.synyx.frontpage.plugin.api;

public interface ConfigurationInstance {

    /**
     * Get configuration by given key
     *
     * @param key to retrieve the value defined by the plugin
     *
     * @return the value of the given key
     */
    String get(String key);
}
