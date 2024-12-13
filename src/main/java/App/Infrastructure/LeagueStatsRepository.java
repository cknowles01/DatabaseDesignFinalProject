package App.Infrastructure;

import App.Domain.LeagueStats;
import App.Domain.Stadium;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


import App.Domain.LeagueStats;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LeagueStatsRepository extends BaseRepository<LeagueStats> {
    public LeagueStatsRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public LeagueStats get(String id) throws Exception {
        String sql = "SELECT * FROM LEAGUE_STATS WHERE StatID = ?";
        return this.getDatabaseConnection().queryForObject(sql,
                BeanPropertyRowMapper.newInstance(LeagueStats.class),
                id);
    }

    @Override
    public List<LeagueStats> get() {
        String sql = "SELECT * FROM LEAGUE_STATS";
        List<LeagueStats> leagueStats = this.getDatabaseConnection().query(sql,
                BeanPropertyRowMapper.newInstance(LeagueStats.class));
        return leagueStats;
    }

    @Override
    public void create(LeagueStats leagueStats) {
        String sql = "INSERT INTO LEAGUE_STATS (StatID, SeasonYear, TotalGames, TotalPoints, TotalPenalties) VALUES (?, ?, ?, ?, ?)";
        this.getDatabaseConnection().update(sql,
                leagueStats.getStatID(),
                leagueStats.getSeasonYear(),
                leagueStats.getTotalGames(),
                leagueStats.getTotalPoints(),
                leagueStats.getTotalPenalties());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM LEAGUE_STATS WHERE StatID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, LeagueStats leagueStats) {
        String sql = "UPDATE LEAGUE_STATS SET SeasonYear = ?, TotalGames = ?, TotalPoints = ?, TotalPenalties = ? WHERE StatID = ?";
        this.getDatabaseConnection().update(sql,
                leagueStats.getSeasonYear(),
                leagueStats.getTotalGames(),
                leagueStats.getTotalPoints(),
                leagueStats.getTotalPenalties(),
                id);
    }
}

