package App.Infrastructure;

import App.Domain.Play;
import App.Domain.Referee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PlayRepository extends BaseRepository<Play>{
    public PlayRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Play get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Play> get() {
        String sql = "SELECT * FROM PLAY";
        List<Play> plays = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Play.class));
        return plays;
    }

    @Override
    public void create(Play play) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Play play) {

    }
}
