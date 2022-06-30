import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    private Bun bun;

    @Before
    public void setup() {bun = new Bun(expectedName, expectedPrice);}

    private final String expectedName;
    private final float expectedPrice;

    public BunTest(String expectedName, float expectedPrice) {
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters(name = "Different buns")
    public static Object[][] getBunsData() {
        return new Object[][]{
                {"TESTTESTTEST",10},
                {"T",10},
                {"",10},
                {null,10},
        };
    }

    @Test
    public void getNameTest() {
        String actualName = bun.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPriceTest() {
        float actualPrice = bun.getPrice();

        assertEquals(expectedPrice, actualPrice, 0);
    }
}


