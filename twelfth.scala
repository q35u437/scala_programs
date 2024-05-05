/*A Scala function to display all the duplicates elements in the list.*/

object collection{
  def main(args:Array[String]):Unit = {
    print("enter list elements: ");
    var list = scala.io.StdIn.readLine().split(" ").map(a => a.toInt).toList;
    var result = list.groupBy(identity).toList.filter((a,b) => b.length > 1);
    result.foreach((a,b) => print(s"${a} "));
  }
}