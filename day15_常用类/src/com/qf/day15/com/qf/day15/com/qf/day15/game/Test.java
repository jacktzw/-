package com.qf.day15.com.qf.day15.com.qf.day15.game;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.game
 * @created : 2020/8/8
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("亚瑟");
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu");
            }
        });
        hero.attack();
    }
}
