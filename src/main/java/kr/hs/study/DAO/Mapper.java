package kr.hs.study.DAO;

import kr.hs.study.DTO.testDTO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class Mapper implements RowMapper<testDTO> {

    @Override
    public testDTO mapRow(ResultSet rs, int i) throws SQLException {
        testDTO t = new testDTO();

        // rs에 있는 값을 dto에 넣어주는 과정
        t.setData1(rs.getInt("data1"));
        t.setData2(rs.getString("data2"));

        return t;
    }
}
