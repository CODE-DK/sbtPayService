package root.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Commission {
    private UUID paymentId;
    private BigDecimal commission;
}