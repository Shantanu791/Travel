package Travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SoftwareDesignTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareDesignTaskApplication.class, args);
	}

}
