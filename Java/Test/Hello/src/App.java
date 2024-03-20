public class App {

    public static void main(String[] args) throws Exception {
        Text text = new Text("\nHellow World!");        
        text.PrintText();
    }
}

class Text {
    
    private String string;

    public Text(){}
    public Text(String _string){
        string = _string;
    }

    public void SetText(String _string){
        string = _string;
    }
    
    public void PrintText(){
        System.out.println(string);
    }
}
