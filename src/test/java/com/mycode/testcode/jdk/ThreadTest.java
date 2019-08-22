package com.mycode.testcode.jdk;

import com.mycode.testcode.entity.User;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * @ClassName ThreadTest
 * Description: TODO
 * @Author dailiuyang
 * @Date 2019/8/20 18:28
 **/
public class ThreadTest {

    public static String listToStr(List<String> list){
        StringBuffer str = new StringBuffer();
        Random random = new Random(10);
        Map<Integer,List<String>> group = list.parallelStream().collect(Collectors.groupingBy(e -> random.nextInt(100)));
        group.values().parallelStream().forEach(e -> e.forEach(str::append));
        System.out.println("method1: "+str.toString());
        return str.toString();
    }

    public static String list2Str(List<String> list, final int nThreads) throws Exception {
        if (list == null || list.isEmpty()) {
            return null;
        }

        StringBuffer ret = new StringBuffer();
        int size = list.size();
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        List<Future<String>> futures = new ArrayList<Future<String>>(nThreads);

        for (int i = 0; i < nThreads; i++) {
            final List<String> subList = list.subList(size / nThreads * i, size / nThreads * (i + 1));
            Callable<String> task = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    StringBuffer sb = new StringBuffer();
                    for (String str : subList) {
                        sb.append(str);
                        Thread.sleep(1000);
                    }
                    return sb.toString();
                }
            };
            futures.add(executorService.submit(task));
        }

        for (Future<String> future : futures) {
            ret.append(future.get());
        }
        executorService.shutdown();
        System.out.println("method2: "+ret.toString());
        return ret.toString();
    }


    //多线程分组处理List
    public static String sendMessage(List<User> list, final int nThreads) throws ExecutionException, InterruptedException {

        long successCount=0;
        long errorCount=0;

        int size = list.size();
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        List<Future<String>> futures = new ArrayList<Future<String>>(nThreads);
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < nThreads; i++) {
            final List<User> subList = list.subList(size / nThreads * i, i!=nThreads-1? (size / nThreads * (i + 1)):size);
            int finalI = i;
            Callable<String> task = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    StringBuffer sb = new StringBuffer();
                    long success=0;
                    long error=0;

                    for (User user : subList) {
                        //业务代码
                        //sb.append(user.getKey());
                        Thread.sleep(1000);
                        success++;
                        System.out.println("线程:"+finalI+" 消息发送成功："+success);
                    }
                    sb.append("  线程"+ finalI +" 成功数："+success);
                    return sb.toString();
                }
            };
            futures.add(executorService.submit(task));
        }

        for (Future<String> future : futures) {
            ret.append(future.get());
        }
        executorService.shutdown();
        System.out.println(ret.toString());
        return ret.toString();
    }


    public static void main(String[] args) throws Exception{
//        List<String> list = new ArrayList<>();
//        for(int i=0;i<100;i++){
//            list.add(String.valueOf(i));
//        }

        List<User> users=new ArrayList<>();
        for(int i=1;i<=109;i++){
            User user=new User();
            user.setKey(""+i);
            users.add(user);
        }



        long start = System.currentTimeMillis();
//        list2Str(list,10);
        sendMessage(users,10);
        long end = System.currentTimeMillis();
        System.out.println("共花费时间："+(end-start)/1000 +"s");
        //listToStr(list);
    }


}


class MessageDTO{

    String title;

    String cc;

    List<String> emailtoList;

    String formid;

    String tempcode;

    HashMap<String,String> replaceMsgMap;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public List<String> getEmailtoList() {
        return emailtoList;
    }

    public void setEmailtoList(List<String> emailtoList) {
        this.emailtoList = emailtoList;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public String getTempcode() {
        return tempcode;
    }

    public void setTempcode(String tempcode) {
        this.tempcode = tempcode;
    }

    public HashMap<String, String> getReplaceMsgMap() {
        return replaceMsgMap;
    }

    public void setReplaceMsgMap(HashMap<String, String> replaceMsgMap) {
        this.replaceMsgMap = replaceMsgMap;
    }
}