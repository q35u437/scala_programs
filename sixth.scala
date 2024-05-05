/*
A Scala function to find the Number Occurring Odd Number of Times in an list. 
*/

object checking{
    def main(args:Array[String]) : Unit = {
        print("enter the array length: ");
        var length = scala.io.StdIn.readInt();
        var array = new Array[Int](length);
        print("enter array elements: ");
        for(index <- 0 to length-1){
            var value = scala.io.StdIn.readInt();
            array(index) = value;
        }
        array = array.sortWith((a,b) => a< b);
        var index = 0;
        var answer = List.empty[Int];
        while(index <= length-1){
            var prev = array(index);
            var count = 0;
            while(index <= length-1 && array(index) == prev){
                count += 1;
                index += 1;
            }

            if(count % 2 == 1){
                answer = prev :: answer;
            }
        }
        print("elements appearing odd number of times are: ");
        answer.foreach(a => println(a));
    }
}