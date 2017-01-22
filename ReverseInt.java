/****
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
Note: check overflow 

***/
class ReverseInt{
public static int reverse(int x) {
     int result =0;
     int rev = x;
     while(x != 0){
         if((result*10)/10 == result){
         result = (result*10)+(Math.abs(x%10));
         x = x/10;}
         else{
             return 0;
         }
         
     }
     
        return rev>0?result:-result;
    }
public static void main(String[] args){
System.out.println(reverse(178290032));
}
	}
