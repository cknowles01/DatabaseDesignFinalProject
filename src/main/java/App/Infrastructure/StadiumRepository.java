package App.Infrastructure;

import App.Domain.Coach;
import App.Domain.Stadium;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StadiumRepository extends BaseRepository<Stadium> {
    public StadiumRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Stadium get(String id) throws Exception {
        String sql = "SELECT * FROM STADIUM WHERE ID = ?";
        return this.getDatabaseConnection().queryForObject(sql, BeanPropertyRowMapper.newInstance(Stadium.class), id);
    }

    @Override
    public List<Stadium> get() {
        String sql = "SELECT * FROM STADIUM";
        return this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Stadium.class));
    }

    @Override
    public void create(Stadium stadium) {
        String sql = "INSERT INTO STADIUM (ID, StadiumName, Location, Capacity, Team) VALUES (?, ?, ?, ?, ?)";
        this.getDatabaseConnection().update(sql, stadium.getStadiumID(), stadium.getStadiumName(), stadium.getLocation(), stadium.getCapacity(), stadium.getTeam()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM STADIUM WHERE ID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Stadium stadium) {
        String sql = "UPDATE STADIUM SET StadiumName = ?, Location = ?, Capacity = ?, Team = ? WHERE ID = ?";
        this.getDatabaseConnection().update(sql, stadium.getStadiumName(), stadium.getLocation(), stadium.getCapacity(), stadium.getTeam(), id);
    }
}
