package workbook2;

class GameSettingsManager{
    private static GameSettingsManager instance;

    private int volume;

    private GameSettingsManager(){}

    public static GameSettingsManager getInstance(){
        if(instance == null){
            instance = new GameSettingsManager();
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

public class Main {
    public static void main(String[] args) {
        GameSettingsManager settings1 = GameSettingsManager.getInstance();
        GameSettingsManager settings2 = GameSettingsManager.getInstance();

        System.out.println("싱글턴 구현 확인: " + (settings1 == settings2));

        System.out.println("현재 볼륨: " + settings1.getVolume());
        settings1.setVolume(5);
        System.out.println("볼륨을 5로 설정");
        System.out.println("현재 볼륨: " + settings1.getVolume());
        settings1.setVolume(10);
        System.out.println("볼륨을 10으로 설정");
        System.out.println("현재 볼륨: " + settings2.getVolume());
    }
}
