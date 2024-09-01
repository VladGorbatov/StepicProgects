package com.animals;

class Animal {

    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isSwim;
    private boolean isWalk;
    private boolean isFly;

    @Override
    public String toString() {
        return "Номер животного: " + this.number + "\nТип животного: " + type + "\nИмя:  " + name + "\nВозраст: " + age + "\nВес: " + weight + "\nУмеет ли плавать: " + (isSwim ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly ? "Да\n" : "Нет\n");
    }

    private int number;
    private static int quantity = 0;

    {
        quantity++;
        number = quantity;
    }

    static public int quantity() {
        return quantity;
    }

    public int number() {
        return number;
    }

    public Animal(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }

    public Animal() {
        this("Неизвестно", "Неизвестно", 0, 0.0, false, false, false);
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No Name";
        this.age = age;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }


    public void display() {
        System.out.println("Тип животного: " + type + "\nИмя:  " + name + "\nВозраст: " + age + "\nВес: " + weight + "\nУмеет ли плавать: " + (isSwim ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly ? "Да\n" : "Нет\n"));
    }

    public final void rename(String name) {
        this.name = name;
    }

    public void holiday() {
        this.weight += 0.1;
    }

    public void holiday(double n) {
        this.weight += n;
    }

    public void holiday(double n, int m) {
        for (int i = 0; i < m; i++) {
            this.weight += n;
        }

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSwim(boolean isSwim) {
        this.isSwim = isSwim;
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public void setWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }


}
