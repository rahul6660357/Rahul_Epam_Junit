package RahulEpam_junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testing {
    @Test
    public void t1()
    {
        StringQues st = new StringQues();
        String s1 = st.removeA("ABCD");
        assertEquals("BCD",s1);
    }
    @Test
    public void t2()
    {
        StringQues st = new StringQues();
        String s1 = st.removeA("AACD");
        assertEquals("CD",s1);
    }
    @Test
    public void t3()
    {
        StringQues st = new StringQues();
        String s1 = st.removeA("BACD");
        assertEquals("BCD",s1);
    }
    @Test
    public void t4()
    {
        StringQues st =new StringQues();
        String s1 = st.removeA("BBAA");
        assertEquals("BBAA",s1);
    }
    @Test
    public  void t5()
    {
        StringQues st = new StringQues();
        String s1 = st.removeA("AABAA");
        assertEquals("BAA",s1);
    }
}
