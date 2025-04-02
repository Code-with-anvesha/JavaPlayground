public class Static_and_instance_var {
    int myVariable = 10; 
    static int data = 60; // Static variable

    public static void main(String[] args) {
        Static_and_instance_var obj1 = new Static_and_instance_var();
        Static_and_instance_var obj2 = new Static_and_instance_var();
        obj2.myVariable = 20; 

        System.out.println("Value of instance variable (obj1) = " + obj1.myVariable);
        System.out.println("Value of instance variable (obj2) = " + obj2.myVariable);
        System.out.println("Value of static variable = " + Static_and_instance_var.data);
    }
}
