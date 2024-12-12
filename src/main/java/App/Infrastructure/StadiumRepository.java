package App.Infrastructure;

import App.Domain.Coach;
import App.Domain.Stadium;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StadiumRepository extends BaseRepository<Stadium>{
    public StadiumRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Stadium get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Stadium> get() {
        String sql = "SELECT * FROM STADIUM";
        List<Stadium> stadiums = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Stadium.class));
        return stadiums;
    }

    @Override
    public void create(Stadium stadium) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Stadium stadium) {

    }
}
