package App.Infrastructure;


import App.Domain.Penalty;
import App.Domain.TeamStats;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PenaltyRepository extends BaseRepository<Penalty> {

    public PenaltyRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Penalty get(String id) throws Exception {
        String sql = "SELECT * FROM PENALTY WHERE ID = ?";
        return this.getDatabaseConnection().queryForObject(sql, new Object[]{id}, BeanPropertyRowMapper.newInstance(Penalty.class));
    }

    @Override
    public List<Penalty> get() {
        String sql = "SELECT * FROM PENALTY";
        return this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Penalty.class));
    }

    @Override
    public void create(Penalty penalty) {
        String sql = "INSERT INTO PENALTY (ID, NAME, DESCRIPTION, YARDSLOST) VALUES (?, ?, ?, ?)";
        this.getDatabaseConnection().update(sql, penalty.getID(), penalty.getName(), penalty.getDescription(), penalty.getYardsLost());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM PENALTY WHERE ID = ?";
        this.getDatabaseConnection().update(sql, id);
    }

    @Override
    public void update(String id, Penalty penalty) {
        String sql = "UPDATE PENALTY SET NAME = ?, DESCRIPTION = ?, YARDSLOST = ? WHERE ID = ?";
        this.getDatabaseConnection().update(sql, penalty.getName(), penalty.getDescription(), penalty.getYardsLost(), id);
    }
}
