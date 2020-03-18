import com.example.edu.Person as User

fun main() {
    println("Hello Kotlin!")

    val person = User("Kildong", 20)
    val person2 = Person(123, "Kildong", "Programmer")

    println(person) //객체 식별자
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val jobTitle: String)
