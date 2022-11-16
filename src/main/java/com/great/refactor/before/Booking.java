package com.great.refactor.before;
import java.time.LocalDate;

public class Booking {
    public enum Result {
        FAILURE,
        PARTIAL_SUCCESS,
        SUCCESS
    }

    private DataStoreService dataStore = new DataStoreService();
    private EmailService emailService = new EmailService();

    private String getEmailSubject() {
        return "You have successfully booked the function room";
    }

    private String getEmailContent() {
        return "Thank you. See you soon.";
    }

    public Result processBooking(String userEmail, LocalDate date) {
        String dateStr = date.toString();
        boolean bookingSuccess = dataStore.markDateAsBooked(dateStr);
        if (!bookingSuccess) {
            return Result.FAILURE;
        }

        // Just simple illustration here. It might be some complicated logics in real application.
        String emailSubject = getEmailSubject();
        String emailContent = getEmailContent();
        boolean sendingEmailSuccess = emailService.sendEmail(userEmail, emailSubject, emailContent);
        if (!sendingEmailSuccess) {
            System.out.println("Email server down. Need to alert user.");
            return Result.PARTIAL_SUCCESS;
        } 
       
        return Result.SUCCESS;
    }

    public static void main(String[] args) {
        Booking booking = new Booking();
        booking.processBooking("xyz@abc.com", LocalDate.now());
    }
}
