class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (m.containsKey(magazine.charAt(i))) {
                m.put(magazine.charAt(i), m.get(magazine.charAt(i)) + 1);
            } else {
                m.put(magazine.charAt(i), 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (m.containsKey(c) && m.get(c) > 0) {
                m.put(c, m.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}