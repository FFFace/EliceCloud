import java.util.Arrays;

public class workbook12 {
    public static int char2Int(char c) {
        if('a' <= c && c <= 'z') {
            return c - 'a';
        }
        else {
            return -1;
        }
    }

    public static char int2Char(int i) {
        if (0 <= i && i <= 25) {
            return (char)(i + 'a');
        }
        else {
            return ' ';
        }
    }

    public static void main(String args[]) {
        String word = "aworncjdvjQGOJSKejoappgWEkvXXXaSoemflQoekfmdkcGLKDoekfldmvAjsndfndSINEPVasiejfQDMFPBmSNDaixmdFLEfisldifEMDLF";
        word = word.toLowerCase();
        int[] alpCount = new int[26];
        for(int i=0; i<word.length(); i++){
            int num = char2Int(word.charAt(i));
            if(num >= 0){
                alpCount[num] += 1;
            }
        }

        int mostAlpabet = 0;
        int mostAlpabetIndex = -1;
        for (int i = 0; i < alpCount.length; i++) {
            if(mostAlpabet < alpCount[i]){
                mostAlpabet = alpCount[i];
                mostAlpabetIndex = i;
            }
        }

        System.out.println(int2Char(mostAlpabetIndex));
    }
}
