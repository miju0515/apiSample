package simple_api.demo.Repository;

import simple_api.demo.Commu;

import java.util.List;

public interface CommuRepository {
    Commu save(Commu commu);
    Commu findById(Long id);
    List<Commu> findAll();

}
