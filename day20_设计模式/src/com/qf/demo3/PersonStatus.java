package com.qf.demo3;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo3
 * @created : 2020/8/14
 * @description :
 */
public enum  PersonStatus {
    ZHUO_SHAO(1,"灼烧","被点燃后持续伤害",5),
    BINGDONG(2,"冰冻","被冰冻后持续伤害",3),
    ZHONGDU(3,"中毒","被毒系攻击后持续伤害",4);
    private int id;
    private String name;
    private String desc;
    private int time;
    private PersonStatus(int id, String name, String desc, int time) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.time = time;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public String detail() {
        return "id" +  id + ", name" + name + ",desc" + desc + ", time" + time;
    }
}
