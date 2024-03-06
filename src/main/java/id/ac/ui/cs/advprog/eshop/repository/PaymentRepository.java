package id.ac.ui.cs.advprog.eshop.repository;

import java.util.ArrayList;
import java.util.List;

import id.ac.ui.cs.advprog.eshop.model.Payment;

public class PaymentRepository {
    private List<Payment> paymentList;

    public PaymentRepository() {
        paymentList = new ArrayList<>();
    }

    public Payment addPayment(Payment payment) {
        int i = 0;
        for (Payment paymentGet : paymentList) {
            if (paymentGet.getId().equals(payment.getId())) {
                    paymentList.remove(i);
                    paymentList.add(i, payment);
                    return payment;
            }
            i++;
        }
        paymentList.add(payment);
        return payment;
    }

    public Payment getPayment(String paymentId) {
        for (Payment payment : paymentList) {
            if (payment.getId().equals(paymentId)){
                return payment;
            }
        }
        return null;
    }

    public List<Payment> getAllPayments() {
        return paymentList;
    }
}
