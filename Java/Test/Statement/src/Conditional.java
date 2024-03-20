import java.util.Scanner;


// 조건문
public class Conditional{

    public void UI(){
        Scanner uiScan = new Scanner(System.in);
        String name;
        String pwd;

        while(true){
            System.out.print("# 메뉴를 선택 하세요. (1. 로그인  2. 메세지 확인  x. 종료)");
            String ui = uiScan.next();

            switch (ui) {
                case "1" : Login(); break;
                case "2" : Check(); break;
                case "x" : System.exit(0);
                default : System.out.println("## 잘못된 입력 입니다!");
            }   
        }
    }

    private void Login(){
        Scanner scan = new Scanner(System.in);

        System.out.print("## 아이디를 입력 하세요. : ");
        String name = scan.next();

        System.out.print("## 비밀번호를 입력 하세요. :");
        String pwd = scan.next();

        if(name.equals("jeon") && pwd.equals("1111")){
            System.out.println("## 로그인 성공!");
        }

        else{
            System.out.println("## 아이디 또는 비밀번호가 틀렸습니다!");
            return;
        }

        System.out.println("## 안녕하세요 " + name + "님!");
    }

    private void Check(){
        int cnt = 10;
        String msg = cnt > 0 ? "## 새로운 메세지가 있습니다!" : "## 새로운 메세지가 없습니다.";
        System.out.println(msg);   
    } 
}

