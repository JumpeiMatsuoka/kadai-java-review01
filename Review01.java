
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        int nedan=1500;
        double Tax = 0.1;
        double result = tax(nedan,Tax);
        
        System.out.println(nedan+"の商品の税込価格は"+(nedan+(int)result)+"円（消費税は"+(int)result+"円）です。");
    }
            public static int tax(int nedan,double Tax){
            int result = (int)(nedan*Tax);
            return result;
           }
            }


