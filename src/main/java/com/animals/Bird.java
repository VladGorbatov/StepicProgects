package com.animals;

class Bird extends Animal {
    private String area;
    private boolean winterFly;

    @Override
    public String toString() {
        return "\nНомер животного: " + this.number() + "\nВид животного: " + getType() + "\nИмя:  " + getName() + "\nВозраст: " + getAge() + "\nВес: " + getWeight() + "\nУмеет ли плавать: " + (isSwim() ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk() ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly() ? "Да" : "Нет") + "\nЗона обитания: " + getArea() + "\nУлетает ли зимовать: " + (isWinterFly() ? "Да" : "Нет") + "\n";
    }


    public Bird(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly, String area, boolean winterFly) {
        super("Птица", "", 0, 0.0, false, false, true);
        this.area = area;
        this.winterFly = winterFly;
    }

    public Bird() {
        this("Птица", "Без имени", 0, 0, false, false, true, "Неизвестно", false);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public void chirick_chirick() {
        System.out.println("chirik_chirik");
    }

    @Override
    public void display() {
        System.out.println("\nI am " + getClass().getSimpleName() + "\nТип животного: " + getType() + "\nИмя:  " + getName() + "\nВозраст: " + getAge() + "\nВес: " + getWeight() + "\nУмеет ли плавать: " + (isSwim() ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk() ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly() ? "Да" : "Нет") + "\nЗона обитания: " + getArea() + "\nУлетает ли зимовать: " + (isWinterFly() ? "Да" : "Нет") + "\n");
    }

}
