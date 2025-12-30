package service;

public class EmailNotificationThread extends Thread {

    private String toEmail;
    private String message;

    public EmailNotificationThread(String toEmail, String message) {
        this.toEmail = toEmail;
        this.message = message;
    }

    @Override
    public void run() {
        // Simulated email sending
        try {
            Thread.sleep(2000); // simulate delay
            System.out.println("📧 Email sent to: " + toEmail);
            System.out.println("Message: " + message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
