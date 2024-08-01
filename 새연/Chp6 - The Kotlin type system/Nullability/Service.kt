package `Chp6 - The Kotlin type system`.Nullability



class Service {
    fun performAction(): String = "foo"
}

class Test {
    private lateinit var service: Service

//    @Before
//    fun setUp() {
//        service = Service()
//    }
//
//    @Test
//    fun test() {
//        Assert.assertEquals("foo", service!!.performAction())
//    }
}

