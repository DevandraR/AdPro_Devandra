package id.ac.ui.cs.advprog.eshop.enums;

import lombok.*;

@Getter
public enum PaymentStatus {
    WAITING_PAYMENT("WAITING_PAYMENT"),
    SUCCESS("SUCCESS"),
    REJECTED("REJECTED"),
    INVALID_STATUS("INVALID_STATUS");

    private final String value;

    private PaymentStatus(String value) {
        this.value = value;
    }

    public static boolean contains(String status) {
        for (PaymentStatus paymentStatus : PaymentStatus.values()) {
            if (paymentStatus.name().equals(status)) {
                return true;
            }
        }
        return false;
    }
}
