import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserServiceTest {

    @Test
    void verifyInteraction() {

        NotificationService service =
                Mockito.mock(NotificationService.class);

        UserService userService =
                new UserService(service);

        userService.registerUser();

        Mockito.verify(service)
               .send("User Registered");
    }
}