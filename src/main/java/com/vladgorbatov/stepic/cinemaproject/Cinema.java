package com.vladgorbatov.stepic.cinemaproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Cinema {

    private static int staffAmount = 0;
    private String name;
    private String address;
    private int regularRoom;
    private int vipRoom;
    //Список для хранения сотрудников
    private List<Person> staff = new ArrayList<>();
    //Список для хранения количества фильмов
    private HashMap<String, Film> films = new HashMap<>();
    //Прокатный список фильмов
    private HashSet<String> boxOffice = new HashSet<>();

    public Cinema(String name, String address, int regularRoom, int vipRoom) {

        this.name = name;
        this.address = address;
        this.regularRoom = regularRoom;
        this.vipRoom = vipRoom;
    }

    public Cinema() {
        this("Без названия", "Адрес неизвестен", 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRegularRoom() {
        return regularRoom;
    }

    public void setRegularRoom(int regularRoom) {
        this.regularRoom = regularRoom;
    }

    public int getVipRoom() {
        return vipRoom;
    }

    public void setVipRoom(int vipRoom) {
        this.vipRoom = vipRoom;
    }

    public int getAmountOfRooms() {
        return regularRoom + vipRoom;
    }

    @Override
    public String toString() {
        return "Название кинотеатра: " + name
                + "\nАдрес кинотеатра: " + address
                + "\nКоличество залов: " + regularRoom
                + "\nКоличество VIP-залов: " + vipRoom
                + "\nОбщее количество персонала: " + getStaffAmount()
                + "\nКоличество фильмов в прокате" + boxOffice.size()
                + "\n";
    }

    public void displayInfo() {

        System.out.println("Название кинотеатра: " + name);
        System.out.println("Адрес кинотеатра: " + address);
        System.out.println("Количество обычных залов: " + regularRoom);
        System.out.println("Количество VIP-залов: " + vipRoom);
        System.out.println("Общее количество залов: " + getAmountOfRooms());
        System.out.println("Общее количество персонала: " + getStaffAmount());
        System.out.println("Количество фильмов в прокате: " + boxOffice.size());
        System.out.println();
    }

    public int getStaffAmount() {
        return staffAmount;
    }

    //Добавление сотрудника в список
    public void addStaff(Person person) {
        staff.add(person);
        staffAmount++;
    }

    //Увольнение сотрудника
    public void removeStaff(Person person) {
        staff.remove(person);
        staffAmount--;
    }

    // Метод для вывода информации о сотрудниках
    public void displayStaffInfo() {
        System.out.println("Персонал кинотеатра " + getName() + ":");
        for (Person person : staff) {
            person.displayInfo();
        }
    }

    //Добавление фильма в афишу
    public void addFilm(Film film) {
        films.put(film.getTitle(), film);
    }

    //Убрать фильм из афиши
    public void removeFilm(Film film) {
        films.remove(film.getTitle(), film);
    }

    //Метод для показа информации о фильмах
    public void displayFilmInfo() {
        System.out.println("Афиша кинотеатра " + getName() + ":");
        for (Film film : films.values()) {
            System.out.println(film);
        }
    }

    //Добавить фильм в прокатный список
    public void addBoxOffice(Film film) {
        boxOffice.add(film.getTitle());
    }

    //Убрать фильм из прокатного списка
    public void removeBoxOffice(Film film) {
        boxOffice.remove(film.getTitle());
    }

    public void displayBoxOfficeInfo() {
        System.out.println("Фильмы, которые идут в кинотеатре " + getName() + ":");
        for (String title : boxOffice) {
            System.out.println("«" + title + "»");
        }
        System.out.println();
    }

}
