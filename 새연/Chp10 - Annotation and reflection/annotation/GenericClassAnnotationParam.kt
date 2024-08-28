package annotation

import java.util.Date
import kotlin.reflect.KClass

interface ValueSerializer<T>{
    fun toJsonValue(value: T): Any?
    fun fromJsonValue(jsonValue: Any?): T
}

data class User(
    val name: String,
    @CustomSerializer(DateSerializer::class) val birthDate: Date
)

annotation class CustomSerializer(
    val serializerClass: KClass<out ValueSerializer<*>>
)