import scala.reflect.runtime.universe._

object Test extends App {
  println(implicitly[WeakTypeTag[Byte]] eq WeakTypeTag.Byte)
  println(implicitly[WeakTypeTag[Byte]])
  println(implicitly[WeakTypeTag[Short]] eq WeakTypeTag.Short)
  println(implicitly[WeakTypeTag[Short]])
  println(implicitly[WeakTypeTag[Char]] eq WeakTypeTag.Char)
  println(implicitly[WeakTypeTag[Char]])
  println(implicitly[WeakTypeTag[Int]] eq WeakTypeTag.Int)
  println(implicitly[WeakTypeTag[Int]])
  println(implicitly[WeakTypeTag[Long]] eq WeakTypeTag.Long)
  println(implicitly[WeakTypeTag[Long]])
  println(implicitly[WeakTypeTag[Float]] eq WeakTypeTag.Float)
  println(implicitly[WeakTypeTag[Float]])
  println(implicitly[WeakTypeTag[Double]] eq WeakTypeTag.Double)
  println(implicitly[WeakTypeTag[Double]])
  println(implicitly[WeakTypeTag[Boolean]] eq WeakTypeTag.Boolean)
  println(implicitly[WeakTypeTag[Boolean]])
  println(implicitly[WeakTypeTag[Unit]] eq WeakTypeTag.Unit)
  println(implicitly[WeakTypeTag[Unit]])
  println(implicitly[WeakTypeTag[Any]] eq WeakTypeTag.Any)
  println(implicitly[WeakTypeTag[Any]])
  println(implicitly[WeakTypeTag[AnyVal]] eq WeakTypeTag.AnyVal)
  println(implicitly[WeakTypeTag[AnyVal]])
  println(implicitly[WeakTypeTag[AnyRef]] eq WeakTypeTag.AnyRef)
  println(implicitly[WeakTypeTag[AnyRef]])
  println(implicitly[WeakTypeTag[Object]] eq WeakTypeTag.Object)
  println(implicitly[WeakTypeTag[Object]])
  println(implicitly[WeakTypeTag[Null]] eq WeakTypeTag.Null)
  println(implicitly[WeakTypeTag[Null]])
  println(implicitly[WeakTypeTag[Nothing]] eq WeakTypeTag.Nothing)
  println(implicitly[WeakTypeTag[Nothing]])
}