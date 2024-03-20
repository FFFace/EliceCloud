class NewPlan {
    private String engine;
    private String body;
    private String wheel;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private int code;

    // 지시사항을 참고하여 코드를 작성해 보세요.

    NewPlan() {
        System.out.println("방금 생산된 차량에 코드가 부여되지 않았습니다.");
    }

    NewPlan(int newst_code) {
        this.code = newst_code;
    }

    public void turnOn(String state) {
        if (state.equals("on")) {
            engine = "on";
            wheel = "spin";
        }
    }

    public void selectTheColor(String color) {
        this.body = color;
    }
}
