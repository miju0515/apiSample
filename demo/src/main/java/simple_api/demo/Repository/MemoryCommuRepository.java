package simple_api.demo.Repository;

import simple_api.demo.Commu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryCommuRepository implements CommuRepository{
    private static Map<Long, Commu> store = new HashMap<>();
    private static long sequence = 0L;

    public Commu save(Commu commu){
        commu.setId(++sequence);
        store.put(commu.getId(),commu);
        return commu;
    }

    public Commu findById(Long commuId){
        return store.get(commuId);
    }

    public List<Commu> findAll(){
        return new ArrayList<>(store.values());
    }

}
