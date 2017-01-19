/**

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

**/

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int temp = x ^ y;
        int result =0;
        String bits = Integer.toBinaryString(temp);
        for(int i=0;i<bits.length();i++){
            if(bits.charAt(i)=='1') result++;
        }
        return result;
    }
public static void main(String[] args){
	System.out.println(hammingDistance(1,4));
	
}
	
	}