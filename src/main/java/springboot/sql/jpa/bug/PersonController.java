package springboot.sql.jpa.bug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repo;


    @RequestMapping("/persons/{id}")
    Person person(@PathVariable("id") long id) {
        return repo.findOne(id);
    }
}
