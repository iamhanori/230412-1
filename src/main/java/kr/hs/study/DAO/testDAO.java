package kr.hs.study.DAO;

import kr.hs.study.DTO.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class testDAO {
    // 실제 DB 접속하여 query 날림
    // query 날리는 예 :JDBCTemplate class야
    @Autowired
    JdbcTemplate jdbc;

    // insert(저장)
    public void insert(testDTO dto) {
        String sql = "insert into test values(?, ?);";
        jdbc.update(sql, dto.getData1(), dto.getData2());
    }

}
