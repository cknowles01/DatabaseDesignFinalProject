package App.Infrastructure;

import App.Domain.Team;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TeamRepository extends BaseRepository<Team> {

    public TeamRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Team get(String id) {
        return this.getDatabaseConnection().queryForObject("SELECT * FROM TEAM WHERE NAME = ?", BeanPropertyRowMapper.newInstance(Team.class), id);
    }

    @Override
    public List<Team> get() {
        return this.getDatabaseConnection().query("SELECT * FROM TEAM", BeanPropertyRowMapper.newInstance(Team.class));
    }

    @Override
    public void create(Team team) {
        this.getDatabaseConnection().update("INSERT INTO TEAM (NAME, DIVISION, COACH) VALUES (?, ?, ?)",
                team.getName(), team.getDivision(), team.getCoach());
    }

    @Override
    public void delete(String id) {
        this.getDatabaseConnection().update("DELETE FROM TEAM WHERE NAME = ?", id);
    }

    @Override
    public void update(String id, Team team) {
        this.getDatabaseConnection().update("UPDATE TEAM SET NAME = ?, DIVISION = ?, COACH = ? WHERE ID = ?",
                team.getName(), team.getDivision(), team.getCoach(), id);
    }
}

