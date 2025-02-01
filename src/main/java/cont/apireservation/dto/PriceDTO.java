package cont.apireservation.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class PriceDTO {
    private BigDecimal totalPrice;

    private BigDecimal totalTax;

    private BigDecimal basePrice;
}
