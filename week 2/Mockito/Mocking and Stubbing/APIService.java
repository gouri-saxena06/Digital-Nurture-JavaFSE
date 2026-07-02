public class APIService {

    private ExternalAPI api;

    public APIService(ExternalAPI api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}