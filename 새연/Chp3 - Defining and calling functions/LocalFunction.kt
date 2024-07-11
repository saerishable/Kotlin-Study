import java.net.InetAddress
import javax.xml.validation.Validator

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name"
        )
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.address}: empty Address"
        )
    }

    /* user를 DB에 저장 */
}

fun saveUserLocal(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    /* user를 DB에 저장 */
}

fun saveUserLocalParameter(user: User) {
    fun validate(value: String, fieldName: String) { // 바깥 함수의 user 파라미터의 중복 사용을 피함
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id} " + "empty $fieldName"
            )
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    /* user를 DB에 저장 */
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName" // User의 프로퍼티 직접 사용 가능
            )
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUserExtracted(user: User) {
    user.validateBeforeSave() // 확장 함수 호출

    /* user를 DB에 저장 */
}

fun main() {
    saveUserLocal(User(1, "", ""))
}