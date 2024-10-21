package com.example;

// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
}