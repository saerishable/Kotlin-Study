package annotation

import org.junit.*

class MyTest {
    @Test
    fun testTrue() {
        Assert.assertTrue(true)
    }

    @Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
    fun remove(index: Int) {
        TODO()
    }

}

const val TEST_TIMEOUT = 100L
@Test(timeout = TEST_TIMEOUT)
fun testMethod() {
    TODO()
}
