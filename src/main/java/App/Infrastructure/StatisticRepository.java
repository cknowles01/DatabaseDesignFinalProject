package App.Infrastructure;

import App.Domain.LeagueStats;
import App.Domain.Statistic;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StatisticRepository extends BaseRepository<Statistic> {
    public StatisticRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Statistic get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Statistic> get() {
        String sql = "SELECT * FROM STATISTIC";
        List<Statistic> statistic = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Statistic.class));
        return statistic;
    }

    @Override
    public void create(Statistic statistic) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Statistic statistic) {

    }
}
