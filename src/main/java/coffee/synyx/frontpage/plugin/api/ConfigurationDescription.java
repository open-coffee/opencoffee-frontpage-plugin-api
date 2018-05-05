package coffee.synyx.frontpage.plugin.api;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public interface ConfigurationDescription {

    /**
     * Returns a description of all configuration needed to configure the plugin.
     *
     * @return the {@link ConfigurationField}s of a configuration
     */
    Set<ConfigurationField> getConfigurations();

    class Builder {
        private final Set<ConfigurationField> fields = new HashSet<>();

        public ConfigurationDescription.Builder withConfigurationField(ConfigurationField field) {
            this.fields.add(field);
            return this;
        }

        public ConfigurationDescription build() {
            return () -> Collections.unmodifiableSet(fields);
        }
    }
}
