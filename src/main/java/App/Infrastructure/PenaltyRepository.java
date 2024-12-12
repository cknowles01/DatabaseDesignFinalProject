package App.Infrastructure;


import App.Domain.Penalty;
import App.Domain.TeamStats;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PenaltyRepository extends BaseRepository<Penalty>{


    public PenaltyRepository(JdbcTemplate databaseConnection) {
        super(databaseConnection);
    }

    @Override
    public Penalty get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Penalty> get() {
        String sql = "SELECT * FROM PENALTY";
        List<Penalty> penalties = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Penalty.class));
        return penalties;
    }

    @Override
    public void create(Penalty penalty) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Penalty penalty) {

    }
}