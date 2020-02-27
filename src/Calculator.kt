import java.lang.Exception
import Operation.*

@Throws(ArithmeticException::class)
fun main() {
    var result = 0.0
    loop@ do {
        try {
            var param1 = StringLib.ReadParameter("parameter 1: ")
            var param2 = StringLib.ReadParameter("parameter 2: ")
            var params = ParameterStore(param1, param2)

            print("operation: + - * /  ")
            result = when (readLine()!!) {
                ADD.operator -> params.Param1?.plus(params.Param2!!) ?: 0.0
                SUBTRACT.operator -> param1?.minus(param2!!) ?: 0.0
                MULTIPLY.operator -> (if (param1 == null || param2 == null) {
                    0.0
                } else param1 * param2)
                DIVIDE.operator -> (if (param1 == null || param2 == null) {
                    0.0
                } else if (param2 == 0.0) throw ArithmeticException()
                else param1 / param2)
                "@" -> break@loop
                else -> {
                    throw Exception(StringLib.WRONG_OPERATION)
                }
            }
            params.result = result;
            println("params class: $params and result is ${params.result}")

        } catch (e: Exception) {
            println("${e.message}")
        }
    } while (true);
}
