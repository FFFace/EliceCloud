package workbook1;

interface Basic { public abstract void reading(); public abstract void listening(); }
interface Intermediate { public abstract void speaking(); }
interface Advanced { public abstract void writing(); }

class ClassForm {
    String className;

    ClassForm(String className) {
        this.className = className;
    }
}


class ClassA extends ClassForm implements Basic, Intermediate, Advanced {

    ClassA(String className) { super(className); }

    public void reading() {
        System.out.println(super.className + "의 reading 수업은 " + "화 15시");
    }

    public void listening() {
        System.out.println(super.className + "의 listening 수업은 " + "수 18시");
    }

    public void speaking() {
        System.out.println(super.className + "의 speaking 수업은 " + "월 16시");
    }

    public void writing() {
        System.out.println(super.className + "의 writing 수업은 " + "금 13시");
    }

}



class ClassB extends ClassForm implements Basic, Intermediate {

    ClassB(String className) { super(className); }

    @Override
    public void reading() {
        System.out.println(super.className + "의 reading 수업은 " + "화 17시");
    }

    @Override
    public void listening() {
        System.out.println(super.className + "의 listening 수업은 " + "수 16시");
    }

    @Override
    public void speaking() {
        System.out.println(super.className + "의 speaking 수업은 " + "월 17시");
    }

    // 여기에 코드를 작성해 주세요.

}


class ClassC extends ClassForm implements Basic {

    ClassC(String className) { super(className); }

    @Override
    public void reading() {
        System.out.println(super.className + "의 reading 수업은 " + "화 16시");
    }

    @Override
    public void listening() {
        System.out.println(super.className + "의 listening 수업은 " + "수 17시");
    }

}