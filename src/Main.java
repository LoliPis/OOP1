public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        //Ex1
        Human maksim = new Human(1988, "Максим", "Минкс", "бренд-менеджера");
        Human ann = new Human(1993, "Аня", "Москва", "методиста образовательных программ");
        Human kate = new Human(1992, "Катя", "Калининград", "продакт-менеджера");
        Human artem = new Human(1995, "Артем", "Москва", "директора по развитию бизнеса");
        Human atem = new Human(1995, "Артем", "Москва");
        Human rtem = new Human(-1995, "", "", "директора по развитию бизнеса");

        maksim.sayHello();
        ann.sayHello();
        kate.sayHello();
        artem.sayHello();
        atem.sayHello();
        rtem.sayHello();

        System.out.println();

        //Ex2
        Car lada = new Car("Lada", "Granda", 1.7f, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германии");
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германии");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южной Корее");
        Car yundai = new Car("Hyundai", "", 0, "оранжевый", 2016, "Южной Корее");

        lada.showInfo();
        audi.showInfo();
        bmw.showInfo();
        kia.showInfo();
        hyundai.showInfo();
        yundai.showInfo();


    }
}