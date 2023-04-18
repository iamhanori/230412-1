package kr.hs.study;

import kr.hs.study.DAO.testDAO;
import kr.hs.study.DTO.testDTO;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        // testDAO 가져와
        testDAO dao = ctx.getBean(testDAO.class);

        // data 저장할 bean생성
        testDTO dto = new testDTO();

//        // insert
//        dto.setData1(3);
//        dto.setData2("Spring3");
//        dao.insert(dto);
//        System.out.println("inserted.");

        // update
//        dto.setData1(2);
//        dto.setData2("Spring222222");
//        dao.update(dto);
//        System.out.println("updated.");

        // delete
//        dto.setData1(2);
//        dao.update(dto);
//        System.out.println("deleted.");

        // select
        List<testDTO> list = dao.select();
        for(testDTO bean:list) {
            System.out.println("data1 : " + bean.getData1());
            System.out.println("data2 : " + bean.getData2());
        }


        ctx.close();
    }
}