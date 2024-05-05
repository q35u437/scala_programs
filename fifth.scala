/*
A Scalafunction that reads marks of ‘n’ students of a class and displays the class average. 
Also if more than 2 students have marks less than class average, display a suitable message. 
*/

object fifth{
    def main(args:Array[String]):Unit = {
        print("enter number of students: ");
        var length = scala.io.StdIn.readInt();
        var array = new Array[Int](length); 
        for(index <- 0 to length-1){
            var value = scala.io.StdIn.readInt();
            array(index) = value;
        }
        var avg : Float = (array.sum).toFloat / length;
        print(s"the average of marks is: ${avg}")
        var counter = array.count(a => a < avg);
        if(counter >= 2){
            print("\nEwwwww toppers");
        }
    }
}