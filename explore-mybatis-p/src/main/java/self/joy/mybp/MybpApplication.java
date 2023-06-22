package self.joy.mybp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("self.joy.common.mapper")
@SpringBootApplication
@EnableScheduling
public class MybpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybpApplication.class);
    }
}
