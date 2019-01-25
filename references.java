import java.util.*;

class InterviewQuestion {
    /**
     *  1) What is the output of this program?
     *  2) What is the runtime complexity?
     */

    static void makeLists(int N) {
        ArrayList<List<Integer>> x = new ArrayList<>(); // [[]]
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1, 2, 3)); // [1, 2, 3]

        x.add(y);
        x.add(new ArrayList<>(Arrays.asList(3))); // Push [3] to x
        x.add(new ArrayList<>(Arrays.asList(7))); // Push [7] to x

        for (int i = 0; i < N; i++) {
            var z = new ArrayList<>(Arrays.asList(N)); // [N]
            if (i % 2 == 0) {
                x.add(2, y); // Insert at index 2
            }
            else {
                x.add(2, z); // Insert at index 2
            }
        }

        y.add(0, 100); // Insert at index 0
        x.get(0).add(5);
        x.get(1).add(10);

        System.out.println(y);
        System.out.println(x);
    }

    public static void main(String[] args) {
        makeLists(5);
    }
}
