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
    public Statistic get(String id) {
        String sql = "SELECT * FROM STATISTIC WHERE ID = ?";
        return this.getDatabaseConnection().queryForObject(sql, new Object[]{id}, BeanPropertyRowMapper.newInstance(Statistic.class));
    }

    @Override
    public List<Statistic> get() {
        String sql = "SELECT * FROM STATISTIC";
        return this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Statistic.class));
    }

    @Override
    public void create(Statistic statistic) {
        String sql = "INSERT INTO STATISTIC (ID, NAME, DESCRIPTION) VALUES (?, ?, ?)";
        this.getDatabaseConnection().update(sql, statistic.getID(), statistic.getName(), statistic.getDescription());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM STATISTIC WHERE ID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Statistic statistic) {
        String sql = "UPDATE STATISTIC SET NAME = ?, DESCRIPTION = ? WHERE ID = ?";
        this.getDatabaseConnection().update(sql, statistic.getName(), statistic.getDescription(), id);
    }
}

