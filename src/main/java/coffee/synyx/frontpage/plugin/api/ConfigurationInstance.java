package coffee.synyx.frontpage.plugin.api;

public interface ConfigurationInstance {

    /**
     * Get configuration by given key
     *
     * @return the value of the given key
     */
    String get(String key);
}
