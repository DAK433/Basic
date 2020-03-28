package t1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import p1.C1;

public class T1 {  
	  
    @Test  
    public void t1(){  
        assertEquals(4,C1.findMax(new int[]{1,3,4,2}));  
        
    }
    @Test  
    public void t2(){  
        
        assertEquals(-1,C1.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }
    @Test  
    public void t3(){  
        
        assertEquals(5,C1.findMax(new int[]{1,2,3,4,5}));  
    }
    
}  
