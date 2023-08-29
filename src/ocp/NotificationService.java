package ocp;

public interface NotificationService {
    void sendOTP(String medium);

    void sendTransactionReport(String medium);
}
