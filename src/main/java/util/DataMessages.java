package util;

public class DataMessages {
    public static final String MESSAGE_USER_DOES_NOT_EXISTS = "Пользователь не существует";
    public static final String MESSAGE_USER_EXISTS = "exists.customer.login";
    public static final String MESSAGE_PASSWORD_NOT_EQUALS = "equals.user.password";
    public static final String MESSAGE_ERROR_PASSWORD = "incorrect.user.password";
    public static final String MESSAGE_ERROR_LENGTH_CITY = "{length.address.city}";
    public static final String MESSAGE_ERROR_LENGTH_STREET = "{length.address.street}";
    public static final String MESSAGE_ERROR_LENGTH_USERNAME = "{length.user.username}";
    public static final String MESSAGE_ERROR_START_USERNAME = "{start.user.username}";
    public static final String MESSAGE_ERROR_LENGTH_PASSWORD = "{length.user.password}";
    public static final String MESSAGE_ERROR_LENGTH_ROLE_NAME = "{length.role.name}";
    public static final String MESSAGE_ERROR_LENGTH_CUSTOMER_NAME = "{length.customer.name}";
    public static final String MESSAGE_ERROR_LENGTH_CUSTOMER_SURNAME = "{length.customer.surname}";
    public static final String MESSAGE_ERROR_LENGTH_CREDIT_CARD = "{length.credit-card.number}";
    public static final String MESSAGE_ERROR_LENGTH_MODEL = "{length.model.model}";
    public static final String MESSAGE_ERROR_LENGTH_BRAND = "{length.model.brand}";
    public static final String MESSAGE_ERROR_LENGTH_PRODUCT_NAME = "{length.product.name}";
    public static final String MESSAGE_ERROR_MIN_PRODUCT_PRICE = "{min.product.price}";
    public static final String MESSAGE_ERROR_LENGTH_SERIAl_NUMBER = "{length.machine.serial-number}";
    public static final String MESSAGE_ERROR_LENGTH_TYPE_PAYMENT_NAME = "{length.type-payment.name}";
    public static final String MESSAGE_ERROR_MIN_DISCOUNT_SUM = "{min.discount.sum}";
    public static final String MESSAGE_ERROR_MIN_DISCOUNT_PERCENT = "{min.discount.percent}";
    public static final String MESSAGE_ERROR_MIN_PURCHASE_SUM = "{min.sum}";
    public static final String MESSAGE_ERROR_NOT_NULL = "not.null";
    public static final String REG_SYMBOL = "^[a-zA-Z][a-zA-Z0-9_]*";
    public static final int MIN_NUMBER = 0;
    public static final int MIN_USERNAME = 3;
    public static final int MAX_USERNAME = 16;
    public static final int MIN_PASSWORD = 3;
    public static final int MAX_PASSWORD = 16;
    public static final int MIN_ROLE_NAME = 3;
    public static final int MAX_ROLE_NAME = 16;
    public static final int MAX_NAME_SURNAME = 30;
    public static final int LENGTH_CARD_NUMBER = 16;
    public static final int MAX_LENGTH_CITY = 30;
    public static final int MAX_LENGTH_MODEl = 30;
    public static final int MAX_LENGTH_BRAND = 30;
    public static final int MAX_LENGTH_STREET = 30;
    public static final int MIN_LENGTH_SERIAL_NUMBER = 3;
    public static final int MAX_LENGTH_SERIAL_NUMBER = 10;
    public static final String VALID_USERNAME = "user.username";
    public static final String VALID_CUSTOMER = "customer";
    public static final String VALID_EQUALS_CONFIRM_PASSWORD = "user.confirmPassword";
    public static final String VALID_NULL_CUSTOMER = "customer";

    public static final String VALID_MACHINE = "machine";
    public static final String VALID_NULL_MACHINE = "machine";

    public static final String VALID_PRODUCT = "product";
    public static final String VALID_NULL_PRODUCT = "product";

    public static final String VALID_TYPE_PAYMENT = "typePayment";
    public static final String VALID_NULL_TYPE_PAYMENT = "typePayment";
}
