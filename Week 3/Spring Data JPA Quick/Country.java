import jakarta.persistence.*;

@Entity
@Table(name="country")
public class Country {

    @Id
    private String code;

    private String name;

    public Country() {}

    public Country(String code,String name){
        this.code=code;
        this.name=name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}