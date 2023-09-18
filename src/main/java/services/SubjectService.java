package services;

import org.example.mapping.dto.SubjectDto;

import java.util.List;

public interface SubjectService {

    List<SubjectDto> list();
    SubjectDto byId(Long id);
    void update(SubjectDto t);
    void delete(Long id);

}
