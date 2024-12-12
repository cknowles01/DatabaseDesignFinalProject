package App.Infrastructure;

import App.Domain.Player;
import App.Domain.PlayerStats;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PlayerStatsRepository extends BaseRepository<PlayerStats> {
    public PlayerStatsRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public PlayerStats get(String id) throws Exception {
        return null;
    }

    @Override
    public List<PlayerStats> get() {
        String sql = "SELECT * FROM PLAYER_STATS";
        List<PlayerStats> playerStats = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(PlayerStats.class));
        return playerStats;
    }

    @Override
    public void create(PlayerStats playerStats) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, PlayerStats playerStats) {

    }
}
