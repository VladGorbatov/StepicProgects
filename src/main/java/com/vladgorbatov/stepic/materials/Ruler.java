package com.vladgorbatov.stepic.materials;

final class Ruler extends WritingMaterials {
    private boolean wood;

    public Ruler(String name, String color, double length, double price, boolean draw, boolean wood) {
        super(name, color, length, price, draw);
        this.wood = wood;
    }

    public Ruler() {
        this("Линейка", "Без цвета", 0.0, 0.0, false, false);
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public boolean isWood() {
        return wood;
    }

    public void measure() {
        System.out.println("Сейчас померяем длину\n");
    }

    @Override
    public String toString() {
        return "Номер предмета: " + this.number() + "\nНазвание: " + getName() + "\nЦвет: " + getColor() + "\nДлина: " + getLength() + "\nЦена: " + getPrice() + "\nУмеет рисовать: " + (isDraw() ? "Да" : "Нет") + "\nЛинейка сделана из дерева: " + (isWood() ? "Да, линейка сделана из дерева.\n" : "Нет, линейка сделана из другого материала.\n");
    }

    @Override
    public void display() {
        System.out.println("\nThis is " + getClass().getSimpleName() + "\nНазвание: " + getName() + "\nЦвет: " + getColor() + "\nДлина: " + getLength() + "\nЦена: " + getPrice() + "\nУмеет рисовать: " + (isDraw() ? "Да" : "Нет") + "\nЛинейка сделана из дерева: " + (isWood() ? "Да, линейка сделана из дерева.\n" : "Нет, линейка сделана из другого материала.\n"));
    }
}
