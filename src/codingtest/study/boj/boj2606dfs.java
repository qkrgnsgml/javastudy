package codingtest.study.boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj2606dfs {
    static int cnt = 0; // 감염시킨 컴퓨터 수

    // DFS 메소드
    static void dfs(int[][] a, boolean[] check, int v) {
        if(check[v]==true) return; // 재귀호출 종료 부

        check[v] = true; // 방문처리 후
        cnt++; // 감염된 컴퓨터 수 증가, 여기엔 최초 방문 1번 컴퓨터도 포함된다.

        for(int i=0;i<a[v].length;i++) { // 인접행렬을 탐색
            if(a[v][i]==1 && !check[i]) // 연결된 정점이면서 방문하지 않은 경우
                dfs(a,check,i); // DFS 수행
        }
    }

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 정점의 수
        int e = in.nextInt(); // 간선의 수

        int a[][] = new int[n+1][n+1]; // 그래프를 인접행렬로 표시
        boolean check[] = new boolean[n+1]; // 정점 방문 여부 배열

        for(int i=0;i<e;i++) { // 인접행렬을 통한 연결정보 저장
            int v1 = in.nextInt();
            int v2 = in.nextInt();

            a[v1][v2] = 1;
            a[v2][v1] = 1;
        }

        dfs(a,check,1); // DFS 수행

        System.out.println(cnt-1); // 1번 컴퓨터는 제외해야 하므로 -1을 해준다.

    }



    public class boj2606bfs {
        static int node[][]; // 그래프 배열
        static int check[]; // 방문 배열
        static void bfs(int start) { // BFS 메소드
            Queue<Integer> queue = new LinkedList<>();

            check[start] =1;
            queue.offer(start);
            int cnt = 0; // 감염 된 컴퓨터의 수
            while(!queue.isEmpty()) {
                int x = queue.poll();

                for(int i=1;i<node.length;i++) { // 차례대로 1번과 연결 된 컴퓨터들을 찾아 cnt변수 증가
                    if(node[x][i]==1 && check[i]!=1) {
                        queue.offer(i);
                        check[i] = 1;
                        cnt++;
                    }
                }
            }
            System.out.println(cnt); //모든 탐색을 마치고 cnt 출력
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n= sc.nextInt(); // 컴퓨터의 수
            int m = sc.nextInt(); // 네트워크 상에 연결되어 있는 컴퓨터 쌍의 수 즉, 간선의 수

            node=new int[n+1][n+1];
            check = new int[n+1];
            for(int i=0;i<m;i++) { // 그래프 구성
                int a=sc.nextInt();
                int b = sc.nextInt();
                node[a][b]=1;
                node[b][a]=1;

            }

            bfs(1);


        }

    }
}


