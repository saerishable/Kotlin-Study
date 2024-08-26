package runtime

import java.security.Provider.Service
import java.util.ServiceLoader

//val serviceImpl = ServiceLoader.load(Service::class.java)
val serviceImpl = loadService<Service>()

inline fun <reified T> loadService(): ServiceLoader<T>? {
    return ServiceLoader.load(T::class.java)
}

inline fun <reified T : Activity>
        Context.startActivity() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}

fun main() {
    startActivity<DetailActivity>()
}