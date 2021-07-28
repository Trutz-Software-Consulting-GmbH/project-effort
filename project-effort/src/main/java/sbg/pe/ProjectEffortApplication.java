package sbg.pe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailability;

@SpringBootApplication
public class ProjectEffortApplication implements ApplicationRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectEffortApplication.class);

	private final ApplicationAvailability availability;

	public static void main(String[] args) {
		SpringApplication.run(ProjectEffortApplication.class, args);
	}

	@Autowired
	public ProjectEffortApplication(ApplicationAvailability availability) {
		this.availability = availability;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOG.info("Ready: {}, Live: {}", availability.getReadinessState(), availability.getLivenessState());
	}

}
