package rocks.coffeenet.frontpage.plugin.api.validation;

import rocks.coffeenet.frontpage.plugin.api.ConfigurationField;
import org.springframework.validation.Errors;

public interface ConfigurationFieldValidator {

    /**
     * checks whether this validator supports the given {@link ConfigurationField} or not
     *
     * @param field to check if supported by validator
     * @return
     *      <code>true</code> when this validator supports the given {@link ConfigurationField},
     *      <code>false</code> otherwise
     */
    boolean supports(ConfigurationField field);

    /**
     * validates the given target value and adds an item to the {@link Errors}
     * when validation fails
     *
     * @param target the item to validate against the field
     * @param field the configuration field description to validate against
     * @param errors the errors object that will receive the validation error
     */
    void validate(Object target, ConfigurationField field, Errors errors);
}
