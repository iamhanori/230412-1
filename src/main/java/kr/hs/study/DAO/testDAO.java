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
        String sql = "insert into test values(?, ?)";
        jdbc.update(sql, dto.getData1(), dto.getData2());
    }

    // update(수정)
    public void update(testDTO dto) {
        String sql = "update test set data1=?, data2=?";
        jdbc.update(sql, dto.getData1(), dto.getData2());
    }

    // delete(삭제)
    public void delete(testDTO dto) {
        String sql = "delete from test where data1=?";
        jdbc.update(sql, dto.getData1());
    }

    // select(출력)
    public void select(testDTO dto) {

    }
}
