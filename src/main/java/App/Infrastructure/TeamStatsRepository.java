package App.Infrastructure;

import App.Domain.PlayerStats;
import App.Domain.TeamStats;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TeamStatsRepository extends BaseRepository<TeamStats> {

    public TeamStatsRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public TeamStats get(String id) throws Exception {
        String sql = "SELECT * FROM TEAM_STATS WHERE TeamStatID = ?";
        return this.getDatabaseConnection().queryForObject(sql,
                BeanPropertyRowMapper.newInstance(TeamStats.class), id);
    }

    @Override
    public List<TeamStats> get() {
        String sql = "SELECT * FROM TEAM_STATS";
        List<TeamStats> teamStats = this.getDatabaseConnection().query(sql,
                BeanPropertyRowMapper.newInstance(TeamStats.class));
        return teamStats;
    }

    @Override
    public void create(TeamStats teamStats) {
        String sql = "INSERT INTO TEAM_STATS (TeamStatID, Team, StatID, LeagueStatID) VALUES (?, ?, ?, ?)";
        this.getDatabaseConnection().update(sql,
                teamStats.getTeamStatID(),
                teamStats.getTeam(),
                teamStats.getStatID(),
                teamStats.getLeagueStatID());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM TEAM_STATS WHERE TeamStatID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, TeamStats teamStats) {
        String sql = "UPDATE TEAM_STATS SET Team = ?, StatID = ?, LeagueStatID = ? WHERE TeamStatID = ?";
        this.getDatabaseConnection().update(sql,
                teamStats.getTeam(),
                teamStats.getStatID(),
                teamStats.getLeagueStatID(),
                id);
    }
}
