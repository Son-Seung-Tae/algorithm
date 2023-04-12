import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class hash4 {

    int comb1(String[] arr, boolean[] visited, int start, int r) {
        int c = 0;
        if(r == 0) {
            c += print(arr, visited);
            return c;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

     int print(String[] arr, boolean[] visited) {
        ArrayList arr1 = new ArrayList();
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true) {
                arr1.add(arr[i]);
            }

        }

        System.out.println(Arrays.toString(arr1.toArray()));
        return 0;
    }

    public int del

    public int solution(String[][] clothes) {

        int answer = 0;
        ArrayList<String> list = new ArrayList();
        HashSet<String> hashSet = new HashSet<>();


        for(String[] s : clothes) {
            list.add(s[1]);
        }
        Collections.sort(list);
        System.out.println("list = " + list);

        System.out.println("-------- 1. 백트래킹 ---------");
        String[] arr = list.toArray(new String[0]);
        boolean[] visited = new boolean[arr.length];

        for(int r = 1; r <= arr.length; r++) {
            System.out.println("\n" + arr.length + "개 중에 " + r  + "개 뽑음");
            answer += comb1(arr, visited, 0, r);
        }

        System.out.println("answer = " + answer);
        return answer;
    }

}
