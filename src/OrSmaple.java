
public class OrSmaple {

    public static void main(String[] args) {
        int scoreSansu = 80;
        int scoreKokugo = 80;
        
        if (scoreSansu >= 60 && scoreKokugo >= 60) {
            System.out.println("合格しています！");
        } else if (scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.println("算数か国語が補講対象です");
        } else {
            System.out.println("赤点です...補講を行います");
            
        }

    }

}
