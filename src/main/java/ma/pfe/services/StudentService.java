package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    Long save(StudentDto dto);
    Boolean update(StudentDto dto);
    Boolean deleteById(long id);
    List<StudentDto> selectAll();
}
