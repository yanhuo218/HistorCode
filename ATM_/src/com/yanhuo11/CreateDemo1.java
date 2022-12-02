package com.yanhuo11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateDemo1 {
    public static void main(String[] args) {
        Callable<Long> test = new Test1();
        FutureTask<Long> t = new FutureTask<>(test);
        Thread y = new Thread(t);
        y.start();
        try {
            t.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
class Test1 implements Callable<Long>{

    @Override
    public Long call() throws Exception {
        long x = 0;
        for (int i = 0; i < 10; i++) {
            x *= i;
        }
        return x;
    }
}
