package src.hubleED.Array;

public class TwoPointer {

    // Reverse worlds
    public static void main(String[] args) {

        String s1 = "car trap";
        char[] charArr = s1.toCharArray();

        int start = 0;

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ' ' || i == charArr.length - 1) {
                int end = (i == charArr.length - 1) ?  charArr.length - 1 : i - 1;

                while (start < end) {
                    char temp = charArr[start];
                    charArr[start] = charArr[end];
                    charArr[end] = temp;
                    start++;
                    end--;
                }

                start = i + 1;
            }
        }

        for (char item : charArr) {
            System.out.print(item + " ");
        }

    }
}
