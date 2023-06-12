package algorithm.stack

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class PlaceholderParseTest {
    @Test
    fun test(){
        val placeholderParse1 = PlaceholderParse("1{{abc}123}")
        assertTrue(placeholderParse1.placeholder.contains("abc") && placeholderParse1.placeholder.contains("{abc}123"))

        val placeholderParse2 = PlaceholderParse("1{{abc}123}{{abc}123}")
        assertTrue(placeholderParse2.placeholder.contains("abc") && placeholderParse2.placeholder.contains("{abc}123"))

        val placeholderParse3 = PlaceholderParse("123")
        assertTrue(placeholderParse3.placeholder.isEmpty())

        try{
            PlaceholderParse("{123")
            assertTrue(false)
        }catch (e:Exception){
            assertTrue(e is IllegalArgumentException)
        }

        try{
            PlaceholderParse("123}")
            assertTrue(false)
        }catch (e:Exception){
            assertTrue(e is IllegalArgumentException)
        }
    }
}