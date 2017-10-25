package com.bay.model;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
public class Student {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String major;
    private int score;

    public Student() {
    }

    public Student(int id, String name, String sex, int age, String major, int score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.major = major;
        this.score = score;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", score=" + score +
                '}';
    }
}
