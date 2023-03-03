package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.repositories.StudentRepositoryImpl;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOOGER = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService service;
    @PostMapping
    public Long save(@RequestBody StudentDto dto){
        LOOGER.debug("start method save");
        return service.save(dto);
    }
    @PutMapping
    public Boolean update(@RequestBody StudentDto dto){
        LOOGER.debug("start method update");
        return service.update(dto);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") long id){
        LOOGER.debug("start method delete");
        return service.deleteById(id);
    }
    @GetMapping
    public List<StudentDto> selectAll(){
        LOOGER.debug("start method select All");
        return service.selectAll();
    }
}
