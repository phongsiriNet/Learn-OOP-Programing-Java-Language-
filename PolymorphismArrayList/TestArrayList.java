package quizPolymorphismArrayList;
import java.util.*;
public class TestArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }

            ArrayList<Integer> query = new ArrayList<>();
            if (q == 1) {
                query.add(sc.nextInt());
                query.add(sc.nextInt());
            } else {
                query.add(sc.nextInt());
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.solve(n, a, q, query);

            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (q == 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}