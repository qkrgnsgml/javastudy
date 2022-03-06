package codingtest;

import java.util.*;

public class FirstLevel1 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String,Integer> userReportCount = new LinkedHashMap<>();
        Map<String,Integer> userEmailCount = new LinkedHashMap<>();
        for (String userId : id_list) {
            userReportCount.put(userId,0);
            userEmailCount.put(userId,0);
        }

        Map<String, ArrayList<String>> reportList = new HashMap<>();
        for (String reports : report) {
            String[] split = reports.split(" ");
            if(reportList.containsKey(split[0])){
                ArrayList<String> stringList = reportList.get(split[0]);
                if(stringList.contains(split[1])){
                    continue;
                }
                Integer integer = userReportCount.get(split[1]);
                userReportCount.put(split[1],++integer);

                stringList.add(split[1]);
                reportList.put(split[0],stringList);
            }else {
                reportList.put(split[0], new ArrayList<>(Arrays.asList(split[1])));
                Integer integer = userReportCount.get(split[1]);
                userReportCount.put(split[1],++integer);
            }
        }
        for (String user : userReportCount.keySet()) {
            if(userReportCount.get(user)>=k){
                for (String s : reportList.keySet()) {
                    ArrayList<String> strings = reportList.get(s);
                    if(strings.contains(user)){
                        Integer integer = userEmailCount.get(s);
                        integer++;
                        userEmailCount.put(s,integer);
                    }
                }
            }
        }
        Collection<Integer> values = userEmailCount.values();
        int i=0;
        for (Integer value : values) {
            answer[i]= value;
            i++;
        }


        return answer;
    }

    public static void main(String[] args) {
        FirstLevel1 firstLevel1 = new FirstLevel1();
        String[] a = {"muzi", "frodo", "apeach", "neo"};
        String[] b = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int[] solution = firstLevel1.solution(a, b, 2);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
