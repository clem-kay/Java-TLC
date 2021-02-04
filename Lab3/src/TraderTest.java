import org.junit.Test;

import static org.junit.Assert.*;

public class TraderTest {
    private static final double DELTA = 1e-15;
    @Test
    public void TraderTest(){
        Trader trader = new Trader();
        double result;

        double totalTrade = trader.tradeAccount.getTotalTrade();

        trader.addTrade(25.9,4);
        result = (25.9*4);
        assertEquals(result,103.6,DELTA);
        assertEquals(0,0,DELTA);

        trader.addTrade(25.9,4);
        assertEquals(207.2,207.2,DELTA);
    }
}
