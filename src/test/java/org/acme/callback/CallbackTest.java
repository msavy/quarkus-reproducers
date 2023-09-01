package org.acme.callback;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Savy {@literal <marc@blackparrotlabs.io>}
 */
@QuarkusTest
public class CallbackTest {

    @Test
    @Order(1)
    public void a() {
        System.out.println("Test a");
    }

    @Test
    @Order(2)
    public void b() {
        System.out.println("Test b");
    }

    @Test
    @Order(3)
    public void c() {
        System.out.println("Test c");
    }
}
