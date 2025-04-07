interface InstaCam  
{  
    void clickSelfie();  
    void shootVideo();  

    private void greet()  
    {  
        System.out.println("Smile wide!");  
    }  

    default void shootInHD()  
    {  
        greet();  
        System.out.println("Shooting in HD mode...");  
    }  
}  

interface FreeWifiZone  
{  
    String[] scanForWifi();  
    void joinNetwork(String network);  
}  

class OldNokia  
{  
    void dialNumber(int phoneNumber)  
    {  
        System.out.println("Dialing " + phoneNumber + "...");  
    }  

    void receiveCall(){  
        System.out.println("Buzz Buzz... Call Incoming!");  
    }  
}  

class MySmartPhone extends OldNokia implements FreeWifiZone, InstaCam  
{  
    public void clickSelfie()  
    {  
        System.out.println("Clicking a fabulous selfie!");  
    }  

    public void shootVideo()  
    {  
        System.out.println("Shooting epic video...");  
    }  

    public String[] scanForWifi()  
    {  
        System.out.println("Scanning for Wi-Fi signals...");  
        String[] wifiList = {"Canteen_Net", "College_FreeWifi", "Tera_Network"};  
        return wifiList;  
    }  

    public void joinNetwork(String network)  
    {  
        System.out.println("Joining network: " + network);  
    }  
}  

public class polymorphism_in_interface 
{  
    public static void main(String args[])  
    {  
        OldNokia phone = new MySmartPhone();  
        phone.dialNumber( 000000000);  
    }  
}
