package rocks.coffeenet.frontpage.plugin.api;

import org.junit.Test;
import rocks.coffeenet.frontpage.plugin.api.ConfigurationDescription;
import rocks.coffeenet.frontpage.plugin.api.ConfigurationField;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class ConfigurationDescriptionBuilderTest {

    @Test
    public void ensureBuilderCreatesConfigurationDescriptionWithoutFields() {
        ConfigurationDescription actual = new ConfigurationDescription.Builder().build();
        assertThat(actual.getConfigurations()).isEmpty();
    }

    @Test
    public void ensureBuilderCreatesConfigurationDescriptionWithConfigField() {
        final ConfigurationField configField = anyConfigField();

        ConfigurationDescription actual = new ConfigurationDescription.Builder()
            .withConfigurationField(configField)
            .build();

        assertThat(actual.getConfigurations()).containsOnly(configField);
    }

    private static ConfigurationField anyConfigField() {
        return mock(ConfigurationField.class);
    }
}
