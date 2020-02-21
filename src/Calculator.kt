import java.lang.Exception

@Throws(ArithmeticException::class)
fun main() {
    var result = 0.0
    loop@ do {
        try {
            var param1 = StringLib.ReadParameter("parameter 1: ")
            var param2 = StringLib.ReadParameter("parameter 2: ")

            print("operation: + - * /  ")
            when (readLine()!!) {
                "+" -> result = param1?.plus(param2!!) ?: 0.0
                "-" -> result = param1?.minus(param2!!) ?: 0.0
                "*" -> result = (if (param1 == null || param2 == null) {
                    0.0
                } else param1 * param2)
                "/" -> result = (if (param1 == null || param2 == null) {
                    0.0
                } else if (param2 == 0.0) throw ArithmeticException()
                else param1 / param2)
                "@" -> break@loop
                else -> {
                    throw Exception("Wrong operation")
                }
            }
            println("result is $result")
        } catch (e: Exception) {
            println("${e.message}")
        }
    } while (true);
}
