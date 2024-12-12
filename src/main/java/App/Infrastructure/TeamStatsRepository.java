package App.Infrastructure;

import App.Domain.PlayerStats;
import App.Domain.TeamStats;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TeamStatsRepository extends BaseRepository<TeamStats>{
    public TeamStatsRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public TeamStats get(String id) throws Exception {
        return null;
    }

    @Override
    public List<TeamStats> get() {
        String sql = "SELECT * FROM TEAM_STATS";
        List<TeamStats> teamStats = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(TeamStats.class));
        return teamStats;
    }

    @Override
    public void create(TeamStats teamStats) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, TeamStats teamStats) {

    }
}
