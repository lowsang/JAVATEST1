package test.JavaWeb;

public class ClientThread {
    public static void main(String[] args){
        for(int i=0;i<100;i++)
        {
            ClientRunnable clientRunnable=new ClientRunnable(i);
            Thread thread=new Thread(clientRunnable);
            thread.start();
        }
    }
}
