@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{id}")
    public String getLoan(
            @PathVariable int id) {

        return "Loan Id : " + id;
    }
}