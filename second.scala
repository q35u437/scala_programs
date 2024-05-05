// Write a Scala program to find the common elements between two arrays of strings.

object checking{
    def main(args:Array[String]): Unit = {
        print("enter the length of array 1: ");
        var length1 = scala.io.StdIn.readInt();
        print("enter the length of array 2: ");
        var length2 = scala.io.StdIn.readInt();
        var array1 = new Array[String](length1);
        var array2 = new Array[String](length2);
        print("enter elements of array 1: ");
        for(index <- 0 to length1-1){
            var value = scala.io.StdIn.readLine();
            array1(index) = value;
        }
        print("enter elements of array 2: ");
        for(index <- 0 to length2-1){
            var value = scala.io.StdIn.readLine();
            array2(index) = value;
        }
        print("the common strings are: ");
        array1.intersect(array2).foreach(a => println(a));
    }
}