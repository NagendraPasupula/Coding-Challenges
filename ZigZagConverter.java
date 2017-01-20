/***
@Author: Venkata Nagendra Kumar Pasupula
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".


Logic: PAYPALISHIRING
rows : 12321232123212
Row1: PAHN
Row2: APLSIIG
Row3: YIR

Storage: StringBuider array 
Timecomplexity: O(n);
***/


public class ZigZagConverter {
    public static String convert(String s, int numRows) {
        if(s.length() <3 || numRows==1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
       int row =0;
       
       for(int j=0;j<s.length();j++){
           while(row < numRows && j<s.length())
                sb[row++].append(s.charAt(j++));
            
            row = numRows-1;
            while(row > 0 && j<s.length())
                sb[--row].append(s.charAt(j++));
            row = 1;
            j--;
       }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<numRows;i++){
            result.append(sb[i].toString());
        }
        return result.toString();
    }
	public static void main(String[] args){
		System.out.println(convert("ABCDEFGHIJKLMN", 3));
	}
}