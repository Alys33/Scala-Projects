object CharactersFrequency extends App {

  def build(source: String, result: Map[Char, Int]): Map[Char, Int] =
    if (source.nonEmpty) {
      val char = source.head
      val frequency = result.getOrElse(char, 0) + 1
      build(source.tail, result.updated(char, frequency))
    } else result
    
  val input = scala.io.StdIn.readLine()
  println(build(input, Map.empty[Char, Int]).mkString(","))
}