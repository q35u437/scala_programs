// A Scala function that reads a list and print the sum of even numbers in the list.


object checking{
    def main(args:Array[String]):Unit = {
        print("enter list elements: ");
        var list = scala.io.StdIn.readLine().split(" ").map(a => a.toInt).toList;
        var sumz = list.filter(a => a % 2 == 0).sum;
        print(sumz);
    }
}