class Product {  
    int pro_id;  
    String pro_name;  

    Product(int pid, String n) {  
        pro_id = pid;  
        pro_name = n;  
    }  

    void display() {  
        System.out.println("Product ID: " + pro_id + ", Product Name: " + pro_name);  
    }  
}  

public class Array_of_objects {  
    public static void main(String[] args) {  
        Product[] obj = new Product[5];  

        obj[0] = new Product(21, "Toyota");  
        obj[1] = new Product(31, "Mercedes");  
        obj[2] = new Product(41, "BMW");  
        obj[3] = new Product(51, "Porschne");  
        obj[4] = new Product(61, "McLaren");  

        for (int i = 0; i < obj.length; i++) {  
            System.out.println("Product Object " + (i + 1) + ":");  
            obj[i].display();  
        }  
    }  
}