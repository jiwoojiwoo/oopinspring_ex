package pattern.templateMethodPattern;

public abstract class Animal {
    public void palyWithOwner() {
        System.out.println("귀염둥이 이리와~");
        play();
        runSomething();
        System.out.println("잘했어!!");
    }

    abstract void play();

    // Hook(갈고리) 메서드
    void runSomething() {
        System.out.println("꼬리 살랑 살랑~");
    }
}
