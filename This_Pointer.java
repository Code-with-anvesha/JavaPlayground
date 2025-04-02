class Sample {
    
     int x;
     Sample(int y)
{

        this.x=y;
}

void display()

{

    System.out.println("x = "+x);
   }

}

public class This_Pointer{

    public static void main(String [] args){

        Sample s = new Sample(10);
        s.display();
    }
}