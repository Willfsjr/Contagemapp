import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
	"auth.permission",
	"api.rest.events",
	"api.rest.webservices",
	"reports",
	"app_cont", 
	"app", 
	"app_oracle"
})
public class SpringBootMain {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone("Brazil/West"));
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class, args);
	}

}
