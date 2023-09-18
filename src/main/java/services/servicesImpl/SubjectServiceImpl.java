package services.servicesImpl;

import org.example.mapping.dto.SubjectDto;
import repository.repositoryImpl.SubjectRepositoryImp;
import services.SubjectService;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {
    SubjectRepositoryImp repo = new SubjectRepositoryImp();

    @Override
    public List<SubjectDto> list() {
        return repo.list();
    }

    @Override
    public SubjectDto byId(Long id) {
        return repo.byId(id);
    }

    @Override
    public void update(SubjectDto subject) {
        repo.update(subject);
    }

    @Override
    public void delete(Long id) {
        repo.delete(id);
    }
}
