package Utility;

public class Tools {


    public static void Sleep(int second){
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
