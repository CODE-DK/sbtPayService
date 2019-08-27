package root.entity;

import java.math.BigDecimal;

public interface PointStatistic {
    String getPoint();
    Integer getCount();
    BigDecimal getSumAmount();
    BigDecimal getSumCommission();
}
