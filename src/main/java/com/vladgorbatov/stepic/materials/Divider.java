package com.vladgorbatov.stepic.materials;

class Divider extends WritingMaterials {
    private String dividerType;
    private boolean metal;

    public Divider(String name, String color, double length, double price, boolean draw, String dividerType, boolean metal) {
        super(name, color, length, price, draw);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public Divider() {
        this("Циркуль", "Без цвета", 0.0, 0.0, true, "", false);
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public boolean isMetal() {
        return metal;
    }

    final public void draw_circle() {
        System.out.println("Нарисован круг\n");
    }

    @Override
    public String toString() {
        return "Номер предмета: " + this.number() + "\nНазвание: " + getName() + "\nЦвет: " + getColor() + "\nДлина: " + getLength() + "\nЦена: " + getPrice() + "\nУмеет рисовать: " + (isDraw() ? "Да" : "Нет") + "\nТип циркуля: " + getDividerType() + "\nЦиркуль сделан из метала: " + (isMetal() ? "Да, циркуль сделан из метала.\n" : "Нет, циркуль сделан из другого материала.\n");
    }

    @Override
    public void display() {
        System.out.println("\nThis is " + getClass().getSimpleName() + "\nНазвание: " + getName() + "\nЦвет: " + getColor() + "\nДлина: " + getLength() + "\nЦена: " + getPrice() + "\nУмеет рисовать: " + (isDraw() ? "Да" : "Нет") + "\nТип циркуля: " + getDividerType() + "\nЦиркуль сделан из метала: " + (isMetal() ? "Да, циркуль сделан из метала.\n" : "Нет, циркуль сделан из другого материала.\n"));
    }

}
