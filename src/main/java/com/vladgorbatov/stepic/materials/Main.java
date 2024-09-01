package com.vladgorbatov.stepic.materials;

public class Main {
   /* public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.name = "Ручка";
        pen.color = "Красный";
        pen.length = 15.6;
        pen.price = 145;
        pen.draw = true;
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.name = "Линейка";
        ruler.length = 30.0;
        ruler.price = 25;
        ruler.draw = false;
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();
    }

    */
   /* public static void main(String[] args) {
       WritingMaterials pen = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
       pen.display();
       pen.draw();
       pen.priceDown(10);
       pen.display();
       pen.priceUp(23);
       pen.display();
       pen.replace_rod("Синий");
       pen.draw();

       WritingMaterials ruler = new WritingMaterials("линека", 34);
       ruler.display();
       ruler.draw();

       WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
       wm1.display();
       wm1.draw();

       WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
       wm2.draw = true;
       wm2.display();
       wm2.draw();
   }
*/

    public static void main(String[] args) {

        /*
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());
*/
        /*
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.setDraw(false);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);
*/
        System.out.println(WritingMaterials.description);
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();


        Pen p = new Pen();
        p.setName("Паркер");
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p);
        p.writeMyName();


        Ruler r = new Ruler();
        r.setName("Линейка");
        r.setLength(25);
        r.setWood(true);
        System.out.println(r);
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d);
        d.draw_circle();

        System.out.println("Количество канцелярских принадлежностей в пенале: " + WritingMaterials.penal() + ".\n");

    }
}