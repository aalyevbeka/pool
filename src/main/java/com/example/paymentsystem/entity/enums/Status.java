package com.example.paymentsystem.entity.enums;

public enum Status {
    INVALID_REQUEST_FORMAT(401,"Неправильный формат запроса"),
    PERSONAL_ACCOUNT_NOT_FOUND(420,"Лицевой счет не найден"),
    SERVICE_IS_TEMPORARILY_UNAVAILABLE(424, "Сервис временно недоступен"),

    VERIFICATION_PASSED_SUCCESSFULLY(200, "Проверка прошла успешно"),
    PAYMENT_SUCCESSFUL(250, "Платеж успешно проведен"),
    PAYMENT_IS_IN_PROCESSING(400,"Платеж находится в обработке"),
    DUPLICATION_OF_PAYMENT(421,"Платеж находится в обработке"),
    PAYMENT_AMOUNT_EXCEEDED(422, "Заявленная сумма платежа превышает стоимость услуги"),
    PAYMENT_AMOUNT_IS_LESS(423, "Заявленная сумма платежа меньше стоимости услуги"),

    PAYMENT_CANCELED_SUCCESSFUL(250, "Платеж успешно отменен"),
    CANCELLATION_OF_PAYMENT_IS_BEING_PROCESSED(400,"Отмена платежа находится в обработке"),
    PAYMENT_CANCELLATION_IS_NOT_POSSIBLE(420, "Отмена платежа невозможна, ваш баланс исчерпан");


    private String description;
    private int code;

    Status(int code,String description) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
