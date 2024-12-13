package App.Infrastructure;

import App.Domain.Game;
import App.Domain.Referee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RefereeRepository extends BaseRepository<Referee> {
    public RefereeRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Referee get(String id) throws Exception {
        String sql = "SELECT * FROM REFEREE WHERE ID = ?";
            return this.getDatabaseConnection().queryForObject(sql, new Object[]{id}, BeanPropertyRowMapper.newInstance(Referee.class));
    }

    @Override
    public List<Referee> get() {
        String sql = "SELECT * FROM REFEREE";
        return this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Referee.class));
    }

    @Override
    public void create(Referee referee) {
        String sql = "INSERT INTO REFEREE (ID, FirstName, LastName, Experience) VALUES (?, ?, ?, ?)";
        this.getDatabaseConnection().update(sql, referee.getID(), referee.getFirstName(), referee.getLastName(), referee.getExperience());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM REFEREE WHERE ID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Referee referee) {
        String sql = "UPDATE REFEREE SET FirstName = ?, LastName = ?, Experience = ? WHERE ID = ?";
        this.getDatabaseConnection().update(sql, referee.getFirstName(), referee.getLastName(), referee.getExperience(), id);
    }
}

