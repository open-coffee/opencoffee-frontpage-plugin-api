package rocks.coffeenet.frontpage.plugin.api;

import org.junit.Test;
import rocks.coffeenet.frontpage.plugin.api.ConfigurationInstance;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationInstanceBuilderTest {

    @Test
    public void ensureBuilderCreatesConfigInstance() {
        ConfigurationInstance actual = new ConfigurationInstance.Builder()
            .withField("myKey", "myValue")
            .build();

        assertThat(actual.get("myKey")).isEqualTo("myValue");
    }

    @Test
    public void ensureBuilderCreatesConfigInstanceWithoutValues() {
        ConfigurationInstance actual = new ConfigurationInstance.Builder()
            .build();

        assertThat(actual.get("myKey")).isNull();
    }
}
