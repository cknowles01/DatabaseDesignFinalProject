package App.Infrastructure;

import App.Domain.Game;
import App.Domain.Penalty;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class GameRepository extends BaseRepository<Game>{
    public GameRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Game get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Game> get() {
        String sql = "SELECT * FROM GAME";
        List<Game> games = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Game.class));
        return games;
    }

    @Override
    public void create(Game game) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Game game) {

    }
}
