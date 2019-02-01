package rocks.coffeenet.frontpage.plugin.api;

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

    class Builder {

        private String id;
        private String label;
        private ConfigurationFieldType type;
        private boolean required;

        public ConfigurationField.Builder id(String id) {
            this.id = id;
            return this;
        }

        public ConfigurationField.Builder label(String label) {
            this.label = label;
            return this;
        }

        public ConfigurationField.Builder type(ConfigurationFieldType type) {
            this.type = type;
            return this;
        }

        public ConfigurationField.Builder required(boolean required) {
            this.required = required;
            return this;
        }

        public ConfigurationField build() {
            return new ConfigurationField() {
                @Override
                public String getLabel() {
                    return label;
                }

                @Override
                public ConfigurationFieldType getType() {
                    return type;
                }

                @Override
                public String getId() {
                    return id;
                }

                @Override
                public boolean isRequired() {
                    return required;
                }
            };
        }
    }
}
