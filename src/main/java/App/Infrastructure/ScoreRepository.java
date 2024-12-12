package App.Infrastructure;

import App.Domain.Penalty;
import App.Domain.Score;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ScoreRepository extends BaseRepository<Score> {
    public ScoreRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Score get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Score> get() {
        String sql = "SELECT * FROM SCORE";
        List<Score> scores = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Score.class));
        return scores;
    }

    @Override
    public void create(Score score) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Score score) {

    }
}
