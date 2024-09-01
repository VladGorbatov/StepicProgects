package com.vladgorbatov.stepic.cinemaproject;

//Менеджеры
class Manager extends Person implements RaisingAble, Dismissible {

    Cinema cinema;
    private String occupation;
    private int workExperience;

    Manager(String name, String phoneNumber, String occupation, int workExperience, Cinema cinema) {
        super(name, phoneNumber);
        this.occupation = occupation;
        this.workExperience = workExperience;
        this.cinema = cinema;
        cinema.addStaff(this);
    }

    Manager(String name, String phoneNumber, Cinema cinema) {
        super(name, phoneNumber);
        this.cinema = cinema;
        cinema.addStaff(this);

    }

    Manager(String name, int workExperience, Cinema cinema) {
        super(name);
        this.workExperience = workExperience;
        this.cinema = cinema;
        cinema.addStaff(this);
    }

    Manager(String name, Cinema cinema) {
        super(name);
        this.cinema = cinema;
        cinema.addStaff(this);
    }

    Manager(Cinema cinema) {
        this("Имя неизвестно", "Контакт отсутствует", "Должность неизвестна", 0, cinema);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Имя менеджера: " + getName() + "\nТелефон менеджера: " + getPhoneNumber() + "\nДолжность: " + getOccupation() + "\nТрудовой стаж: " + getWorkExperience() + "\nРаботает в кинотеатре: " + cinema.getName() + "\n";
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    //Повышение сотрудника
    @Override
    public void raising() {
        System.out.println(getName() + " получил повышение!");
        this.occupation += "+";
    }

    @Override
    public void dismiss() {
        System.out.println(getName() + " уволен!\n");
        cinema.removeStaff(this);
    }


}
