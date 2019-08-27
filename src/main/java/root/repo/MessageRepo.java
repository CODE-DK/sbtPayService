package root.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import root.entity.DateStatistic;
import root.entity.Message;
import root.entity.PointStatistic;

import java.util.List;
import java.util.UUID;

@Repository
public interface MessageRepo extends JpaRepository<Message, UUID> {
    @Query(nativeQuery = true, value = "select date, count(uuid) as count, sum(amount) as sumAmount, SUM(amount*0.15) AS sumCommission FROM message GROUP BY date")
    List<DateStatistic> findDateCount();

    @Query(nativeQuery = true, value = "select point, count(uuid) as count, sum(amount) as sumAmount, SUM(amount*0.15) AS sumCommission FROM message GROUP BY point")
    List<PointStatistic> findPointCount();
}
