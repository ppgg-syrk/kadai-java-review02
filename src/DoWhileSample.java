
public class DoWhileSample {

    public static void main(String[] args) {
        int num = 1;
        
        do {
            //　2の倍数を計算
            num = num *2;
            
            //　結果を出力
           System.out.println(num);
        } while(num < 1024); //繰り返し

    }

}
