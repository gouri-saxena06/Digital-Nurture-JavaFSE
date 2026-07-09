@RestController
public class JwtController {

    @PostMapping("/authenticate")
    public String authenticate() {

        return "JWT Token Generated";
    }
}