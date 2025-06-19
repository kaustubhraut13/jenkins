package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJenkinsTest {
    @Test
    public void testSayHello() {
        HelloJenkins hello = new HelloJenkins();
        assertEquals("Hello Jenkins!", hello.sayHello());
    }
} 