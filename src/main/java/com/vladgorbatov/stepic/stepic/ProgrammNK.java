package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammNK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] chain = new int[N];
        sc.close();
        chains(N, K, chain, 0);

    }


    static void chains(int N, int K, int[] chain, int index) {
        if (index == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(chain[i]);
                if (i < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            chain[index] = i;
            chains(N, K, chain, index + 1);
        }


    }
}
