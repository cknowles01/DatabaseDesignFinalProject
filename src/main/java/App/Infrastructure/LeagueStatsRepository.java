package App.Infrastructure;

import App.Domain.LeagueStats;
import App.Domain.Stadium;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LeagueStatsRepository extends BaseRepository<LeagueStats> {
    public LeagueStatsRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public LeagueStats get(String id) throws Exception {
        return null;
    }

    @Override
    public List<LeagueStats> get() {
        String sql = "SELECT * FROM LEAGUE_STATS";
        List<LeagueStats> leagueStats = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(LeagueStats.class));
        return leagueStats;
    }

    @Override
    public void create(LeagueStats leagueStats) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, LeagueStats leagueStats) {

    }
}
