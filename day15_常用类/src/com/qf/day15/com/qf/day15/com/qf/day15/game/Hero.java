package com.qf.day15.com.qf.day15.com.qf.day15.game;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.game
 * @created : 2020/8/8
 * @description :
 */
public class Hero {
    private String name;
    private Skill skill;//接口作为成员变量类型

    public Hero() {
    }
    public void attack(){
        System.out.println("我叫"+this.name+"释放技能，");
        skill.use();
        System.out.println("释放技能完成....");
    }
    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
