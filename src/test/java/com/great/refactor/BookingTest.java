package com.great.refactor;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.great.refactor.after.*;
import java.time.LocalDate;

class MockDataStoreImplementation implements DataStoreService {
    String updatedDate;

    boolean shallBookSucceed;

    @Override
    public boolean markDateAsBooked(String date) {
        updatedDate = date;
        return shallBookSucceed;
    }
}

class MockEmailImplementation implements EmailService {
    String updatedReceiver;
    String updatedSubject;
    String updatedContent;

    boolean shallEmailSucceed;

    @Override
    public boolean sendEmail(String receiver, String subject, String content) {
        updatedReceiver = receiver;
        updatedSubject = subject;
        updatedContent = content;
        return shallEmailSucceed;
    }
}

public class BookingTest {
    LocalDate getTestingDate() {
        return LocalDate.of(2022, 11, 14);
    }

    @Test
    public void booking_dataStoreFail() {
        // Given
        MockDataStoreImplementation dataStoreService = new MockDataStoreImplementation();
        dataStoreService.shallBookSucceed = false;
        MockEmailImplementation emailService = new MockEmailImplementation();
        emailService.shallEmailSucceed = true;
        Booking booking = new Booking(dataStoreService, emailService);

        // When
        Booking.Result bookingResult = booking.processBooking("xyz@abc.com", getTestingDate());

        // Then
        assertEquals(dataStoreService.updatedDate, "2022-11-14");
        assertEquals(emailService.updatedReceiver, null);
        assertEquals(emailService.updatedSubject, null);
        assertEquals(emailService.updatedContent, null);
        assertEquals(bookingResult, Booking.Result.FAILURE);
    }

    @Test
    public void booking_dataStoreSuccess_emailFail() {
        // Given
        MockDataStoreImplementation dataStoreService = new MockDataStoreImplementation();
        dataStoreService.shallBookSucceed = true;
        MockEmailImplementation emailService = new MockEmailImplementation();
        emailService.shallEmailSucceed = false;
        Booking booking = new Booking(dataStoreService, emailService);

        // When
        Booking.Result bookingResult = booking.processBooking("xyz@abc.com", getTestingDate());

        // Then
        assertEquals(dataStoreService.updatedDate, "2022-11-14");
        assertEquals(emailService.updatedReceiver, "xyz@abc.com");
        assertEquals(emailService.updatedSubject, "You have successfully booked the function room");
        assertEquals(emailService.updatedContent, "Thank you. See you soon.");
        assertEquals(bookingResult, Booking.Result.PARTIAL_SUCCESS);
    }

    @Test
    public void booking_dataStoreSuccess_emailSuccess() {
        // Given
        MockDataStoreImplementation dataStoreService = new MockDataStoreImplementation();
        dataStoreService.shallBookSucceed = true;
        MockEmailImplementation emailService = new MockEmailImplementation();
        emailService.shallEmailSucceed = true;
        Booking booking = new Booking(dataStoreService, emailService);

        // When
        Booking.Result bookingResult = booking.processBooking("xyz@abc.com", getTestingDate());

        // Then
        assertEquals(dataStoreService.updatedDate, "2022-11-14");
        assertEquals(emailService.updatedReceiver, "xyz@abc.com");
        assertEquals(emailService.updatedSubject, "You have successfully booked the function room");
        assertEquals(emailService.updatedContent, "Thank you. See you soon.");
        assertEquals(bookingResult, Booking.Result.SUCCESS);
    }
}
