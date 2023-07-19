package simple_api.demo.Service;

import simple_api.demo.Commu;

import java.util.List;

public interface CommuService {

    void add(Commu commu);
    Commu findCommu(Long commuId);
    List findAllCommu();
}
