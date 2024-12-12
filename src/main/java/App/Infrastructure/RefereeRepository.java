package App.Infrastructure;

import App.Domain.Game;
import App.Domain.Referee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RefereeRepository extends BaseRepository<Referee>{
    public RefereeRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Referee get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Referee> get() {
        String sql = "SELECT * FROM REFEREE";
        List<Referee> referees = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Referee.class));
        return referees;
    }

    @Override
    public void create(Referee referee) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Referee referee) {

    }
}
