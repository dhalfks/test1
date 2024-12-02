import java.util.Arrays;

public class Test5 {

    public static void main(String[] args){
        Test5 test5 = new Test5();
        int result[] = null;
        result = test5.solution("NSSNEWWN");
        System.out.println(Arrays.toString(Arrays.stream(result).toArray()));
    }

    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
