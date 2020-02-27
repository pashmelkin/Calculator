package helper

class StringLib {

    companion object {
        const val WRONG_OPERATION = "Wrong operation"

        fun ReadParameter(prompt:String) : Double? {
            print(prompt)
            return readLine()?.toDouble()
        }
    }
}
