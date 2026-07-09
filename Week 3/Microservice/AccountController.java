@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{id}")
    public String getAccount(
            @PathVariable int id) {

        return "Account Id : " + id;
    }
}