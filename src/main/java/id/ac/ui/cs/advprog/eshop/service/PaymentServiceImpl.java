package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Order;
import id.ac.ui.cs.advprog.eshop.model.Payment;
import id.ac.ui.cs.advprog.eshop.repository.PaymentRepository;

import java.util.List;
import java.util.Map;

public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment addPayment(Order order, String method, Map<String, String> paymentData, String paymentStatus) {
        Payment payment = new Payment(generatePaymentId(), method, paymentData, paymentStatus);
        paymentRepository.addPayment(payment);
        return payment;
    }

    public Payment getPayment(String paymentId) {
        return paymentRepository.getPayment(paymentId);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.getAllPayments();
    }

    public String generatePaymentId() {
        return Integer.toString(getAllPayments().size() + 1);
    }
}
