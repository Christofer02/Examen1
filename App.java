import java.sql.Date;
import java.util.StringTokenizer;

public class App {
    private static long startTime;
    public static void main(String[] args) throws Exception {
        ShowProgressBar_i();
        delay(30);
        
    }

public static void ShowProgressBar_i() throws InterruptedException{
    String letra= "christofer.soria@epn.edu.ec";
    int i = 1;
    while(i < 28) {
        System.out.print("[");
        for (int j=0;j<i;j++) {
            System.out.print("<-=->");
        }

        for (int j=1;j<20+i;j++) {
            System.out.print(" ");
        }

        System.out.print("] "+  i*5 + "%");
        if(i<29) {
            System.out.print("\n");
            Thread.sleep(300);
            System.out.println(letra.substring(0,i));
            
        }

        i++;
        
    }
    System.out.println("\n");
}

public static void delay(long milliseconds) throws InterruptedException{
String bar = "[--------------------]";
String icon = "<-=->";

startTime = new Date(startTime).getTime();
boolean bouncePositive = true;
int barPosition = 0;

while((new Date(startTime).getTime() - startTime) < milliseconds) {
    if(barPosition < bar.length() && barPosition > 0) {
        String b1 = bar.substring(0, barPosition);
        String b2 = bar.substring(barPosition);
        System.out.print("\r Loading: " + b1 + icon + b2);
        if(bouncePositive) barPosition++;
        else barPosition--;
    } if(barPosition == bar.length()) {
        barPosition--;
        bouncePositive = false;
    } if(barPosition == 0) {
        barPosition++;
        bouncePositive = true;
    }

    try { Thread.sleep(100); }
    catch (Exception e) {}
    int i=0;
    if(i<20) {
        System.out.print("\r");
        Thread.sleep(300);
    }
}
System.out.print("\n");
}
}