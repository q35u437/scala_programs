/*Write a Scala program to get the difference between two given lists.*/

object checking{
    def main(args:Array[String]):Unit = {
        print("enter list elements: ");

        var list = scala.io.StdIn.readLine().split(" ").map(a => a.toInt).toList;

        list = list.toSet.toList;

        print("Unique elements are: ");

        list.foreach(a => print(s"${a} "));
    }
}