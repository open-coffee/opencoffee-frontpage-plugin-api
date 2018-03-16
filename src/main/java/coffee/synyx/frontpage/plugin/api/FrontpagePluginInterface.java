package coffee.synyx.frontpage.plugin.api;

/**
 * Plugin Interface for CoffeeNet Frontpage.
 *
 * <p>All CoffeeNet Frontpage plugins have to implement following interface for rendering a view for their plugin.</p>
 */
public interface FrontpagePluginInterface {

    /**
     * This methods provides all html based information for the view of the plugin.
     *
     * @return  HTML-based Plugin View
     */
    String render();
}
