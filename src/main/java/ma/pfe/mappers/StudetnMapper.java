package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudetnMapper {
    public StudentEntity convertToEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.setName(dto.getName());
        entity.setId(dto.getId());
        return entity;
    }
    public StudentDto convertToDto(StudentEntity entity){
        StudentDto dto = new StudentDto();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        return dto;
    }
    public List<StudentEntity> convertToEntities(List<StudentDto> dtos){
        return dtos.stream()
                .map(dto ->convertToEntity(dto))
                .collect(Collectors.toList());
    }
    public List<StudentDto> convertToDtos(List<StudentEntity> entities){
        if(entities != null) {
            return entities.stream()
                    .map(entity -> convertToDto(entity))
                    .collect(Collectors.toList());
        }else return new ArrayList<>();
    }

}
