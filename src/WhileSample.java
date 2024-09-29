
public class WhileSample {

    public static void main(String[] ags) {
        int num = 1;
        
        // 繰り返しの条件（numが1024より小さい間
        while (num < 1024) {
            // 2の累乗を計算
            num = num * 2;
            
            // 結果を出力
            System.out.println(num);
        }
    }
}
