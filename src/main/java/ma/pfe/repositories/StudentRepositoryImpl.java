package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StudentRepositoryImpl implements StudentRepository{

    private final static Logger LOOGER = LoggerFactory.getLogger(StudentRepositoryImpl.class);
    @Override
    public Long save(StudentEntity e) {
        LOOGER.debug("start method save");
        return null;
    }

    @Override
    public Boolean update(StudentEntity e) {
        LOOGER.debug("start method update");
        return null;
    }

    @Override
    public Boolean deleteById(long id) {
        LOOGER.debug("start method delete");
        return null;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOOGER.debug("start method select All");
        return null;
    }
}
