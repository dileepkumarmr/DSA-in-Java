public class SmallestLetterCont {

    public static char nextGreatestLetter(char[] letters, char target) {
        // int start = 0;
        // int end = letters.length - 1;

        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (target < letters[mid]) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }

        // }
        // return letters[start % letters.length];

        char res = 'a';
        int low = 0;
        int high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                res = letters[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (res <= target) {
            return letters[0];
        }
        return res;

    }

    public static void main(String[] args) {
        // char[] letters = { 'c', 'f', 'g' };
        char[] letters = { 'x',  'y' };

        char target = 'z';

        System.out.println(nextGreatestLetter(letters, target));
    }

}
