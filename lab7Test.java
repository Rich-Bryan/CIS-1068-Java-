import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class jawsTest {
    //jaws tester = new jaws();
    @Test
    public void testRule1(){
        assertEquals("wateh", jaws.basicRule1("water"));
        assertEquals("I left my cah keys by the hahboh", jaws.basicRule1("I left my car keys by the harbor"));
    }

    @Test
    public void testRule2(){
        assertEquals("tunar", jaws.basicRule2("tuna"));
        assertEquals("Cubar", jaws.basicRule2("Cuba"));
        assertEquals("idear", jaws.basicRule2("idea"));
    }

    @Test
    public void testRule3(){
        assertEquals("wicked", jaws.basicRule3("very"));
    }

    @Test
    public void testExceptionRule1(){
        assertEquals("deeyah", jaws.exceptionRule1("deer"));

    }
    @Test
    public void testExceptionRule2(){
        assertEquals("doowah", jaws.exceptionRule2("door"));

    }

}
