package id.ac.ui.cs.advprog.eshop.model;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    public void testCreatePayment() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP1234567890");

        Payment payment = new Payment("1", "Payment by Voucher Code", paymentData);

        assertNotNull(payment.getId());
    }

    @Test
    public void testCreatePaymentWithStatus() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP1234567890");

        Payment payment = new Payment("1", "Payment by Voucher Code", paymentData, "SUCCESS");

        assertEquals("SUCCESS", payment.getStatus());
    }

    @Test
    public void testCreatePaymentWithEmptyPaymentData() {
        assertThrows(IllegalArgumentException.class, () -> {
            // @SuppressWarnings("unused")
            Payment payment = new Payment("1", "Payment by Voucher Code", new HashMap<>());
        });
    }

    @Test
    public void testCreatePaymentWithInvalidStatus() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "INVALID");

        Payment payment = new Payment("1", "Payment by Voucher Code", paymentData, "INVALID_STATUS");

        assertEquals("INVALID_STATUS", payment.getStatus());
    }

    @Test
    public void testSetStatus() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP1234567890");

        Payment payment = new Payment("1", "Payment by Voucher Code", paymentData, "SUCCESS");

        assertEquals("SUCCESS", payment.getStatus());
    }

    @Test
    public void testSetInvalidStatus() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "INVALID");

        Payment payment = new Payment("1", "Payment by Voucher Code", paymentData, "INVALID_STATUS");

        assertEquals("INVALID_STATUS", payment.getStatus());
    }

    @Test
    public void testSetStatusWithEmptyPaymentData() {
        assertThrows(IllegalArgumentException.class, () -> {
            // @SuppressWarnings("unused")
            Payment payment = new Payment("1", "Payment by Voucher Code", new HashMap<>());
        });
    }
}
