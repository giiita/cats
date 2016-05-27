package cats
package std

trait AnyValInstances
  extends IntInstances
  with    ByteInstances
  with    CharInstances
  with    LongInstances
  with    ShortInstances
  with    FloatInstances
  with    DoubleInstances
  with    BooleanInstances
  with    UnitInstances
  with    TupleInstances

trait IntInstances extends cats.kernel.std.IntInstances {
  implicit val catsShowForcatsForInt: Show[Int] = Show.fromToString[Int]
}

trait ByteInstances extends cats.kernel.std.ByteInstances {
  implicit val catsShowForByte: Show[Byte] = Show.fromToString[Byte]
}

trait CharInstances extends cats.kernel.std.CharInstances {
  implicit val catsShowForChar: Show[Char] = Show.fromToString[Char]
}

trait ShortInstances extends cats.kernel.std.ShortInstances {
  implicit val catsShowForShort: Show[Short] = Show.fromToString[Short]
}

trait LongInstances extends cats.kernel.std.LongInstances {
  implicit val catsShowForLong: Show[Long] = Show.fromToString[Long]
}

trait FloatInstances extends cats.kernel.std.FloatInstances {
  implicit val catsShowForFloat: Show[Float] = Show.fromToString[Float]
}

trait DoubleInstances extends cats.kernel.std.DoubleInstances {
  implicit val catsShowForDouble: Show[Double] = Show.fromToString[Double]
}

trait BooleanInstances extends cats.kernel.std.BooleanInstances {
  implicit val catsShowForBoolean: Show[Boolean] = Show.fromToString[Boolean]
}

trait UnitInstances extends cats.kernel.std.UnitInstances {
  implicit val catsShowForUnit: Show[Unit] = Show.fromToString[Unit]
}
