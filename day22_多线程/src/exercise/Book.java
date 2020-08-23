package exercise;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String anthor;
    private String desc;
    private Long outTime; //借出时间
    private Long inTime; //归还时间
    public Book(String name, String anthor, String desc) {
        this.name = name;
        this.anthor = anthor;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnthor() {
        return anthor;
    }

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getOutTime() {
        return outTime;
    }

    public void setOutTime(Long outTime) {
        this.outTime = outTime;
    }

    public Long getInTime() {
        return inTime;
    }

    public void setInTime(Long inTime) {
        this.inTime = inTime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", anthor='" + anthor + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
