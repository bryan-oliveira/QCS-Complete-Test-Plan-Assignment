package mei.qcs.insulincalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class InsulinCalculatorTest {
    
    public InsulinCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void TS1() {
        System.out.println("Test case TS1");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 60;
        int p2 = 10;
        int p3 = 120;
        int p4 = 80;
        int p5 = 15;
        assertEquals(23, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void T23() {
        System.out.println("Test case TS2");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 120;
        int p2 = 15;
        int p3 = 250;
        int p4 = 120;
        int p5 = 100;
        assertEquals(5, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS3() {
        System.out.println("Test case TS3");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 60;
        int p2 = 12;
        int p3 = 200;
        int p4 = 100;
        int p5 = 25;
        assertEquals(14, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS4() {
        System.out.println("Test case TS4");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 120;
        int p2 = 14;
        int p3 = 170;
        int p4 = 100;
        int p5 = 60;
        assertEquals(8, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS5() {
        System.out.println("Test case TS5");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 59;
        int p2 = 12;
        int p3 = 180;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS6() {
        System.out.println("Test case TS6");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 9;
        int p3 = 180;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS7() {
        System.out.println("Test case TS7");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 12;
        int p3 = 119;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS8() {
        System.out.println("Test case TS8");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 12;
        int p3 = 180;
        int p4 = 79;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS9() {
        System.out.println("Test case TS9");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 12;
        int p3 = 180;
        int p4 = 100;
        int p5 = 14;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS10() {
        System.out.println("Test case TS10");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 121;
        int p2 = 12;
        int p3 = 180;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS11() {
        System.out.println("Test case TS11");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 16;
        int p3 = 180;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS12() {
        System.out.println("Test case TS12");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 12;
        int p3 = 251;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS13() {
        System.out.println("Test case TS13");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 12;
        int p3 = 180;
        int p4 = 121;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS14() {
        System.out.println("Test case TS14");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 12;
        int p3 = 180;
        int p4 = 100;
        int p5 = 101;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS15() {
        System.out.println("Test case TS15");
        InsulinCalculator instance = new InsulinCalculator();

        String p1 = 't';
        int p2 = 12;
        int p3 = 180;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
        
    }
    
    @Test
    public void TS16() {
        System.out.println("Test case TS9");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p1 = 90;
        String p2 = '';
        int p3 = 180;
        int p4 = 100;
        int p5 = 14;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));
        
    
    }
    
    @Test
    public void TS17() {
        System.out.println("Test case TS17");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p1 = 90;
        int p2 = 12;
        int p3 = 180-;
        int p4 = 100;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
    }
    
    @Test
    public void TS18() {
        System.out.println("Test case TS18");
        InsulinCalculator instance = new InsulinCalculator();
        int p1 = 90;
        int p2 = 12;
        int p3 = 180;
        float p4 = 80.1;
        int p5 = 50;
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));  
        
    
    }
    
    @Test
    public void TS19() {
        System.out.println("Test case TS19");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p1 = 90;
        int p2 = 12;
        int p3 = 180;
        int p4 = 100;
        String p5 = 'nt';
        assertEquals(-1, instance.mealtimeInsulinDose(p1, p2, p3, p4, p5));    
        
    }
    
    @Test
    public void TB1() {
        System.out.println("Test case TB1");
        InsulinCalculator instance = new InsulinCalculator();
        int p6 = 40;
        assertEquals(11, instance.backgroundInsulinDose(p6));    
    }

    @Test
    public void TB2() {
        System.out.println("Test case TB2");
        InsulinCalculator instance = new InsulinCalculator();
        int p6 = 130;
        assertEquals(36, instance.backgroundInsulinDose(p6));    
    }
    
    @Test
    public void TB3() {
        System.out.println("Test case TB3");
        InsulinCalculator instance = new InsulinCalculator();
        int p6 = 60;
        assertEquals(17, instance.backgroundInsulinDose(p6));    
    }
    
    @Test
    public void TB4() {
        System.out.println("Test case TB4");
        InsulinCalculator instance = new InsulinCalculator();
        int p6 = 90;  
        assertEquals(25, instance.backgroundInsulinDose(p6));    
    }
    
    @Test
    public void TB5() {
        System.out.println("Test case TB5");
        InsulinCalculator instance = new InsulinCalculator();
        int p6 = 39;
        assertEquals(-1, instance.backgroundInsulinDose(p6));    
    }
    
    @Test
    public void TB6() {
        System.out.println("Test case TB6");
        InsulinCalculator instance = new InsulinCalculator();
        int p6 = 131;
        assertEquals(-1, instance.backgroundInsulinDose(p6));    
    }
    
    @Test
    public void TB7() {
        System.out.println("Test case TB7");
        InsulinCalculator instance = new InsulinCalculator();
        
        float p6 = 50.5;
        assertEquals(-1, instance.backgroundInsulinDose(p6));    
        
    }
    
    
    @Test
    public void TP1() {
        System.out.println("Test case TP1");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 0;
        int[] p8 = {0,0,0,0,0};
        int[] p9 = {15,15,15,15,15};
        assertEquals(0, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP2() {
        System.out.println("Test case TP2");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 10;
        int[] p8 = {10,10,10,10,10};
        int[] p9 = {100,100,100,100,100};
        assertEquals(0, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP3() {
        System.out.println("Test case TP3");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {1,3,5,7,10};
        int[] p9 = {15,35,55,75,100};
        assertEquals(54, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP4() {
        System.out.println("Test case TP4");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {7,6,5,4,3};
        int[] p9 = {80,70,60,50,40};
        assertEquals(60, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP5() {
        System.out.println("Test case TP5");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 6;
        int[] p8 = {2,8};
        int[] p9 = {32,83};
        assertEquals(66, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP6() {
        System.out.println("Test case TP6");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 4;
        int[] p8 = {1,6,8,9};
        int[] p9 = {32,61,91,88};
        assertEquals(53, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP7() {
        System.out.println("Test case TP7");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {5};
        int[] p9 = {60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP8() {
        System.out.println("Test case TP8");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {5,5,5,5,5,5,5,5,5,5,5};
        int[] p9 = {60,60,60,60,60,60,60,60,60,60,60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP9() {
        System.out.println("Test case TP9");
        InsulinCalculator instance = new InsulinCalculator();
        
            int p7 = -1;
            int[] p8 = {5,5,5,5,5};
            int[] p9 = {60,60,60,60,60};
            assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP10() {
        System.out.println("Test case TP10");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {-1,-1,-1,-1,-1};
        int[] p9 = {60,60,60,60,60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP11() {
        System.out.println("Test case TP11");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {5,5,5,5,5};
        int[] p9 = {14,14,14,14,14};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP12() {
        System.out.println("Test case TP12");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 11;
        int[] p8 = {5,5,5,5,5};
        int[] p9 = {60,60,60,60,60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
           
    }
    
    @Test
    public void TP13() {
        System.out.println("Test case TP13");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {11,11,11,11,11};
        int[] p9 = {60,60,60,60,60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP14() {
        System.out.println("Test case TP14");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {5,5,5,5,5};
        int[] p9 = {101,101,101,101,101};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP15() {
        System.out.println("Test case TP15");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        int[] p8 = {5,5,5,5};
        int[] p9 = {60,60,60,60,60,60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP16() {
        System.out.println("Test case TP16");
        InsulinCalculator instance = new InsulinCalculator();
        
        String p7 = 't';
        int[] p8 = {5,5,5,5,5};
        int[] p9 = {60,60,60,60,60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    @Test
    public void TP17() {
        System.out.println("Test case TP17");
        InsulinCalculator instance = new InsulinCalculator();
        
        int p7 = 5;
        String[] p8 = {'t','e','s','t','s'};
        int[] p9 = {60,60,60,60,60};
        assertEquals(-1, instance.personalSensitivityToInsulin(p7, p8, p9));    
        
    }
    
    
}
