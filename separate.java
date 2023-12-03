//Separate the numbers
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
    // Write your code here
        int length=s.length();
        boolean valid=false;
        long first=-1;
        for(int i=1;i<=length/2;i++){
            long curr=Long.parseLong(s.substring(0,i));
            first=curr;
            StringBuilder seq=new StringBuilder(String.valueOf(curr));
            
            while(seq.length()<length){
                curr++;
                seq.append(curr);
            }
            if(seq.toString().equals(s)){
                valid=true;
                break;
            }
        }
        if(valid){
            System.out.println("YES "+first);
        }else{
            System.out.println("NO");
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

