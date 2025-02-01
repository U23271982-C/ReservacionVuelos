package cont.apireservation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ItineraryDTO {
    private List<SegmentDTO> segment;

    private PriceDTO price;
}
