import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    String expectedType;

    public IngredientTypeTest(String expectedType) {
        this.expectedType = expectedType;
    }

    @Parameterized.Parameters(name = "Different ingredient types")
    public static Object[][] getIngredientTypeData() {
        return new Object[][]{
                {"SAUCE"},
                {"FILLING"}
        };
    }

    @Test
    public void checkIngredientTypeEnum() {
        assertEquals("No enum constant", expectedType, IngredientType.valueOf(expectedType).toString());
    }
}
