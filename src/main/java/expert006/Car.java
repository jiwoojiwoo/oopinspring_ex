package expert006;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Car {
    @Resource
    Tire tire;

//    @Autowired
//    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
