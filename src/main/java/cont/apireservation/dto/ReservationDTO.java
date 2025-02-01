package cont.apireservation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ReservationDTO {
    private Long id;
    private List<PassengerDTO> passengers;

    private ItineraryDTO itinerary;
}
