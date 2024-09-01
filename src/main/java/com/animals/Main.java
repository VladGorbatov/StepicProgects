package com.animals;

public class Main {
    public static void main(String[] args) {

        /* Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();

         */

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        System.out.println(duck);

        Animal bear = new Animal();
        bear.setType("Медведь");
        bear.setAge(24);
        bear.setWalk(true);
        System.out.println(bear);


        Bird b = new Bird();
        b.setName("Bob");
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b);
        b.chirick_chirick();


        Fish f = new Fish();
        f.setName("Сельд");
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f);
        f.bul_bul();


        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i);
        i.ggggg();

        System.out.println("\nКоличество животных в Зоопарке: " + Animal.quantity() + ".\n");


    }
}

