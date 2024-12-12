package App.Infrastructure;

import App.Domain.Game;
import App.Domain.Penalty;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class GameRepository extends BaseRepository<Game> {
    public GameRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Game get(String id) {
        String sql = "SELECT * FROM GAME WHERE GameID = ?";
        return this.getDatabaseConnection().queryForObject(sql, BeanPropertyRowMapper.newInstance(Game.class), id);
    }

    @Override
    public List<Game> get() {
        String sql = "SELECT * FROM GAME";
        return this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Game.class));
    }

    @Override
    public void create(Game game) {
        String sql = "INSERT INTO GAME (GameID, HomeTeam, AwayTeam, Date, StadiumID) VALUES (?, ?, ?, ?, ?)";
        this.getDatabaseConnection().update(sql, game.getGameID(), game.getHomeTeam(), game.getAwayTeam(), game.getDate(), game.getStadiumID());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM GAME WHERE GameID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Game game) {
        String sql = "UPDATE GAME SET HomeTeam = ?, AwayTeam = ?, Date = ?, StadiumID = ? WHERE GameID = ?";
        this.getDatabaseConnection().update(sql, game.getHomeTeam(), game.getAwayTeam(), game.getDate(), game.getStadiumID(), id);
    }
}

