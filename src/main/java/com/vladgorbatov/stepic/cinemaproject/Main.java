package com.vladgorbatov.stepic.cinemaproject;

public class Main {
    public static void main(String[] args) {

        Cinema mirage = new Cinema("Мираж Синема", "Улица Проспект Строителей, д.25", 10, 3);

        Film terminator = new Film("Терминатор", "Боевик", "США", 1985, "Джеймс Кэмерон", " центре сюжета — противостояние живого солдата и киборга-терминатора, прибывших в 1984 год из постапокалиптического 2029 года.", false, mirage);
        Film voron = new Film("Ворон", "Боевик, триллер, мелодрама, фэнтези, криминал", "Великобритания, Франция, США", 2024, "Руперт Сандерс", "Пожертвовав собой, чтобы спасти возлюбленную, Эрик Дрэйвен застревает между мирами живых и мёртвых.", true, mirage);

        Manager ivan = new Manager("Иван", "25-25-25", "Директор", 5, mirage);

        ivan.raising();
        ivan.raising();
        ivan.displayInfo();

        Projectionist vasya = new Projectionist("Вася", "24-22-22", false, mirage);
        vasya.displayInfo();

        Projectionist ben = new Projectionist("Бен", "21-22-21", true, mirage);

        Manager steve = new Manager("Стив", "33-33-33", "Менеджер по кинопрокату", 2, mirage);

        mirage.displayInfo();

        Cashier sasha = new Cashier("Саша", "10-10-10", true, mirage);

        terminator.setBoxOffice(true);
        mirage.displayBoxOfficeInfo();

        terminator.setBoxOffice(false);
        mirage.displayBoxOfficeInfo();

        mirage.displayInfo();

        vasya.dismiss();

        mirage.displayStaffInfo();
    }
}
