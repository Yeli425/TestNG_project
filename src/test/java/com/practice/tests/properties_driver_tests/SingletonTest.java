package com.practice.tests.properties_driver_tests;

import com.practice.utilities.Driver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test() {
        String s1 = Singleton.getInstance();
        //100 lines of code
        String s2 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }

    @Test
    public void test1() throws InterruptedException {
        Driver.get().get("https://www.google.com");
        Thread.sleep(2000);
    }


    @Test
    public void test2(){
        Driver.get().get("https://www.amazon.com");



    }


}
