package App.Infrastructure;

import App.Domain.Player;
import App.Domain.Statistic;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PlayerRepository extends BaseRepository<Player> {

    public PlayerRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Player get(String id) throws Exception {
        String sql = "SELECT * FROM PLAYER WHERE ID = ?";
        return this.getDatabaseConnection().queryForObject(
                sql,
                new Object[]{id},
                new BeanPropertyRowMapper<>(Player.class)
        );
    }

    @Override
    public List<Player> get() {
        String sql = "SELECT * FROM PLAYER";
        return this.getDatabaseConnection().query(
                sql,
                new BeanPropertyRowMapper<>(Player.class)
        );
    }

    @Override
    public void create(Player player) {
        String sql = "INSERT INTO PLAYER (ID, Name, Position, Age, Team) VALUES (?, ?, ?, ?, ?)";
        this.getDatabaseConnection().update(
                sql,
                player.getID(),
                player.getName(),
                player.getPosition(),
                player.getAge(),
                player.getTeam()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM PLAYER WHERE ID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Player player) {
        String sql = "UPDATE PLAYER SET Name = ?, Position = ?, Age = ?, Team = ? WHERE ID = ?";
        this.getDatabaseConnection().update(
                sql,
                player.getName(),
                player.getPosition(),
                player.getAge(),
                player.getTeam(),
                id
        );
    }
}
