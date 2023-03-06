package ma.pfe.services;

import ma.pfe.models.StudentDto;

import java.util.List;

public interface StudentService {
    Long save(StudentDto dto);
    Long update(StudentDto dto);
    Boolean deleteById(long id);
    List<StudentDto> selectAll();
}
