package sbg.pe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectEffortApplicationTests {

	@Autowired
	private ProjectEffortApplication app;

	@Test
	void shouldBeNotNull() {
		Assertions.assertNotNull(app);
	}

}
