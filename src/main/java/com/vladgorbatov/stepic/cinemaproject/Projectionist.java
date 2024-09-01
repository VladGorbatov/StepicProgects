package com.vladgorbatov.stepic.cinemaproject;

//Киномеханики
class Projectionist extends Person implements Dismissible {

    Cinema cinema;
    private boolean canMontage;

    Projectionist(String name, String phoneNumber, boolean canMontage, Cinema cinema) {
        super(name, phoneNumber);
        this.canMontage = canMontage;
        this.cinema = cinema;
        cinema.addStaff(this);

    }

    Projectionist(String name, String phoneNumber, Cinema cinema) {
        super(name, phoneNumber);
        this.cinema = cinema;
        cinema.addStaff(this);

    }

    Projectionist(String name, boolean canMontage, Cinema cinema) {
        super(name);
        this.canMontage = canMontage;
        this.cinema = cinema;
        cinema.addStaff(this);

    }

    Projectionist(String name, Cinema cinema) {
        super(name);
        this.cinema = cinema;
        cinema.addStaff(this);

    }

    Projectionist(Cinema cinema) {
        this("Имя неизвестно", "Контакты отсутствуют", false, cinema);

    }

    public boolean isCanMontage() {
        return canMontage;
    }

    public void setCanMontage(boolean canMontage) {
        this.canMontage = canMontage;
    }

    @Override
    public String toString() {
        return "Имя киномеханика: " + getName() + "\nТелефон киномеханика: " + getPhoneNumber() + "\nЕсть ли навык монтажа: " + (isCanMontage() ? "Да" : "Нет") + "\nРаботает в кинотеатре: " + cinema.getName() + "\n";
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public void dismiss() {
        System.out.println(getName() + " уволен!\n");
        cinema.removeStaff(this);
    }
}
