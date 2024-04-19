package com.example.desigonpattern.decoratePattern;

import org.junit.Test;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 用来测试装饰者模式
 * @date 2023/3/3 16:38:13
 */
public class DecorateTest {

    @Test
    public void Test() {
        Tank tank = new DecorateTank99(new ChineseTank());
        tank.shot();
    }


    interface Tank{
        void shot();
    }

    class ChineseTank implements Tank {

        @Override
        public void shot() {
            System.out.println("老子的意大利炮，开炮！！！");
        }
    }

    abstract class DecorateTank implements Tank {
        Tank tank;

        public DecorateTank(Tank tank) {
            this.tank = tank;
        }
    }

    class DecorateTank99 extends DecorateTank {

        public DecorateTank99(Tank tank) {
            super(tank);
        }


        @Override
        public void shot() {
            System.out.println("喷火式坦克，开炮！！！");
            tank.shot();
        }
    }
}
