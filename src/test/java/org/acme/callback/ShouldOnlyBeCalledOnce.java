package org.acme.callback;

/**
 * @author Marc Savy {@literal <marc@blackparrotlabs.io>}
 */
public class ShouldOnlyBeCalledOnce implements io.quarkus.test.junit.callback.QuarkusTestBeforeClassCallback {

    @Override
    public void beforeClass(Class<?> testClass) {
        System.err.println("Called " + ShouldOnlyBeCalledOnce.class.getCanonicalName());
    }
}
