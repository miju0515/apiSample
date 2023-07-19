package simple_api.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import simple_api.demo.Commu;
import simple_api.demo.Service.CommuService;
import simple_api.demo.Service.CommuServiceImpl;

import java.util.List;
import java.util.Map;


@RestController
public class studyController {
    private final CommuService commuService = new CommuServiceImpl();

    @GetMapping("/SampleSTest")
    public String SampleStringTest(){
        return "Hello World!";
    }

    @PostMapping("/Commu")
    public void makeCommu(@RequestBody Commu commu){
        commuService.add(commu);
    }

    @GetMapping("/Commufind/{id}")
    public Commu findCommu(Long id){
        Commu finding=commuService.findCommu(id);
        return finding;
    }

    @GetMapping("/findAllCommu")
    public List<Commu> findAll(){
        return commuService.findAllCommu();
    }





}
