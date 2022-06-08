import org.testng.Assert
import org.testng.annotations.*
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class UnitTest {
    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeMethod
    fun beforeTest(){
        System.setOut( PrintStream(outputStreamCaptor));    }
    @AfterMethod
    fun afterTest(){
            System.setOut(standardOut);

    }
    @Test(priority = 1)
    fun testCountFrequechyOfCharsPositive(){
        val list = mutableListOf('a','y','a','a','b')
        countFrequechyOfChars(list)
        Assert.assertEquals(" a : 3 b : 1 y : 1", outputStreamCaptor.toString())
    }


    @Test(priority = 2)
    fun testRemoveDuplicatesFromListPositive(){
        val list = mutableListOf('a','y','a','a','b')

        Assert.assertEquals( removeDuplicatesFromList(list).toString(), "[y, b, a]")
    }

}