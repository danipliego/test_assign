
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestVatCalculator{
    private static VatCalculator cc;

    @BeforeClass
    public static void setup(){
        cc = new VatCalculator();
    }

    // test case 1
    // daniel pliego test case
    @Test
    public void test_Vat_UK(){
        assertEquals(120, cc.VAT_UK(100));
    }

    @Test
    public void test_Vat_SWE() { assertEquals( 125, cc.VAT_SWE(100)); }

    @Test
    public void test_Vat_SPN() { assertEquals( 15, cc.VAT_SPN(100)); }

}