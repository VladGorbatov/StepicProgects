package com.vladgorbatov.stepic.materials;

class Pen extends WritingMaterials {
    private int countColor;
    private boolean auto;

    public Pen(String name, String color, double length, double price, boolean draw, int countColor, boolean auto) {
        super(name, color, length, price, draw);
        this.countColor = countColor;
        this.auto = auto;
    }

    public Pen() {
        this("Ручка", "Синяя", 0.0, 0.0, true, -1, false);
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public int getCountColor() {
        return countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void writeMyName() {
        System.out.println("Vlad\n");
    }

    @Override
    public String toString() {
        return "Номер предмета: " + this.number() + "\nНазвание: " + getName() + "\nЦвет: " + getColor() + "\nДлина: " + getLength() + "\nЦена: " + getPrice() + "\nУмеет рисовать: " + (isDraw() ? "Да" : "Нет") + "\nКоличество возможных цветов: " + getCountColor() + "\nАвтоматическая ли ручка: " + (isAuto() ? "Да, ручка автоматическая.\n" : "Нет, ручка неавтоматическая.\n");
    }

    @Override
    public void display() {
        System.out.println("\nThis is " + getClass().getSimpleName() + "\nНазвание: " + getName() + "\nЦвет: " + getColor() + "\nДлина: " + getLength() + "\nЦена: " + getPrice() + "\nУмеет рисовать: " + (isDraw() ? "Да" : "Нет") + "\nКоличество возможных цветов: " + getCountColor() + "\nАвтоматическая ли ручка: " + (isAuto() ? "Да, ручка автоматическая.\n" : "Нет, ручка неавтоматическая.\n"));
    }

}
