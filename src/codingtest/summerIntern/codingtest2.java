package codingtest.summerIntern;

import java.util.HashMap;
import java.util.List;

public class codingtest2 {
    public String[] solution(String[] rooms, int target) {
        String[] answer = {};
        String[] split;
        String[] split1;
        String replace = "";
        HashMap<String,Integer> myRoomCnt = new HashMap<>();
        HashMap<String,Integer> myRoomDis = new HashMap<>();
        HashMap<String, String> myRoomLoc = new HashMap<>();
        for (String room : rooms) {
            split = room.split("]");
            replace = split[0].replace("[", "");
            if(split[1].equals("None,Of,People,Here")){
                continue;
            }
            split1 = split[1].split(",");
            for (String s : split1) {
                myRoomLoc.put(s, myRoomLoc.get(s)+replace);
                if(myRoomCnt.containsKey(s)){
                    myRoomCnt.put(s,myRoomCnt.get(s)+1);
                    continue;
                }
                myRoomCnt.put(s,0);
            }
        } //사람마다 자기 지정 방 개수 나열
        for (String s : myRoomCnt.keySet()) {
            myRoomDis.put(s,0);
        }
        for (String s : myRoomLoc.keySet()) {
            myRoomCnt.put(s,myRoomLoc.get(s).split(",").length);
        }

        return answer;
    }
}
