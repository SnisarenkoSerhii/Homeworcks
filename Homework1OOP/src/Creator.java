/**
 * Created by Sergey on 29.09.2015.
 */

/**
 * Cоздал 2 класа - город и село. Использовал инкапсуляцию(когда определлял переменны, модификаторы доступа private),
 * наследование (класс City наследует Village тем самым получая его методы, например
 * метод .setAmountOfSmallBuildings() не определен в City, тоетсь все вроде работает=)) и полиморфизм (в методах
 * createVillage() и createCity()). Понятно, что методы очень кривые, нужно добавить исключения , рамки в которых будут те
 * значения и все такое, но для примера вроде подходит. Если что-то не так, то скажите пожалуйста мне.
 * */
public class Creator {
    public static void main(String[] args) {
        Village village = new Village(5000, 500, 60000, 100);
        village.printVillage(1000, 500, 50000, 2000);
        village.printVillage();



        City city = new City(65789, 3000, 800000, 700, 40000, 50000, 4564, 678678);
        city.printCity(65745657, 657456, 3434, 32423423);
        city.printCity();

    }
}
