package simple_api.demo.Service;

import simple_api.demo.Commu;
import simple_api.demo.Repository.CommuRepository;
import simple_api.demo.Repository.MemoryCommuRepository;

import java.util.List;

public class CommuServiceImpl implements CommuService{
    private final CommuRepository commuRepository=new MemoryCommuRepository();

    public void add(Commu commu){
        commuRepository.save(commu);
    }

    public Commu findCommu(Long commuId){
        return commuRepository.findById(commuId);
    }

    public List findAllCommu(){
        return commuRepository.findAll();
    }

}
