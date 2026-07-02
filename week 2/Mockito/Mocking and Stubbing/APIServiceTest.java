import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class APIServiceTest {

    @Test
    void testMocking() {

        ExternalAPI api = Mockito.mock(ExternalAPI.class);

        Mockito.when(api.getData())
               .thenReturn("Mock Data");

        APIService service = new APIService(api);

        assertEquals("Mock Data",
                service.fetchData());
    }
}