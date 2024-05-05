/* Write a Scala program to remove duplicates from a given list. */

object checking{
    def main(args:Array[String]):Unit = {
        print("enter list elements: ");

        var list = scala.io.StdIn.readLine().split(" ").map(a => a.toInt).toList;

        list = list.toSet.toList;

        print("Unique elements are: ");

        list.foreach(a => print(s"${a} "));
    }
}