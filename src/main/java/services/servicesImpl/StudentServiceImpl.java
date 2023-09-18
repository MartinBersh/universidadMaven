package services.servicesImpl;

import org.example.mapping.dto.StudentDto;
import repository.repositoryImpl.StudentRepositoryImp;
import services.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentRepositoryImp repo = new StudentRepositoryImp();
    @Override
    public List<StudentDto> list() {
        return repo.list();
    }

    @Override
    public StudentDto byId(Long id) {
        return repo.byId(id);
    }

    @Override
    public void update(StudentDto student) {
        repo.update(student);
    }

    @Override
    public void delete(Long id) {
        repo.delete(id);
    }
}
