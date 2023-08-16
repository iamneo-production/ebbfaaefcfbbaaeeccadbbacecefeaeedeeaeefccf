package Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
    @GetMapping("disp")
    public String Welcome(){
        return "Welcome String Boot!";
    }
}
