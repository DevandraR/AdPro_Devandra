package id.ac.ui.cs.advprog.eshop.model;

import lombok.*;
import java.util.Map;

@Getter
@Setter
public class Payment {
    private String id;
    private String method;
    private String status;
    private Map<String, String> paymentData;

    public Payment(String id, String method, Map<String, String> paymentData) {
        
    }

    public Payment(String id, String method, Map<String, String> paymentData, String status) {
        
    }
}
