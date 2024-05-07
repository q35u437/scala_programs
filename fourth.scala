/*
Write a Scala program to find the two elements from a given array of positive and negative 
numbers such that their sum is closest to zero.
*/

object fourth{
    def main(args:Array[String]): Unit = {
        print("enter the array length: ");
        var length = scala.io.StdIn.readInt();
        var array = new Array[Int](length);
        print("enter array elements: ");
        for(index <- 0 to length-1){
            var value = scala.io.StdIn.readInt();
            array(index) = value;
        }
        var maxi = (1.0) / 0;
        var ele1 = -1;
        var ele2 = -1;
        for(i <- 0 to length-1){
            for(j <- i+1 to length-1){
                if(maxi.abs > (array(i) + array(j)).abs){
                    ele1 = array(i);
                    ele2 = array(j);
                    maxi = ele1 + ele2;
                }
            }
        }
        print(s"${ele1} ${ele2}");
    }
}
