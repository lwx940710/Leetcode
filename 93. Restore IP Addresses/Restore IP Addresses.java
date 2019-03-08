class Solution {
    public static List<String> restoreIpAddresses(String s) {
        HashSet<String> set = new HashSet<>();

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                for (int m = 1; m < 4; m++) {
                    for (int n = 1; n < 4; n++) {
                        if (i + j + m + n == s.length()) {
                            String si = s.substring(0, i);
                            String sj = s.substring(i, i + j);
                            String sm = s.substring(i + j, i + j + m);
                            String sn = s.substring(i + j + m, i + j + m + n);
                            if (!isValid(si) || !isValid(sj) || !isValid(sm) || !isValid(sn)) {
                                continue;
                            }
                            String str = si + "." + sj + "." + sm + "." + sn;
                            if (!set.contains(str)) {
                                set.add(str);
                            }
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    private static boolean isValid(String s) {
        if (s.length() == 0 || s.length() > 3 || (s.length() > 1 && s.charAt(0) == '0')
                || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}