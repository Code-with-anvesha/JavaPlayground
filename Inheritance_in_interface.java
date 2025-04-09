class Meme {
    void laugh() {
        System.out.println("Hahaha... Classic meme moment! ");
    }
}

class Doge extends Meme {
    void wow() {
        System.out.println("Such inheritance, much wow! ");
    }
}

class Catto extends Meme {
    void angryMeow() {
        System.out.println("Meow😼! Who touched my food?! ");
    }
}

public class Inheritance_in_interface {
    public static void main(String args[]) {
        Catto c = new Catto();
        c.angryMeow();
        c.laugh();
    }
}