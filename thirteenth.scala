// A Scala function that reads a list and print the odd numbers in the list.

object collection{
    def main(args:Array[String]):Unit={
        print("enter list elements: ");
        var list = scala.io.StdIn.readLine().split(" ").map(a => a.toInt).toList;
        print("odd numbers in the list are: ");
        list.foreach(a => if (a % 2 == 1) print(s"${a} "));
    }
}