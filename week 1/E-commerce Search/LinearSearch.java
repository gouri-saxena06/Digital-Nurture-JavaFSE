public class LinearSearch {

    public static Product search(Product[] products,
                                 String target) {

        for(Product p : products) {
            if(p.name.equalsIgnoreCase(target))
                return p;
        }

        return null;
    }
}