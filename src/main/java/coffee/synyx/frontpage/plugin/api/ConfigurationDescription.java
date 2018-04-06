package coffee.synyx.frontpage.plugin.api;

import java.util.Set;

public interface ConfigurationDescription {

    /**
     * Returns a description of all configuration needed to configure the plugin.
     *
     * @return the {@link ConfigurationField}s of a configuration
     */
    Set<ConfigurationField> getConfigurations();
}
