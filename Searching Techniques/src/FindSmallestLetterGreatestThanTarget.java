
public class FindSmallestLetterGreatestThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'g';
        FindSmallestLetterGreatestThanTarget obj = new FindSmallestLetterGreatestThanTarget();
        System.out.println(obj.nextGreatestLetter(letters, target));

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            char midValue = letters[mid];
            if (target == midValue) {
                low = mid + 1;
            } else if (target > midValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return letters[low];
    }
}
