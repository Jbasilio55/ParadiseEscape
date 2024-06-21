package tech.jorgebasilio.paradiseescapebackend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import tech.jorgebasilio.paradiseescapebackend.model.Room;
import tech.jorgebasilio.paradiseescapebackend.response.RoomResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

/**
 * @author Jorge Basilio
 */


public interface IRoomService {

    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;
}
