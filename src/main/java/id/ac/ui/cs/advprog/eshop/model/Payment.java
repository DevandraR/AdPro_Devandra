package id.ac.ui.cs.advprog.eshop.model;

import lombok.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Getter
@NoArgsConstructor
public class Payment {
    private String id;
    private String method;
    private String status;
    private Map<String, String> paymentData;

    private static final List<String> VALID_STATUSES = Arrays.asList("WAITING_PAYMENT", "SUCCESS", "REJECTED", "INVALID_STATUS");

    public Payment(String id, String method, Map<String, String> paymentData) {
        this.id = id;
        this.method = method;
        this.status = "WAITING_PAYMENT";

        if (paymentData == null || paymentData.isEmpty()) {
            throw new IllegalArgumentException("Payment data cannot be empty");
        }
        this.paymentData = paymentData;
    }

    public Payment(String id, String method, Map<String, String> paymentData, String status) {
        this(id, method, paymentData);
        setStatus(status);
    }

    public void setStatus(String status) {
        if (isValidStatus(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status");
        }
    }

    public boolean isValidStatus(String status) {
        return VALID_STATUSES.contains(status);
    }

    public List<String> getValidStatuses() {
        return VALID_STATUSES;
    }
}
