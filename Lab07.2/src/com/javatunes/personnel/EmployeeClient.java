package com.javatunes.personnel;

import com.fastjava.annotation.Fast;

class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee();
        long begin= System.nanoTime();
        emp.work();
        emp.pay();
        long end = System.nanoTime();

        double elapsedMillis = (end-begin)/ 1_000_000.0;
        System.out.println("Elapsed time (ms):" + elapsedMillis);
    }

}