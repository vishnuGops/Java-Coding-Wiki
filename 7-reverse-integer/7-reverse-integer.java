class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        boolean neg = false;
        if (s.charAt(0) == '-') {
            neg = true;
            s = s.substring(1, s.length());
        }
        StringBuilder sb = new StringBuilder(s);
        String revstr = sb.reverse().toString();
        int y=0;
        try {
            y = Integer.parseInt(revstr);
        } catch(Exception e) {
            return 0;
        }
        if(neg) {
            y = y * -1;
        }
        return y;
    }
}