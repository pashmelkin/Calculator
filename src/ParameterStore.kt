data class ParameterStore constructor (val Param1:Double?,
                           val Param2:Double?,
                           var result:Double)
{
  constructor( Param1:Double?,
               Param2:Double?) : this (Param1, Param2, 0.0)
}
