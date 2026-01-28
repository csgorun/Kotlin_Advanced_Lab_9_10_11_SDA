//import kotlin.properties.Delegates
//
//class UserProfile(initialName: String, initialEmail: String){
//    var name: String by Delegates.observable(initialName) { _, old, new ->
//        println("Имя изменено: '$old' -> '$new'")
//    }
//    var email: String by Delegates.observable(initialEmail) { _, old, new ->
//        println("Email обновлен: '$old' -> '$new'")
//    }
//    val avatar: String by lazy{
//        println("Загружаем аватар для $name...")
//        "avatar_of_$name.png"
//    }
//}
//
//fun main(){
//    println("Создаем профиль пользователя...")
//    val user = UserProfile("Алиса", "alice@example.com")
//
//    println("\nИмя: ${user.name}")
//    println("\nEmail: ${user.email}")
//
//    println("\nОбращаемся к аватару впервые:")
//    println("Файл автара: ${user.avatar}")
//
//    println("\nОбращаемся к автару снова (должен быть взят из кеша):")
//    println("Файл автара: ${user.avatar}")
//
//    println("\nМеняем email:")
//    user.email = "alice_new@example.org"
//
//    println("\nМеняем имя:")
//    user.name = "Алиса К."
//
//}
