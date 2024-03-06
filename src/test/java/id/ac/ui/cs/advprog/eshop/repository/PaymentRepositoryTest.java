package id.ac.ui.cs.advprog.eshop.repository;
import id.ac.ui.cs.advprog.eshop.enums.PaymentStatus;
import id.ac.ui.cs.advprog.eshop.model.Payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PaymentRepositoryTest {

    private PaymentRepository paymentRepository;
    List<Payment> payments;

    @BeforeEach
    public void setUp() {
        paymentRepository = new PaymentRepository();
        payments = new ArrayList<>();

        Payment payment1 = new Payment("1", "Payment by Voucher Code", Map.of("VoucherCode", "ESHOP1234567890"));
        payments.add(payment1);
        Payment payment2 = new Payment("2", "Payment by Bank Transfer", Map.of("BRI", "1234567890"));
        payments.add(payment2);
    }

    @Test
    public void testSaveCreate() {
        Payment payment = new Payment("1", "Payment by Voucher Code", null);
        paymentRepository.addPayment(payment);

        assertEquals(1, paymentRepository.getAllPayments().size());
        assertEquals(payment, paymentRepository.getPayment("1"));
    }

    @Test
    public void testSaveUpdate() {
        Payment payment = new Payment("1", "Payment by Voucher Code", null);
        paymentRepository.addPayment(payment);

        payment.setStatus("SUCCESS");
        paymentRepository.setStatus(payment, "SUCCESS");

        assertEquals("SUCCESS", paymentRepository.getPayment("1").getStatus());
    }

    @Test
    public void testFindByIdIfFound() {
        Payment payment = new Payment("1", "Payment by Voucher Code", null);
        paymentRepository.addPayment(payment);

        assertNotNull(paymentRepository.getPayment("1"));
    }

    @Test
    public void testFindByIdIfNotFound() {
        for (Payment payment : payments) {
            paymentRepository.save(payment);
        }
        Payment find = paymentRepository.findById("nonexistent_id");
        assertNull(find);
    }
}
