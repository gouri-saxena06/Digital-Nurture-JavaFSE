public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(1,"Laptop",50000),
            new Product(2,"Mobile",25000),
            new Product(3,"Mouse",500)
        };

        Product result =
            LinearSearch.search(products,"Laptop");

        if(result != null)
            System.out.println(result.name);
    }
}