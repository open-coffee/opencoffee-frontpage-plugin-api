package rocks.coffeenet.frontpage.plugin.api;

import org.junit.Test;
import rocks.coffeenet.frontpage.plugin.api.ConfigurationField;
import rocks.coffeenet.frontpage.plugin.api.ConfigurationFieldType;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationFieldBuilderTest {

    @Test
    public void ensureBuilderCreatesConfigField() {
        ConfigurationField actual = new ConfigurationField.Builder()
            .id("myId")
            .label("myLabel")
            .required(true)
            .type(ConfigurationFieldType.NUMBER)
            .build();

        assertThat(actual.getId()).isEqualTo("myId");
        assertThat(actual.getLabel()).isEqualTo("myLabel");
        assertThat(actual.isRequired()).isEqualTo(true);
        assertThat(actual.getType()).isEqualTo(ConfigurationFieldType.NUMBER);
    }
}
