package App.Infrastructure;

import App.Domain.Player;
import App.Domain.PlayerStats;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PlayerStatsRepository extends BaseRepository<PlayerStats> {

    public PlayerStatsRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public PlayerStats get(String id) throws Exception {
        String sql = "SELECT * FROM PLAYER_STATS WHERE StatsID = ?";
        List<PlayerStats> playerStatsList = this.getDatabaseConnection().query(
                sql,
                new Object[]{id},  // Passing the ID as a parameter
                BeanPropertyRowMapper.newInstance(PlayerStats.class)
        );
        if (playerStatsList.isEmpty()) {
            return null; // Return null if no records found for the given ID
        }
        return playerStatsList.get(0); // Return the first result
    }

    @Override
    public List<PlayerStats> get() {
        String sql = "SELECT * FROM PLAYER_STATS";
        return this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(PlayerStats.class));
    }

    @Override
    public void create(PlayerStats playerStats) {
        String sql = "INSERT INTO PLAYER_STATS (PlayerID, StatID, StatsID) VALUES (?, ?, ?)";
        this.getDatabaseConnection().update(
                sql,
                playerStats.getPlayerID(),
                playerStats.getStatID(),
                playerStats.getStatsID()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM PLAYER_STATS WHERE StatsID = ?";
        this.getDatabaseConnection().update(sql, id); // Delete by StatsID
    }

    @Override
    public void update(String id, PlayerStats playerStats) {
        String sql = "UPDATE PLAYER_STATS SET PlayerID = ?, StatID = ? WHERE StatsID = ?";
        this.getDatabaseConnection().update(
                sql,
                playerStats.getPlayerID(),
                playerStats.getStatID(),
                id
        );
    }
}
