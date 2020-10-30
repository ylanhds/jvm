package com.fablen;

/**
 * <p>
 * Description: -ea -Xms10m -Xmx10m
 * </p>
 *
 * @author zhangbaosheng
 * @version v1.0.0
 * @date 2020-10-31 0:30
 * @see
 */
public class HeapADemo {
    public static void main(String[] args) {
        System.out.println("Start....");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end....");

    }
}
