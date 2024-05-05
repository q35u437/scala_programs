// Check if a given number is an Armstrong number. 

object something{
    def pallind(number:Int, length: Int):Int = {
        var sum = 0;
        var num = number;
        while(num != 0){
            sum += (Math.pow((num % 10), length)).toInt;
            num = num / 10;
        }
        return sum;
    }
    def main(args:Array[String]):Unit = {
        var number = scala.io.StdIn.readLine();
        var length = number.length;
        var kk = number.toInt;
        if(kk == pallind(kk, length)){
            print(true);
        }else{
            print(false);
        }
    }
}
