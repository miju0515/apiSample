package simple_api.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
public class Commu {
    private Long id;
    private String tag;
    private String name;
    private int pplNum;
}
