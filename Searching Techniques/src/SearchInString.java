
public class SearchInString {
    
    public static void main(String[] args) {
        String name = "Bodhisattva";
        char target = 'x';
        System.out.println(search(name, target));
    }

    public static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int index = 0; index < name.length(); index++) {

            if (name.charAt(index) == target) {
                return true;
            }
        }
        return false;
    }
}
