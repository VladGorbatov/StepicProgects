package com.vladgorbatov.stepic.cinemaproject;

class Film {

    Cinema cinema;
    private String title;
    private String genre;
    private String country;
    private int year;
    private String director;
    private String info;
    private boolean boxOffice;

    public Film(String title, String genre, String country, int year, String director, String info, boolean boxOffice, Cinema cinema) {
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.year = year;
        this.director = director;
        this.info = info;
        this.boxOffice = boxOffice;
        this.cinema = cinema;
        cinema.addFilm(this);

        if (this.isBoxOffice()) {
            cinema.addBoxOffice(this);
        }


    }

    public Film(String title, int year, String director, boolean boxOffice, Cinema cinema) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.boxOffice = boxOffice;
        this.cinema = cinema;

        cinema.addFilm(this);

        if (boxOffice) {
            cinema.addBoxOffice(this);
        }

    }

    public Film(String title, String genre, String country, int year, boolean boxOffice, Cinema cinema) {
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.year = year;
        this.boxOffice = boxOffice;
        this.cinema = cinema;

        cinema.addFilm(this);

        if (boxOffice) {
            cinema.addBoxOffice(this);
        }

    }

    public Film(String title, boolean boxOffice, Cinema cinema) {
        this.title = title;
        this.boxOffice = boxOffice;
        this.cinema = cinema;
        cinema.addFilm(this);

        if (boxOffice) {
            cinema.addBoxOffice(this);
        }

    }

    public Film(String title, Cinema cinema) {
        this.title = title;
        this.cinema = cinema;
        cinema.addFilm(this);

    }

    public Film(Cinema cinema) {
        this("Без названия",
                "Без жанра",
                "Страна неизвестна",
                0,
                "Режиссёр неизвестен",
                "Информация отсутствует",
                false,
                cinema);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(boolean _boxOffice) {
        this.boxOffice = _boxOffice;
        if (_boxOffice) {
            cinema.addBoxOffice(this);
        } else {
            cinema.removeBoxOffice(this);
        }
    }

    @Override
    public String toString() {
        return "Название фильма: " + title +
                "\nЖанр: " + genre +
                "\nСтрана издания: " + country +
                "\nГод выхода: " + year +
                "\nИмя режиссёра: " + director +
                "\nИнформация о фильме: " + info +
                (boxOffice ? "\nУже в прокате " : "\nСкоро в прокате ") + "в кинотеатре: " + cinema.getName() + "\n";
    }

    public void displayFilmInfo() {
        System.out.println("Название фильма: " + title);
        System.out.println("Жанр: " + genre);
        System.out.println("Страна: " + country);
        System.out.println("Год выхода: " + year);
        System.out.println("Режиссёр: " + director);
        System.out.println("Информация о фильме: " + info);
        System.out.print(boxOffice ? "Уже в прокате!" : "Скоро в прокате ");
        System.out.println("в кинотеатре " + cinema.getName());
        System.out.println();
    }

}
