class MathConcepts
{
    public void learn()
    {
        System.out.println("Mathematics");
    }
}

class Algebra extends MathConcepts
{
    public void learn()
    {
        super.learn();
        System.out.println("Algebra");
    }
}

class Calculus extends Algebra
{
    public void learn()
    {
        super.learn();
        System.out.println("Calculus");
    }
}

public class Super_Keyword
{
    public static void main(String args[])
    {
        Calculus obj = new Calculus();
        obj.learn();
    }
}