package edu.wsb.datamodellingdemo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PersonController {
    privatefinal PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository){this.personRepository = personRepository;    }@GetMapping("/list")public Iterable<Person> list(){ return personRepository.findAll(); }}
