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
        String sql = "SELECT * FROM SCORE WHERE ScoreID = ?";
            return this.getDatabaseConnection().queryForObject(sql, BeanPropertyRowMapper.newInstance(Score.class), id
            );
    }

    @Override
    public List<Score> get() {
        String sql = "SELECT * FROM SCORE";
        return this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Score.class)
        );
    }

    @Override
    public void create(Score score) {
        String sql = "INSERT INTO SCORE (ScoreID, GameID, Team, Points) VALUES (?, ?, ?, ?)";
        this.getDatabaseConnection().update(
                sql,
                score.getScoreID(),
                score.getGameID(),
                score.getTeam(),
                score.getPoints()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM SCORE WHERE ScoreID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Score score) {
        String sql = "UPDATE SCORE SET GameID = ?, Team = ?, Points = ? WHERE ScoreID = ?";
        this.getDatabaseConnection().update(
                sql,
                score.getGameID(),
                score.getTeam(),
                score.getPoints(),
                id
        );
    }
}
