/*
Write a Scala program to iterate over a list to print the elements and calculate the sum and 
product of all elements of this list.
*/

object checking{
    def main(args:Array[String]):Unit = {
        print("enter the list elements: ");
        var list = scala.io.StdIn.readLine().split(" ").map(a => a.toInt);
        
        //printing the elements
        print("the list elements are: ");
        list.foreach(a => print(s"${a} "));
        println();

        //finding sum of elements
        var sum = 0;
        list.foreach(a => sum += a);
        print(s"the sum of elements is: ${sum}");
        println();

        //find product of elements
        var p = 1;
        list.foreach(a => p *= a);
        print(s"the product of elements is: ${p}");
        println();
    }
}