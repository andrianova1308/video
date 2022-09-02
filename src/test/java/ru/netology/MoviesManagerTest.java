package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MoviesManagerTest {
    @Test
    public void movieAdd () {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected,actual);
    }

    @Test
    public void movieAdd1 () {
        MoviesManager manager = new MoviesManager(5);


        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected,actual);
    }

    @Test
    public void movieAdd2 () {
        MoviesManager manager = new MoviesManager(3);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        manager.add("Sixth");

        String[] expected = {"First", "Second", "Third", "Forth", "Fifth", "Sixth"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }
    @Test
    public void movieAdd3 () {
        MoviesManager manager = new MoviesManager(-1);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast () {
        MoviesManager manager = new MoviesManager(5);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected,actual);
    }

    @Test
    public void findLast2 () {
        MoviesManager manager = new MoviesManager(5);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        manager.add("Sixth");

        String[] expected = {"Sixth", "Fifth", "Forth", "Third", "Second"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast3 () {
        MoviesManager manager = new MoviesManager(7);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        manager.add("Sixth");

        String[] expected = {"Sixth", "Fifth", "Forth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast4 () {
        MoviesManager manager = new MoviesManager(0);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        manager.add("Sixth");

        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5 () {
        MoviesManager manager = new MoviesManager(-1);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        manager.add("Sixth");

        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast6 () {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        manager.add("Sixth");

        String[] expected = {"Sixth", "Fifth", "Forth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast7 () {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {"Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Forth", "Third", "Second"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
