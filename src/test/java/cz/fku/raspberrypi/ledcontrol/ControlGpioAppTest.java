package cz.fku.raspberrypi.ledcontrol;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.InterruptedIOException;

/**
 * Unit test for simple App.
 */
public class ControlGpioAppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ControlGpioAppTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ControlGpioAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws InterruptedException
    {
        ControlGpioApp.main(null);
    }
}
