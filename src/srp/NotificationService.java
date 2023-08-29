package srp;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use javamail sender api
        }

        if (medium.equals("mobile")) {
            //impl
        }
    }
}
