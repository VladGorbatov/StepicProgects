package com.vladgorbatov.stepic.materials;

class WritingMaterials {

    private String name;
    private String color;
    private double length;
    private double price;
    private boolean draw;

    @Override
    public String toString() {
        return "Номер предмета: " + this.number + "\nНазвание: " + name + "\nЦвет: " + color + "\nДлина: " + length + "\nЦена: " + price + "\nУмеет рисовать: " + (draw ? "Да\n" : "Нет\n");
    }

    public static String description = "Класс описывает канцелярские предметы.";

    private int number = 0;
    private static int penal = 0;

    {
        penal++;
        number = penal;
    }


    static public int penal() {
        return penal;
    }

    public int number() {
        return number;
    }

    public WritingMaterials() {
        this("", "", 0.0, 0.0, false);
    }

    public WritingMaterials(String name, String color, double length, double price, boolean draw) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.price = price;
        this.draw = draw;
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, double price) {
        this.name = name;
        this.color = "No color";
        this.price = price;
    }

    public WritingMaterials(double price, double length, boolean draw) {
        this.name = "No name.";
        this.color = "No color";
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public void display() {
        System.out.println("\nНазвание: " + name + "\nЦвет: " + color + "\nДлина: " + length + "\nЦена: " + price + "\nУмеет рисовать: " + (draw ? "Да\n" : "Нет\n"));
    }

    public void replace_rod(String rod) {
        this.color = rod;
    }

    public void priceUp(int price) {
        this.price += price;
    }

    public void priceDown(int price) {
        this.price -= price;
    }

    public void draw() {
        if (draw) {
            System.out.println(name + " провёл линий: 1. Их цвет — " + color + ".");
        } else {
            System.out.println(name + " не может ничего нарисовать.");
        }
    }

    public void draw(int n) {
        if (draw) {
            System.out.println(name + " провёл линий: " + n + ". Их цвет — " + color + ".");
        } else {
            System.out.println(name + " не может ничего нарисовать.");
        }
    }

    public void draw(String color) {
        if (draw) {
            System.out.println(name + " провёл линий: 1. Её цвет — " + color + ".");
        } else {
            System.out.println(name + " не может ничего нарисовать.");
        }
    }

    public void draw(String color, int n) {
        if (draw) {
            System.out.println(name + " провёл линий: " + n + ". Их цвет — " + color + ".");
        } else {
            System.out.println(name + " не может ничего нарисовать.");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDraw() {
        return draw;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

}
