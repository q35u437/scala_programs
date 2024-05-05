// Write a Scala program to find the common elements between two arrays of integers.

object first{
    def main(args:Array[String]):Unit = {
        print("enter the length of array 1: ");
        var length1 = scala.io.StdIn.readInt();
        print("enter the length of array 2: ");
        var length2 = scala.io.StdIn.readInt();
        var array1 = new Array[Int](length1);
        var array2 = new Array[Int](length2);
        print("enter array 1 elements: ");
        for(index <- 0 to length1-1){
            var value = scala.io.StdIn.readInt();
            array1(index) = value;
        }
        print("enter array 2 elements: ");
        for(index <- 0 to length2-1){
            var value = scala.io.StdIn.readInt();
            array2(index) = value;
        }
        print("the common elements are: ");
        array1.intersect(array2).foreach(a=>print(s"${a} "));
    }
}