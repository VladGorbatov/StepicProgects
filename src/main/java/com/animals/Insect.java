package com.animals;

class Insect extends Animal {
    private int wingCount;
    private boolean likeJesus;

    @Override
    public String toString() {
        return "\nНомер животного: " + this.number() + "\nВид животного: " + getType() + "\nИмя:  " + getName() + "\nВозраст: " + getAge() + "\nВес: " + getWeight() + "\nУмеет ли плавать: " + (isSwim() ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk() ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly() ? "Да" : "Нет") + "\nКоличество крыльев: " + getWingCount() + "\nПередвигается ли по воде: " + (isLikeJesus() ? "Да" : "Нет") + "\n";
    }


    public Insect(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly, int wingCount, boolean likeJesus) {
        super("Насекомое", "", 0, 0.0, false, true, false);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
    }

    public Insect() {
        this("Насекомое", "Неизвестно", 0, 0.0, false, true, false, 0, false);
    }


    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public void ggggg() {
        System.out.println("ggggg");
    }

    @Override
    public void display() {
        System.out.println("\nI am " + getClass().getSimpleName() + "\nТип животного: " + getType() + "\nИмя:  " + getName() + "\nВозраст: " + getAge() + "\nВес: " + getWeight() + "\nУмеет ли плавать: " + (isSwim() ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk() ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly() ? "Да" : "Нет") + "\nКоличество крыльев: " + getWingCount() + "\nПередвигается ли по воде: " + (isLikeJesus() ? "Да" : "Нет") + "\n");
    }

}
