package tracker;

import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] item = new Item[items.length];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                item[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(item, count);
    }

    public Item[] findByName(String key) {
        Item[] item = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(key)) {
                item[size] = items[i];
                size++;
            }
        }
        item = Arrays.copyOf(item, size);
        return item;
    }
}
//Метод public Item[] findAll() возвращает копию массива items без null элементов (без пустых ячеек).
//
//Перебирать все 100 элементов не нужно. У нас есть поле size.
//Это поле и есть размер нового массива.
//
//Чтобы получить новый массив, нужно использовать метод Arrays.copyOf. Этот метод принимает два параметра: массив
// элементов и новый размер.
//Задание
//
//1. Добавьте недостающие методы в класс Tracker. В классе Tracker должны быть методы:
//добавление заявок - public Item add(Item item);
//получение списка всех заявок - public Item[] findAll();
//получение списка по имени - public Item[] findByName(String key);
//получение заявки по id - public Item findById(int id);
//2. Создайте класс ru.job4j.tracker.StartUI. В нем создайте метод main.
//    Внутри метода main создайте объект Tracker. Вызовите у него метод add с объектом Item.
//    Вызовите метод findById и найденный Item выведите на консоль.
