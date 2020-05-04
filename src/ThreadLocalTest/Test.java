package ThreadLocalTest;

import ThreadLocalTest.threadpool.ThreadPool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

//    static boolean  isOver=false;
    public static void main(String[] args) throws InterruptedException {

        MyThread m=new MyThread();
        Thread thread=new Thread(m);
        Thread thread1=new Thread(m);
        thread.start();
        thread1.start();
    }




static class MyThread implements Runnable{
public  int  tickets=20;
    @Override
    public void run() {

    while(tickets>0){
            System.out.println(Thread.currentThread().getName()+"剩余票数----------------->"+--tickets);
    }
    }
}



}
