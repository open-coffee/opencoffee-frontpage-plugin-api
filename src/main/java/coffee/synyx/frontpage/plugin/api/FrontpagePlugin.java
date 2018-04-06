package coffee.synyx.frontpage.plugin.api;

import org.springframework.plugin.core.Plugin;

import java.util.Optional;

/**
 * Plugin Interface for CoffeeNet Frontpage.
 *
 * <p>All CoffeeNet Frontpage plugins have to implement following interface for rendering a view for their plugin.</p>
 */
public interface FrontpagePlugin extends Plugin<FrontpagePluginQualifier> {

    /**
     * This methods provides title of the view of the plugin.
     *
     * @param configurationInstance provides the personalised configuration
     * @return title as String
     */
    String title(ConfigurationInstance configurationInstance);


    /**
     * This methods provides all content information for the view of the plugin.
     *
     * @param configurationInstance provides the personalised configuration
     * @return Plugin Content Information
     */
    String content(ConfigurationInstance configurationInstance);


    /**
     * This methods provides a unique plugin id
     *
     * @return a unique plugin id
     */
    String id();

    /**
     * Provides the configuration description to render the plugin configuration.
     *
     * @return the configuration description
     */
    Optional<ConfigurationDescription> getConfigurationDescription();

    @Override
    default boolean supports(FrontpagePluginQualifier delimiter) {

        return true;
    }
}
