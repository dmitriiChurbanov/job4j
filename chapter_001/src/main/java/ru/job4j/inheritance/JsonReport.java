package ru.job4j.inheritance;

public class JsonReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{\n name : " + name + ","+ System.lineSeparator() + " body : " + body + "\n}";
    }
}