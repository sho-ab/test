import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Output {
    public static void main(String[] args) {
        Currentdate();
        TaskRandom();
        sum1();
        sum2();
    }
    private static void Currentdate(){
        Date now=new Date();
        System.out.println(now);
    }
    private static void TaskRandom(){
        List<String> list = Arrays.asList("りんご","メロン","バナナ");//３つの要素を持つリスト
        int index = new Random().nextInt(list.size());//ランダムに選択された0以上3未満の整数
        String result = list.get(index);

        System.out.println(result);

    }
    public static void sum1() {
        int y = 0;
        for (int i = 1; i < 100; i = i + 2) {
            y += i;
        }
        System.out.println(y);
    }
    private static void sum2(){
        int z= 0;
        for(int x = 0; x <= 100; x = x + 2) {
            z += x;
        }
        System.out.println(z);
    }
}