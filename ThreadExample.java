public class ThreadExample{
    public static void main(String[] args) {
        Thread t1= new Thread(new A());
        Thread t2= new Thread(new B());
        t1.start();
        t2.start();
    }
}

class A implements Runnable{
    public void run(){

        int x;
        for(x=0; x<=10; x++)
        System.out.println("Thread A:"+ x);
    }
}

class B implements Runnable{
    public void run(){

        int x;
        for(x=0; x<=10; x++)
        System.out.println("Thread B:"+ x);
    }
}