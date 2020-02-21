class StringLib {

    companion object {
        fun ReadParameter(prompt:String) : Double? {
            print(prompt)
            return readLine()?.toDouble()
        }
    }
}
