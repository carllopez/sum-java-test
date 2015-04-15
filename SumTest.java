import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class SumTest {
    
    @Test
    public void evaluatesSum() {
        
        // Sum sum = new Sum();
        ArrayList<String> matches = Sum.checkMatches();
        
        assertEquals(3, matches.size());
    
    }
}