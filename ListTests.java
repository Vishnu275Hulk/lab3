import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    
    @Test
    public void testfilter1(){
        String[] array = {"abc", "defg", "hijkl"};
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        assertEquals(list, ListExamples.filter(list, (s) -> true));
    }

    @Test 
    public void testmerge(){
        
    }
}
