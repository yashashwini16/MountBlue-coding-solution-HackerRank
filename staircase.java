/*Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######*/
class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.println(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.println("#");
        }
    }
    System.out.println();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}