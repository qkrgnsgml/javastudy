package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FirstLevel8 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();
        for (int move : moves) {
            for (int i=0; i<board.length;i++){
                if(board[i][move-1]==0){
                    continue;
                }else {
                    stack.add(board[i][move-1]);
                    board[i][move-1] =0;
                    if(stack.size()<=1){
                        break;
                    }else if(stack.get(stack.size()-1)==stack.get(stack.size()-2)){
                        stack.remove(stack.size()-2);
                        stack.remove(stack.size()-1);
                        answer+=2;
                        break;
                    }else {
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] a = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] b = {1,5,3,5,1,2,1,4};
        FirstLevel8 firstLevel8 = new FirstLevel8();
        System.out.println(firstLevel8.solution(a,b));

    }
}
