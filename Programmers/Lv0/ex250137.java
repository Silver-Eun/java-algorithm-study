package Lv0;

import java.util.Scanner;

public class ex250137 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ex250137 outer = new ex250137();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {

            int t = bandage[0];
            int x = bandage[1];
            int y = bandage[2];

            int currentHealth = health;
            int lastAttackTime = 0;

            for (int[] attack : attacks) {

                int attackTime = attack[0];
                int damage = attack[1];

                int healTime = attackTime - lastAttackTime - 1;

                currentHealth += healTime * x;

                if (healTime >= t) {
                    currentHealth += (healTime / t) * y;
                }

                currentHealth = Math.min(currentHealth, health);

                currentHealth -= damage;

                if (currentHealth <= 0) {
                    return -1;
                }

                lastAttackTime = attackTime;
            }

            return currentHealth;
        }
    }
}