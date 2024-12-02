import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        int[] mats = {3,5,2};
        String[][] park =
                {
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "-1", "-1"},
                {"-1", "-1", "0", "-1"},
                {"-1", "-1", "-1", "-1"}
        };
        int result = m.solution(mats, park);
        System.out.println(result);
    }

    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int x_long = park[0].length; //8
        int y_long = park.length; //6
        int mat_num = 0;
        int numberOfMaxMat = mats.length;

        Arrays.sort(mats);
        int min_mat = mats[mat_num]; //2

        for(int i = 0; i < y_long - min_mat + 1; i++){
            for(int j = 0; j < x_long - min_mat + 1; j++){
                if(park[i][j].equals("-1")){
                    int flag = 0;
                    for(int k =0; k < min_mat; k++){
                        for(int l = 0; l < min_mat; l++){
                            if(park[i+k][j+l].equals("-1")){
                                continue;
                            }else{
                                flag = -1;
                                break;
                            }
                        }
                        if(flag == -1){
                            break;
                        }
                    }
                    if(flag == 0){
                        answer = min_mat;
                        mat_num++;
                        if(mat_num == numberOfMaxMat){
                            return answer;
                        }
                        else{
                            min_mat = mats[mat_num];
                        }
                    }
                    if(!(i < y_long - min_mat + 1)){
                        break;
                    }
                }
            }
        }

        return answer;
    }
}