//Caesar cipher
/*Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb
*/


class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                char base=Character.isUpperCase(c)?'A':'a';
                res.append((char)((c-base+k)%26+base));
            }else{
                res.append(c);
            }
        }
        return res.toString();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
