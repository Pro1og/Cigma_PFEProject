package ma.pfe.services;

import ma.pfe.models.StudentDto;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentServiceImpl implements  StudentService {
    private final static Logger LOOGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository repository;

    private StudentMapper mapper;
    public StudentServiceImpl(@Qualifier("repo1") StudentRepository repository, @Qualifier("mapper1") StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Long save(StudentDto dto) {
        LOOGER.debug("start method save dto : {} ",dto);
        StudentDto re = mapper.convertToDto(repository.save(mapper.convertToEntity(dto)));
        return re.getId();
    }

    @Override
    public Long update(StudentDto dto) {
        LOOGER.debug("start method update dto : {} ",dto);
        StudentDto re = mapper.convertToDto(repository.save(mapper.convertToEntity(dto)));
        return re.getId();
    }

    @Override
    public Boolean deleteById(long id) {
        LOOGER.debug("start method delete id : {} ",id);
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        LOOGER.debug("start method select All");
        return mapper.convertToDtos(repository.findAll());
    }
}
