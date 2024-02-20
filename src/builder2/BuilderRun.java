package builder2;

public class BuilderRun {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId(12L);
        product1.setName("Iphone");
        product1.setDescription("promax");
        product1.setPrice(300);

        Product product2 = new Product.ProductBuilder().id(12L).name("Iphone").description("promax").price(100).build();

        System.out.println(product1);
        System.out.println();
        System.out.println(product2);
    }
}

