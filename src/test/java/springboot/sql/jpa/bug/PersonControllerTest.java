package springboot.sql.jpa.bug;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class PersonControllerTest {

    @Autowired
    PersonRepository repo;
    
    Person mickey;

    @Before
    public void setUp() {
        repo.deleteAll();
        mickey = repo.save(new Person("Mickey Mouse"));
    }

    @Test
    public void contextLoads() {
    }
}