import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            // procedure start to sort string
            char tempArray[] = strs[i].toCharArray();

            // Sorting temp array using
            Arrays.sort(tempArray);
            String a = new String(tempArray);

            // procedure end to sort string

            if (ans.containsKey(a)) {
                ans.get(a).add(strs[i]);

            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                ans.put(a, temp);

            }

        }
        List<List<String>> result = new ArrayList<>();
        result.addAll(ans.values());
        return result;

    }
}
// HashMap<K, V>