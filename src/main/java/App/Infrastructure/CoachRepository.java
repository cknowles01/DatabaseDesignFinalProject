package App.Infrastructure;

import App.Domain.Coach;
import App.Domain.Team;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CoachRepository extends BaseRepository<Coach>{

    public CoachRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }
    @Override
    public Coach get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Coach> get() {
        String sql = "SELECT * FROM COACH";
        List<Coach> coaches = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Coach.class));
        return coaches;
    }

    @Override
    public void create(Coach coach) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Coach coach) {

    }
}
