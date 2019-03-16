import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsPractice {

    StringPractice2 obj1;
    String [] values;

    @BeforeSuite
    public void beforeSuiteActivity(){
        System.out.println("BeforeSuite");
        obj1 = new StringPractice2();
    }


    @Test
    public void testCase1(){
        System.out.println("Test Case  - 1");
        values = obj1.getIndividualString();
        Assert.assertEquals(values[0].trim().toUpperCase(), "ATIN", "Test Case - 1, Failed");
    }

    @Test
    public void testCase2(){
        System.out.println("Test Case  - 2");
        values = obj1.getIndividualString();
        Assert.assertEquals(values[1].trim().toUpperCase(), "M", "Test Case - 2, Failed ");
    }

    @Test
    public void testCase3(){
        System.out.println("Test Case  - 3");
        values = obj1.getIndividualString();
        Assert.assertEquals(values[2].trim().toUpperCase(), "MISSISSAUGA", "Test Case - 2, Failed ");
    }

    @Test
    public void testCase4(){
        System.out.println("Test Case  - 4");
        values = obj1.getIndividualString();
        Assert.assertEquals(values[3].trim().toUpperCase(),"JAVA", "Test Case - 2, Failed ");
    }


    @BeforeMethod
    public void beforeMethodActivity(){
        System.out.println("Before Method");

    }

    @AfterMethod
    public void afterMethodActivity(){
        System.out.println("After Method");

    }

}
