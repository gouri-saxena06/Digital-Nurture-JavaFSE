import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @GetMapping("/{code}")
    public Country getCountry(
            @PathVariable String code) {

        return new Country("IN","India");
    }
}