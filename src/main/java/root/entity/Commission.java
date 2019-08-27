package root.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Commission {
    private UUID paymentId;
    private BigDecimal commission;
    private static final BigDecimal COMMISSION_SIZE = BigDecimal.valueOf(0.15);

    public Commission(Message message){
        paymentId = message.getUuid();
        commission = message.getAmount().multiply(COMMISSION_SIZE);
    }
}