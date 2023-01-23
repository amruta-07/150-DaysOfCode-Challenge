public class MaxDistanceBtw_character {
    public static void main(String[] args) {
        String str = "my name is amruta";
        String removed_space = str.replaceAll("\\s", "");
        int start = removed_space.indexOf("a");
        int last = removed_space.lastIndexOf("a");
        // System.out.println(last + " " + start);

        int max_distance = last - start;
        System.out.println(max_distance);

    }
}
