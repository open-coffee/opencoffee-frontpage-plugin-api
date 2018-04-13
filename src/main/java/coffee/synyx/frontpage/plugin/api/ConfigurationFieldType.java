package coffee.synyx.frontpage.plugin.api;

public enum ConfigurationFieldType {

    /**
     * A control for entering a date (year, month, and day, with no time).
     */
    DATE("date"),

    /**
     * A field for editing an e-mail address.
     */
    EMAIL("email"),

    /**
     * A control for entering a number.
     */
    NUMBER("number"),

    /**
     * A check box allowing single values to be selected/deselected
     */
    CHECKBOX("checkbox"),

    /**
     * A control for entering a number whose exact value is not important.
     */
    RANGE("range"),

    /**
     * A single-line text field for entering search strings.
     * Line-breaks are automatically removed from the input value.
     */
    SEARCH("search"),

    /**
     * A control for entering a telephone number.
     */
    TEL("tel"),

    /**
     * A single-line text field.
     * Line-breaks are automatically removed from the input value.
     */
    TEXT("text"),

    /**
     * A field for entering a URL.
     */
    URL("url"),

    /**
     * A control for specifying a color.
     * A color picker's UI has no required features other than accepting simple colors as text.
     */
    COLOR("color");

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
