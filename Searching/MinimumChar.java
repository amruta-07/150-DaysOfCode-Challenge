// search="armaze"
// result=amazon
/**
 * MinimumChar
 */
public class MinimumChar {
    public int get_minChar(String result, String search) {
        int search_index = 0;
        int result_index = 0;
        while (search_index < search.length()) {
            if (search.charAt(search_index) == result.charAt(result_index)) {
                result_index++;
            }
            search_index++;
        }
        return (result.length() - result_index);
    }

    public static void main(String[] args) {
        String search = "armaze";
        String result = "amazon";
        MinimumChar obj = new MinimumChar();

        int ans = obj.get_minChar(result, search);
        System.out.println(ans);

    }
}