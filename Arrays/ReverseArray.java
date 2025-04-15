public class ReverseArray {

    public static String reverse(String name){

     
        String reversed = "";

        for(int i = name.length()-1; i>=0; i--){

            reversed += name.charAt(i);

        }
             return reversed;

    }

    public static void main(String[] args) {
        
        String name = "Anvesha Sharma🤝";
        String reversedName = reverse(name);
        System.out.println("Reversed:" + reversedName);
    }


}