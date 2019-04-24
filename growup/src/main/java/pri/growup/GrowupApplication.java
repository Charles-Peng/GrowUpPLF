package pri.growup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@MapperScan(value = "pri.growup.persistence.mapper")
@SpringBootApplication
public class GrowupApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrowupApplication.class, args);
	}

}
