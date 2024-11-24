package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductTest {
    public static void main(String[] args) {
        Product product=new Product("0","DELL","70000");
        System.out.println(product.hashCode());

        List<Product> productList=new ArrayList<>();
        productList.add(new Product("1","lenovo","60000"));
        productList.add(new Product("2","SAMSUNG","70000"));
        productList.add(new Product("3","ASUS","65000"));
        productList.add(new Product("4","lenovo","58000"));
        productList.add(new Product("5","hp","68000"));
        productList.add(new Product("6","MI","55000"));
        productList.add(new Product("7","Apple","140000"));
        productList.add(new Product("8","lenovo","60000"));
        productList.add(new Product("9","SAMSUNG","70000"));
        productList.add(new Product("10","ASUS","65000"));
        productList.add(new Product("11","lenovo","58000"));
        productList.add(new Product("12","hp","68000"));
        productList.add(new Product("13","MI","55000"));
        productList.add(new Product("14","Apple","140000"));

        int startIndex = 0;
        int endIndex = productList.size();

        for(int startI=0;startI< productList.size();startI++){
            System.out.println(productList.get(startI).getPrdId()+" "+productList.get(startI).hashCode()+"  "+startI);
        }

        System.out.println("*******************STREAMS*******************");
        productList.stream().forEach(myProduct ->{
            System.out.println(myProduct.getPrdId()+" "+myProduct.hashCode());
        });

        System.out.println("********************size********************");

        Predicate<Product> idPredicate =(productPredicate) -> productPredicate.getPrdName().equals("lenovo");
        long lenovoCount=productList.stream().filter(product1 ->  idPredicate.test(product1)).count();
        System.out.println(lenovoCount);

    }
}
