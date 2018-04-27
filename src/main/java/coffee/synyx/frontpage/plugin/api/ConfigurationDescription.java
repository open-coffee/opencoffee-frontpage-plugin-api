package coffee.synyx.frontpage.plugin.api;

import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface ConfigurationDescription extends Iterable<ConfigurationField> {

    /**
     * Returns a description of all configuration needed to configure the plugin.
     *
     * @return the {@link ConfigurationField}s of a configuration
     */
    Set<ConfigurationField> getConfigurations();

    @Override
    default Iterator<ConfigurationField> iterator() {
        return this.getConfigurations().iterator();
    }

    @Override
    default Spliterator<ConfigurationField> spliterator() {
        return this.getConfigurations().spliterator();
    }

    @Override
    default void forEach(Consumer<? super ConfigurationField> action) {
        this.getConfigurations().forEach(action);
    }

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
