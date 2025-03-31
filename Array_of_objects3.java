class Product {  
    int proId;  
    String proName;  

    Product(int pid, String name) {  
        this.proId = pid;  
        this.proName = name;  
    }  

    void display() {  
        System.out.println("Product ID: " + proId + ", Product Name: " + proName);  
    }  
}  

public class Array_of_objects3 {  
    public static void main(String[] args) {  
        Product[] products = new Product[5];  

        products[0] = new Product(21, "Lexus");  
        products[1] = new Product(31, "Lamborghini");  
        products[2] = new Product(41, "Jaguar");  
        products[3] = new Product(51, "Rolls-Royce");  
        products[4] = new Product(61, "Ferrari");  

        // Using a loop to display all products
        for (int i = 0; i < products.length; i++) {  
            System.out.println("Product object " + (i + 1) + ":");  
            products[i].display();  
        }  
    }  
}