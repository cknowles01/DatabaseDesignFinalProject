package App.Infrastructure;

import App.Domain.Team;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TeamRepository extends BaseRepository<Team>{


    public TeamRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }


    @Override
    public Team get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Team> get() {
        String sql = "SELECT * FROM TEAM";
        List<Team> teams = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Team.class));
        return teams;
    }

    @Override
    public void create(Team team) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Team team) {

    }
}
