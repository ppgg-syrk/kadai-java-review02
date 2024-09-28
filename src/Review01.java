
public class Review01 {

    public static void main(String[] args) {
        // 1500円の商品の税込価格は1650円（消費税は150円）です。
        //　価格はprice
        //　消費税はtax
        
        //　宣言と初期化と各変数名へ代入
        int price = 1500; //int型宣言　商品1500代入
        double tax = 0.1; //double型宣言　double型を消費税0.1代入
        int result;
        result = tax(price, tax);
        
     // 1500円の商品の税込価格は1650円（消費税は150円）です。
        System.out.println
        (price + "円の商品の税込価格は" + (price + result) + "円(消費税は" + result + "円)です。");
        }
    
    public static int tax(int price, double tax) {
        int result = (int) (price * tax);
        return result;
    }
        
}

