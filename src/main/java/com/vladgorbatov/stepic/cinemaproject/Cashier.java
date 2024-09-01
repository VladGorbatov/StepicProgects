package com.vladgorbatov.stepic.cinemaproject;

//Кассиры
class Cashier extends Person implements Dismissible {
    boolean cashAccess;
    Cinema cinema;

    public void setCashAccess(boolean cashAccess) {
        this.cashAccess = cashAccess;
    }

    public boolean isCashAccess() {
        return cashAccess;
    }

    Cashier(String name, String phoneNumber, boolean cashAccess, Cinema cinema) {
        super(name, phoneNumber);
        this.cashAccess = cashAccess;
        this.cinema = cinema;
        cinema.addStaff(this);
    }

    Cashier(String name, boolean cashAccess, Cinema cinema) {
        super(name);
        this.cashAccess = cashAccess;
        this.cinema = cinema;
        cinema.addStaff(this);
    }

    Cashier(String name, String phoneNumber, Cinema cinema) {
        super(name, phoneNumber);
        this.cinema = cinema;
        cinema.addStaff(this);
    }

    Cashier(String name, Cinema cinema) {
        super(name);

        this.cinema = cinema;
        cinema.addStaff(this);
    }

    Cashier(Cinema cinema) {
        this("Имя неизвестно", "Контакт неизвестен", false, cinema);
        cinema.addStaff(this);
    }

    @Override
    public String toString() {
        return "Имя кассира: " + getName() + "\nТелефон кассира: " + getPhoneNumber() + "\nЕсть ли доступ к кассе: " + (isCashAccess() ? "Да" : "Нет") + "\nРаботает в кинотеатре: " + cinema.getName() + "\n";
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
