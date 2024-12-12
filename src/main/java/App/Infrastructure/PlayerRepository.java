package App.Infrastructure;

import App.Domain.Player;
import App.Domain.Statistic;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PlayerRepository extends BaseRepository<Player> {
    public PlayerRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Player get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Player> get() {
        String sql = "SELECT * FROM PLAYER";
        List<Player> player = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Player.class));
        return player;
    }

    @Override
    public void create(Player player) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Player player) {

    }
}
