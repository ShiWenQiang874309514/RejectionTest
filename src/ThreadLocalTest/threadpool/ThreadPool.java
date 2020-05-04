package ThreadLocalTest.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
    ThreadPoolExecutor threadPoolExecutor;


    public static void main(String[] args) {
        //产生线程池
      ExecutorService executorService=  Executors.newFixedThreadPool(2);
        //设置线程任务
        executorService.submit(new MYRunnable());
        executorService.submit(new MYRunnable());
        executorService.submit(new MYRunnable());
        executorService.submit(new MYRunnable());
        executorService.submit(new MYRunnable());
        executorService.submit(new MYRunnable());
        //开启线程，执行run方法

        //调用shutdown可以销毁线程池

    }

    static class MYRunnable implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }




}
