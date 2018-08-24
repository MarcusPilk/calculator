package FunctionTests;

import AppMain.CalcFunctions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalcFunctionTest {
    CalcFunctions calcFunctions;

    @Before
    public void setUp(){
        calcFunctions = new CalcFunctions();
    }

    @Test
    public void addTest(){
        calcFunctions.add(2,2);
        assertTrue(calcFunctions.add(2,2)==4);
    }
}
