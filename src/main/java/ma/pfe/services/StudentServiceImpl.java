package ma.pfe.services;

import ma.pfe.controllers.StudentController;
import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudetnMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements  StudentService {
    private final static Logger LOOGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudetnMapper mapper;

    @Override
    public Long save(StudentDto dto) {
        LOOGER.debug("start method save");
        StudentEntity e = mapper.convertToEntity(dto);
        return repository.save(e);
    }

    @Override
    public Boolean update(StudentDto dto) {
        LOOGER.debug("start method update");
        StudentEntity e = mapper.convertToEntity(dto);
        return repository.update(e);
    }

    @Override
    public Boolean deleteById(long id) {
        LOOGER.debug("start method delete");
        return repository.deleteById(id);
    }

    @Override
    public List<StudentDto> selectAll() {
        LOOGER.debug("start method select All");
        List<StudentEntity> l =repository.selectAll();
        List<StudentDto> ld =mapper.convertToDtos(l);
        return ld;
    }
}
