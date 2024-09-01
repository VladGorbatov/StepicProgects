package com.animals;

final class Fish extends Animal {
    private String squama;
    private boolean upStreamSwim;

    @Override
    public String toString() {
        return "\nНомер животного: " + this.number() + "\nВид животного: " + getType() + "\nИмя:  " + getName() + "\nВозраст: " + getAge() + "\nВес: " + getWeight() + "\nУмеет ли плавать: " + (isSwim() ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk() ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly() ? "Да" : "Нет") + "\nТип чешуи: " + getSquama() + "\nПлавает ли против течения: " + (isUpStreamSwim() ? "Да" : "Нет") + "\n";
    }


    public Fish(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly, String squama, boolean upStreamSwim) {
        super("Рыба", "", 0, 0.0, true, false, false);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {
        this("Рыба", "Неизвестно", 0, 0.0, true, false, false, "Неизвестно", false);
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public void bul_bul() {
        System.out.println("bul_bul");
    }

    @Override
    public void display() {
        System.out.println("\nI am " + getClass().getSimpleName() + "\nТип животного: " + getType() + "\nИмя:  " + getName() + "\nВозраст: " + getAge() + "\nВес: " + getWeight() + "\nУмеет ли плавать: " + (isSwim() ? "Да" : "Нет") + "\nУмеет ли ходить: " + (isWalk() ? "Да" : "Нет") + "\nУмеет ли летать: " + (isFly() ? "Да" : "Нет") + "\nТип чешуи: " + getSquama() + "\nПлавает ли против течения: " + (isUpStreamSwim() ? "Да" : "Нет") + "\n");
    }

}
