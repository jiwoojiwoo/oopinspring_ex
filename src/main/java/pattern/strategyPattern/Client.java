package pattern.strategyPattern;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 총을 람보에게 전달해서 전투 수행
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        // 칼을 람보에게 전달해서 전투 수행
        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        // 활을 람보에게 전달해서 전투 수행
        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
