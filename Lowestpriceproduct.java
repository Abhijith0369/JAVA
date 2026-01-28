package abhijith;

class Product {
    int pcode;
    String pname;
    double price;

    
    Product(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println("Product Code : " + pcode);
        System.out.println("Product Name : " + pname);
        System.out.println("Price        : " + price);
        System.out.println("---------------------------");
    }
}

public class Lowestpriceproduct {

    public static void main(String[] args) {

        Product p2 = new Product(102, "Mobile", 18000);
        Product p3 = new Product(103, "Printer", 55000);

        Product lowest = p2;

        
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("Product with Lowest Price:");
        System.out.println("==========================");
        lowest.display();
    }
}
