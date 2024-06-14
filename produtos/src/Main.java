import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("How many products will be registered? ");
        int n = sc.nextInt();

        int option;
        List<Product> products = new ArrayList<Product>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product " + (i + 1) +":");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            do {
                System.out.println("[1] NEW PRODUCT\n[2] IMPORTED PRODUCT\n[3] USED PRODUCT");
                System.out.print("Enter here -> ");
                option = sc.nextInt();
                if (option == 1) {
                    Product p = new Product(name, price);
                    System.out.println("Product added: " + p.getName());
                    products.add(p);
                    break;
                } else if (option == 2) {
                    System.out.print("Customs fee: ");
                    double fee = sc.nextDouble();
                    Product p = new ImportedProduct(name, price, fee);
                    System.out.println("Product added: " + p.getName());
                    products.add(p);
                    break;
                } else {
                    System.out.print("Product manufacture date: ");
                    Date date = sdf.parse(sc.next());
                    Product p = new UsedProduct(name, price, date);
                    System.out.println("Product added: " + p.getName());
                    products.add(p);
                    break;
                }
            } while (option <= 3 && option >=  1);
        }
        sc.close();
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
    }
}
