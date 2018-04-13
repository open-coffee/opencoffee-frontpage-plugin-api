package coffee.synyx.frontpage.plugin.api;

public interface ConfigurationField {

    /**
     * The rendered field label
     *
     * @return the label
     */
    String getLabel();

    /**
     * The type of the input field. (e.g. 'number' or 'text')
     *
     * @return the {@link ConfigurationFieldType}
     */
    ConfigurationFieldType getType();

    /**
     *
     * @return boolean whether the field is required or not
     */
    default boolean isRequired() {
        return false;
    }

    /**
     * @return the id
     */
    String getId();
}
