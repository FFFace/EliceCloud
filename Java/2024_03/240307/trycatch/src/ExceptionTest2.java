public class ExceptionTest2 {
    int num;


//      thorws MyException 을 작성함으로써,
//      MyException의 예ㅔ외 처리를 하지 않겠다는 의미.
//      ex)
//      public void printData() throws IOException, MyException {
//
//      }
    public void doExeption() throws MyException {
        if (num == 1) {
            System.out.println("OK");
        } else {
            throw new MyException("doException");
        }
    }

    public static void main(String[] args) {
        ExceptionTest2 app = new ExceptionTest2();
        app.num = 2;

        try {
            app.doExeption();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
