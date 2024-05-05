/*
Write a Scala program to get the difference between the largest and smallest values in an 
array of integers. The length of the array must be 1 and above.
*/

import Array._

object checking{
    def main(args:Array[String]): Unit = {
        print("enter the array length: ");
        var length = scala.io.StdIn.readInt();
        while(length <= 1){
            print("please enter array of length > 1: ");
            length = scala.io.StdIn.readInt();
        }
        var myArray = new Array[Int](length);
        print("enter array elements: ");
        for(index <- 0 to length-1){
            var value = scala.io.StdIn.readInt();
            myArray(index) = value;
        }
        myArray = myArray.sortWith((a, b) => a < b);
        print("the sorted array is: ");
        myArray.foreach(a => print(s"${a} "));
    }
}