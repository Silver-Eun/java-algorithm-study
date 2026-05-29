package Lv0;

import java.util.Scanner;

public class ex181885 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.close();
    }

    class Solution {
        public String[] solution(String[] todo_list, boolean[] finished) {
            int count = 0;

            for (int i = 0; i < finished.length; i++) {
                if (!finished[i]) {
                    count++;
                }
            }

            String[] answer = new String[count];

            int idx = 0;
            for (int i = 0; i < todo_list.length; i++) {
                if (!finished[i]) {
                    answer[idx] = todo_list[i];
                    idx++;
                }
            }

            return answer;
        }
    }
}