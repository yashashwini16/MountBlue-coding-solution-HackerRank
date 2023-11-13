//Breaking the Records
/*Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4*/
class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int highests=scores.get(i);
    int lowests=scores.get(i);
    int max=0;
    int min=0;
    List<Integer> result=new ArrayList<>();
    for(int i=0;i<scores.size();i++){
        if(score>highests){
            highests=score;
            max++;
        }else if(score<lowests){
            lowests=score;
            min++;
        }
    }
    result.add(max);
    result.add(min);

    return result;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
