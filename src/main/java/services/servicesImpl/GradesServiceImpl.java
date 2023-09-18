package services.servicesImpl;

import org.example.mapping.dto.GradesDto;
import repository.repositoryImpl.GradesRepositoryImp;
import services.GradesService;

import java.util.List;

public class GradesServiceImpl implements GradesService {
    GradesRepositoryImp repo = new GradesRepositoryImp();
    @Override
    public List<GradesDto> list() {
        return repo.list();
    }

    @Override
    public GradesDto byId(Long id) {
        return repo.byId(id);
    }

    @Override
    public void update(GradesDto grades) {
        repo.update(grades);
    }

    @Override
    public void delete(Long id) {
        repo.delete(id);
    }
}
