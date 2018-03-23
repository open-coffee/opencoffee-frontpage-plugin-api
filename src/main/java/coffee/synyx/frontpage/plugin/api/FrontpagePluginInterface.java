package coffee.synyx.frontpage.plugin.api;

import org.springframework.plugin.core.Plugin;


/**
 * Plugin Interface for CoffeeNet Frontpage.
 *
 * <p>All CoffeeNet Frontpage plugins have to implement following interface for rendering a view for their plugin.</p>
 */
public interface FrontpagePluginInterface extends Plugin<FrontpagePluginQualifier> {

    /**
     * This methods provides title of the view of the plugin.
     *
     * @return  title as String
     */
    String title();


    /**
     * This methods provides all content information for the view of the plugin.
     *
     * @return  Plugin Content Information
     */
    String content();


    @Override
    default boolean supports(FrontpagePluginQualifier delimiter) {

        return true;
    }
}
