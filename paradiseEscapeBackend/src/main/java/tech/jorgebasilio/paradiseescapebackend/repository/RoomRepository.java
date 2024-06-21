package tech.jorgebasilio.paradiseescapebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.jorgebasilio.paradiseescapebackend.model.Room;

/**
 * @author Jorge Basilio
 */
public interface RoomRepository extends JpaRepository<Room, Long> {
}
