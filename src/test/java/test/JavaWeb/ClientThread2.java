package test.JavaWeb;

public class ClientThread2 {
    public static void main(String[] args){
        for(int i=0;i<100;i++){
            MyClientThread myClientThread = new MyClientThread(i);
            myClientThread.start();
        }
    }
}
