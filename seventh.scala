/*
Write a Scala program to remove single and multiple elements from a given list
*/


object checking{
    def main(args:Array[String]):Unit = {
        print("enter list elements: ");
        var list = scala.io.StdIn.readLine().split(" ").map(a => a.toInt);
        //removing one element
        list = list.filter(a => a != 1);
        list.foreach(a => print(s"${a} "));

        println();
        //removing multiple elements
        var amg = List.empty[Int];
        amg = 1::2::3::4::amg
        list = list.filterNot(a => amg.contains(a));
        list.foreach(a => print(s"${a} "));

    }
}