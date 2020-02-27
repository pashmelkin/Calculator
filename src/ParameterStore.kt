data class ParameterStore  (val Param1:Double?,
                           val Param2:Double?,
                           private var _result:Double)
{
  constructor( Param1:Double?,
               Param2:Double?) : this (Param1, Param2, 0.0)
    var result : Double = _result
        get() = field - 1
        set(value : Double) {
            field = value + 1.0
        }
}
