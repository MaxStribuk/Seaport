package com.home.stady.main;

public class Constants {

    public static final int WATER_DENSITY_HIGH = 2000;
    public static final int WATER_DENSITY_SMALL = 1000;
    public static final int DIAGONAL_SMALL = 10;
    public static final int DIAGONAL_BIG = 20;
    public static final int MIN_HEIGHT = 10;
    public static final int MAX_HEIGHT = 100;
    public static final String INCORRECT_HEIGHT = "Заданное некорректное значение высоты контейнера" +
            "было заменено на случайно сгенерированное корректное (от 10 до 100).";
    public static final String CORRECT_HEIGHT = "Значение высоты контейнера было оставлено без изменений," +
            "поскольку новое значение было задано некорректно.";
    public static final String INCORRECT_DIAGONAL = "Заданное некорректное значение диагонали" +
            " основания контейнера было заменено на случайно сгенерированное корректное (10 или 20).";
    public static final String CORRECT_DIAGONAL = "Значение диагонали контейнера было оставлено без изменений," +
            "поскольку новое значение было задано некорректно.";
    public static final String INCORRECT_WATER_DENSITY = "Заданное некорректное значение плотности воды " +
            "было заменено на случайно сгенерированное корректное (1000 или 2000).";
    public static final String CORRECT_WATER_DENSITY = "Значение плотности воды было оставлено без изменений," +
            "поскольку новое значение было задано некорректно.";
    public static final String INCORRECT_BIG_CONTAINER = "Вы поместили на палубу 2 контейнера. Значение диагонали" +
            " основания должно быть равно 20. Некорректное значение было заменено на корректное.";
    public static final String INCORRECT_SMALL_CONTAINER = "Вы поместили на палубу 4 контейнера. Значение диагоналей" +
            " оснований должны быть равны 10. Некорректные значения были заменены на корректные.";
    public static final String INCORRECT_CONTAINERS_ARRAY = "Размер массива контейнеров некорректен, либо контейнеры " +
            "имеют некорректные значения диагоналей. Массив контейнеров был заменен на случайный корректный";
    public static final String CORRECT_CONTAINERS_ARRAY = "Массив контейнеров не был изменен, " +
            "поскольку новое значение было задано некорректно.";
    public static final String INCORRECT_COUNT_CONTAINERS = "Заданное некорректное значение количества контейнеров" +
            "на палубе было заменено на случайно сгенерированное корректное (2 или 4).";
    public static final String INCORRECT_DECK = "Нельзя создать корабль с палубой равной null. " +
            "Палуба была сгенерирована случайно.";
    public static final String DECK_NOT_IS_NULL = "Нельзя добавить/удалить палубу null, палуба была оставлена без " +
            "изменений.";
    public static final String INCORRECT_COUNT_DECK = "На корабле может быть только 2 палубы, новая палуба " +
            "добавлена не была";
    public static final String DECK_ONE = "На корабле не может быть менее одной палубы, операция невозможна.";
    public static final String NON_EXISTENT_DECK = "На корабле отсутствует данная палуба, удалить ее нельзя.";
    public static final String INCORRECT_SHIPNAME = "Имя корабля не может быть null";
    public static final String SHIPS_IS_NULL = "В порту корабли отсутствуют.";
    public static final String INCORRECT_COUNT_SHIPS = "Задано некорректное количество кораблей, количество кораблей " +
            "должно попадать в интервал от 1 до 10.\nПрограмма сгенерировала случайное количество кораблей из " +
            "данного диапазона и заполнила их случайными данными.\n";
    public static final int INCORRECT_VALUE = -1;
    public static final String MANY_SHIPS = "В порту не может быть более 10 кораблей.\nВ порт было допущено 10 " +
            "кораблей, а остальные были уничтожены, сожалеем.\nЕсли у вас остались претензии, можете обратиться " +
            "к администрации порта.\n";
    public static final String MAX_SHIPS = "Порт не может принять более 10 кораблей, состояние порта изменено не было.\n";

    public static final String SHIP_IS_NULL = "Нельзя добавить в порт корабль, равный null";
}
