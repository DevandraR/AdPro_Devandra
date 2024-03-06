package id.ac.ui.cs.advprog.eshop.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// import id.ac.ui.cs.advprog.eshop.service.PaymentServiceImpl;
// import id.ac.ui.cs.advprog.eshop.model.Order;
import id.ac.ui.cs.advprog.eshop.model.Payment;
import id.ac.ui.cs.advprog.eshop.repository.PaymentRepository;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    private PaymentRepository paymentRepository;
    private PaymentServiceImpl paymentService;

    @BeforeEach
    public void setUp() {
        paymentRepository = new PaymentRepository();
        paymentService = new PaymentServiceImpl(paymentRepository);
    }

    @Test
    public void testAddPaymentWithVoucherCode() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP12345678");

        Payment payment = paymentService.addPayment(null, "Payment by Voucher Code", paymentData, "SUCCESS");

        assertNotNull(payment.getId());
        assertEquals("Payment by Voucher Code", payment.getMethod());
        assertEquals("SUCCESS", payment.getStatus());
        assertEquals(paymentData, payment.getPaymentData());
    }

    @Test
    public void testAddPaymentWithInvalidVoucherCode() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "INVALID");

        Payment payment = paymentService.addPayment(null, "Payment by Voucher Code", paymentData, "REJECTED");

        assertNotNull(payment.getId());
        assertEquals("Payment by Voucher Code", payment.getMethod());
        assertEquals("REJECTED", payment.getStatus());
        assertEquals(paymentData, payment.getPaymentData());
    }

    @Test
    public void testAddPaymentByCashOnDelivery() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("address", "123 Main Street");
        paymentData.put("deliveryFee", "10.00");

        Payment payment = paymentService.addPayment(null, "Cash on Delivery", paymentData, "REJECTED");

        assertNotNull(payment.getId());
        assertEquals("Cash on Delivery", payment.getMethod());
        assertEquals("REJECTED", payment.getStatus());
        assertEquals(paymentData, payment.getPaymentData());
    }

    @Test
    public void testAddPaymentByBankTransfer() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("bankName", "ABC Bank");
        paymentData.put("referenceCode", "123456");

        Payment payment = paymentService.addPayment(null, "Payment by Bank Transfer", paymentData, "REJECTED");

        assertNotNull(payment.getId());
        assertEquals("Payment by Bank Transfer", payment.getMethod());
        assertEquals("REJECTED", payment.getStatus());
        assertEquals(paymentData, payment.getPaymentData());
    }
}
