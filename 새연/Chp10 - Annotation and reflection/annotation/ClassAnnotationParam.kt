package annotation

import kotlin.reflect.KClass

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company

data class Employee(
    val name: String,
    @DeserializeInterface(CompanyImpl::class) val company: Company
)

annotation class DeserializeInterface(val targetClass: KClass<out Any>)