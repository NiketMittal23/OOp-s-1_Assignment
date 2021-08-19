import scala.collection.mutable.ListBuffer
trait Queue{
  var listItem = new ListBuffer[Int]()
  def enqueue(item:Int)
  def dequeue(): Unit ={
    listItem.remove(0)
    val list =listItem.toList
    println(list)
  }
}
class DoubleQueue extends Queue {
  override def enqueue(item:Int): Unit = {
    listItem+=item*2
    val list = listItem.toList
    println(list)
  }
}
class SquareQueue extends Queue {
  override def enqueue(item:Int): Unit = {
    listItem+=item*item
    val list = listItem.toList
    println(list)
  }
}
object operations {
  def main(args: Array[String]): Unit = {
    val doubleQueue = new DoubleQueue()
    val squareQueue = new SquareQueue()
    println("OPERATIONS ON DOUBLEQUEUE")
    println()
    doubleQueue.enqueue(1)
    doubleQueue.enqueue(2)
    doubleQueue.enqueue(3)
    doubleQueue.enqueue(4)
    doubleQueue.dequeue()
    println()
    println("OPERATIONS ON SQUREQUEUE")
    println()
    squareQueue.enqueue(1)
    squareQueue.enqueue(2)
    squareQueue.enqueue(3)
    squareQueue.enqueue(4)
    squareQueue.dequeue()
  }
}
