package ma.pfe.controllers;

import ma.pfe.models.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOOGER = LoggerFactory.getLogger(StudentController.class);

    private StudentService service;
    public StudentController(@Qualifier("service1") StudentService service) {
        this.service = service;
    }
    @PostMapping("/add")
    public Long save(@RequestBody StudentDto dto){
        LOOGER.debug("start method save dto : {} ",dto);
        return service.save(dto);
    }
    @PutMapping("/update")
    public Long update(@RequestBody StudentDto dto){
        LOOGER.debug("start method update dto : {} ",dto);
        return service.update(dto);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") long id){
        LOOGER.debug("start method delete id : {} ",id);
        return service.deleteById(id);
    }
    @GetMapping
    public List<StudentDto> selectAll(){
        LOOGER.debug("start method select All");
        return service.selectAll();
    }
}
