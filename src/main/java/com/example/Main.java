package com.example;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 常用方法：
 *
 * 一、添加元素
 * 1、add 方法：如果队列已满，报java.lang.IllegalStateException: Queue full 错误
 * 2、offer 方法：如果队列已满，程序正常运行，只是不再新增元素
 * 3、put 方法：如果队列已满，阻塞
 *
 * 二、取元素
 * 1、poll 方法：弹出队顶元素，队列为空时返回null
 * 2、peek 方法：返回队列顶元素，但顶元素不弹出，队列为空时返回null
 * 3、take 方法：当队列为空，阻塞
 */
public class Main {
    private static LinkedBlockingQueue<String> linkedBlockingQueue;
    public static void main(String[] args) throws InterruptedException {
        linkedBlockingQueue=new LinkedBlockingQueue<>(20);
        System.out.println("----offer方法----");
        for (int i=0;i<30;i++){
            linkedBlockingQueue.offer(String.valueOf(i));
        }
        System.out.println("大小:"+linkedBlockingQueue.size());
        System.out.println("----poll方法----");
        for (int i=0;i<30;i++){
            System.out.println(linkedBlockingQueue.poll()+"\n");;
        }
        System.out.println("大小:"+linkedBlockingQueue.size());
        linkedBlockingQueue=new LinkedBlockingQueue<>(20);
        System.out.println("----put方法----");
        for (int i=0;i<30;i++){
            System.out.println(i);
            linkedBlockingQueue.put(String.valueOf(i));
        }
        System.out.println("大小:"+linkedBlockingQueue.size());

    }
}
