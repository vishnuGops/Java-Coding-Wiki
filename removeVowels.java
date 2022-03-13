public class removeVowels {
    public static void main(String[] args) {
        String s = "HelloWhatIs YourName";

        s = s.toLowerCase();
        String str = new String();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                continue;
            } else
                str += s.charAt(i);

        }
        System.out.println(str);
    }
}
