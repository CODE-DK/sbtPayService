package root.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface DateStatistic {
    LocalDate getDate();
    Integer getCount();
    BigDecimal getSumAmount();
    BigDecimal getSumCommission();
}
