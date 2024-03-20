public class Manufacturer {

    public String procedure(){
        return "아무런 재료도 없습니다.";
    }

    public String procedure(String str1){
        return "부품이 2개 부족합니다.";
    }

    public String procedure(String str1, String str2){
        return "부품이 1개 부족합니다.";
    }

    public String procedure(String str1, String str2, String str3){
        return "부품 확인 완료! 제작에 들어가겠습니다.";
    }
}
