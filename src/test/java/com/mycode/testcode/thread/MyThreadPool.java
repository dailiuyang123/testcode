package com.mycode.testcode.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ThreadPool
 * Description: TODO
 * @Author dailiuyang
 * @Date 2019/8/13 14:34
 **/
public class MyThreadPool {

    private ThreadPoolExecutor pool = null;


    /**
     * 线程池初始化方法
     * <p>
     * corePoolSize 核心线程池大小----10
     * maximumPoolSize 最大线程池大小----30
     * keepAliveTime 线程池中超过corePoolSize数目的空闲线程最大存活时间----30+单位TimeUnit
     * TimeUnit keepAliveTime时间单位----TimeUnit.MINUTES
     * workQueue 阻塞队列----new ArrayBlockingQueue<Runnable>(10)====10容量的阻塞队列
     * threadFactory 新建线程工厂----new CustomThreadFactory()====定制的线程工厂
     * rejectedExecutionHandler 当提交任务数超过maxmumPoolSize+workQueue之和时,
     * 即当提交第41个任务时(前面线程都没有执行完,此测试方法中用sleep(100)),
     * 任务会交给RejectedExecutionHandler来处理
     */

    public void init() {
        pool = new ThreadPoolExecutor(10, 30, 30,
                TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(10), new CustomThreadFactory(), new CustomRejectedExecutionHandler());


    }

    public void destory() {
        if(pool !=null) {
            pool.shutdownNow();
        }
    }

    public ExecutorService getMyThreadPoolExecutor() {
        return this.pool;
    }




    private class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            //记录异常
            System.out.println("error...................");
        }
    }



    private class CustomThreadFactory implements ThreadFactory {

        private AtomicInteger count = new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            String threadName =  MyThreadPool.class.getSimpleName()+count.addAndGet(1);

            System.out.println(threadName);
            t.setName(threadName);
            return t;
        }
    }





    public static void main(String[] args) {
        MyThreadPool threadPool=new MyThreadPool();

        threadPool.init();

        ExecutorService myThreadPoolExecutor = threadPool.getMyThreadPoolExecutor();

        for(int i=1;i<100;i++) {
            System.out.println("提交第"+i+"个任务");
            myThreadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(">>>task is running========");
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 销毁
        threadPool.destory();

    }


}
