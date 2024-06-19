package tech.jorgebasilio.paradiseescapebackend.response;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.jorgebasilio.paradiseescapebackend.model.Room;

import java.time.LocalDateTime;

/**
 * @author Jorge Basilio
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {

    private Long bookingId;

    private LocalDateTime checkedInDate;

    private LocalDateTime checkedOutDate;

    private String guestFullName;

    private String guestEmail;

    private int numOfAdults;

    private int numOfChildren;

    private int totalNumOfGuest;

    private String bookingConfirmationCode;

    private Room room;

    public BookingResponse(Long bookingId, LocalDateTime checkedInDate, LocalDateTime checkedOutDate,
                           String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkedInDate = checkedInDate;
        this.checkedOutDate = checkedOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
