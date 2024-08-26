package starProjection


import kotlin.reflect.KClass

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object StringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object IntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}

object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")

}

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    validators[String::class] = StringValidator
    validators[Int::class] = IntValidator
//    validators[String::class] !!.validate("")

    val stringValidator = validators[String::class] as FieldValidator<String>
    println(stringValidator.validate(""))

    val missValidator = validators[Int::class] as FieldValidator<String>
    println(missValidator.validate(""))

    Validators.registerValidator(String::class, StringValidator)
    Validators.registerValidator(Int::class, IntValidator)

    println(Validators[String::class].validate("kotlin"))
    println(Validators[Int::class].validate(522))
//    println(Validators[String::class].validate(42))
}