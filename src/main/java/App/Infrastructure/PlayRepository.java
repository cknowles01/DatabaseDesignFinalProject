package App.Infrastructure;

import App.Domain.Play;
import App.Domain.Referee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;



import App.Domain.Play;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PlayRepository extends BaseRepository<Play> {

    public PlayRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Play get(String id) throws Exception {
        String sql = "SELECT * FROM PLAY WHERE PlayID = ?";
        return this.getDatabaseConnection().queryForObject(sql, BeanPropertyRowMapper.newInstance(Play.class), id);
    }

    @Override
    public List<Play> get() {
        String sql = "SELECT * FROM PLAY";
        List<Play> plays = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Play.class));
        return plays;
    }

    @Override
    public void create(Play play) {
        String sql = "INSERT INTO PLAY (PlayID, GameID, Description, Quarter, TimeRemaining, PenaltyID) VALUES (?, ?, ?, ?, ?, ?)";
        this.getDatabaseConnection().update(sql,
                play.getPlayID(),
                play.getGameID(),
                play.getDescription(),
                play.getQuarter(),
                play.getTimeRemaining(),
                play.getPenaltyID());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM PLAY WHERE PlayID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Play play) {
        String sql = "UPDATE PLAY SET GameID = ?, Description = ?, Quarter = ?, TimeRemaining = ?, PenaltyID = ? WHERE PlayID = ?";
        this.getDatabaseConnection().update(sql,
                play.getGameID(),
                play.getDescription(),
                play.getQuarter(),
                play.getTimeRemaining(),
                play.getPenaltyID(),
                id);
    }
}

