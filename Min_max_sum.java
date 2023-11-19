//Min-Max sum problem
/*Sample Input

1 2 3 4 5
Sample Output

10 14*/
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        long sum=0;
        for(int i=1;i<arr.size()-1;i++){
            sum+=arr.get(i);
        }
        System.out.println((sum+arr.get(0))+" "+(sum+arr.get(arr.size()-1)));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
