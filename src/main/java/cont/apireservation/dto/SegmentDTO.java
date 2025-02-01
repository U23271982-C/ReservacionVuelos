package cont.apireservation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SegmentDTO {
    private String origin;

    private String destination;

    private String departure;

    private String arrival;

    private String carrier;
}
