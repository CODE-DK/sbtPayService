package root.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private LocalDate date;
    private LocalTime time;
    private BigDecimal amount;
    private String point;
    @Version
    private Long version;

    public Message(){}
}
