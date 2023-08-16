package repository;

import java.util.List;

public interface Respitory <T> {
    List<T> list();
    T byId(Long id);
    void save(T t);
    void delete(Long id);
}
