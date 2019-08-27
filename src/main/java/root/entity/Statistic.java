package root.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Statistic {
    private List<PointStatistic> pointStatistic;
    private List<DateStatistic> dateStatistic;
}
