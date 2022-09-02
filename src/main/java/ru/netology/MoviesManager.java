package ru.netology;

public class MoviesManager {
    private String[] movies = new String[0];
    private int limit;

    public MoviesManager() {
        limit = 10;
    }

    public MoviesManager(int limit) {
        if (limit > 0) {
            this.limit = limit;
        }
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLenght;
        if (movies.length < limit) {
            resultLenght = movies.length;
        } else {
            resultLenght = limit;
        }

        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];

        }
        return tmp;

    }
}
