package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration // beand 만들어달라고 하는 설정파일
@ComponentScan(basePackages = {"kr.hs.study.beans","kr.hs.study.dao"}) // 패키지 아래 @Component 설정 시 bean으로 만들어주겠다
public class BeanConfig {


    //Datasource : Database 접속 정보를 가짐
    @Bean
    public BasicDataSource source() {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("oracle.jdbc.OracleDriver");
        source.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); // db
        source.setUsername("scott"); // id
        source.setPassword("tiger"); // pw

        return source;
    }

    // 실제 database에 접속하여 query를 날려주는 애 : JdbcTemplate
    @Bean
    public JdbcTemplate db(BasicDataSource source) {
        JdbcTemplate db = new JdbcTemplate(source);
        return db;
    }
}