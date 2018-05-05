package coffee.synyx.frontpage.plugin.api;

public enum ConfigurationFieldType {

    /**
     * A control for entering a number.
     */
    NUMBER("number"),

    /**
     * A single-line text field.
     * Line-breaks are automatically removed from the input value.
     */
    TEXT("text"),

    /**
     * A field for entering a URL.
     */
    URL("url");

    private final String type;

    ConfigurationFieldType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
