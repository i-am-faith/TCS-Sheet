import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        StringBuilder sb = new StringBuilder();
        String[] str = input.split("\\s+");
        for(int i=str.length-1;i>=0;i--)
        {
            sb.append(str[i] + " ");
        }

        return sb.toString().trim();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}