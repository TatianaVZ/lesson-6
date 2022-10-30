public class Main {
    public static void main(String[] args) {

        // Задание 6.1
        int clientOS = 1;
        if (clientOS == 0)
        {System.out.println("Установите версию приложения для iOS по ссылке" );}
        else {System.out.println("Установите версию приложения для Android по ссылке" );}


        // Задание 6.2
        int clientDeviceYear = 2015;
        int client = 1;

        if (client == 0 && clientDeviceYear < 2015)
        {System.out.println("Установите облегченную версию приложения для iOS по ссылке" );
        if (client == 1 && clientDeviceYear < 2015)
        {System.out.println("Установите облегченную версию приложения для  Android по ссылке" );}}
        else if (client == 0 && clientDeviceYear >= 2015)
        {System.out.println("Установите приложение для iOS по ссылке" );}
          else if (client == 1 && clientDeviceYear >= 2015)
        { System.out.println("Установите приложение для Android по ссылке" );}



          // Задание 6.3
                int year = 2021;


                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                { System.out.println(year + " является высокосным ");}
                else { System.out.println(year + " не является высокосным ");}

// ЗАдание 6.4
        int deliveryDistance = 95;
                if (deliveryDistance <= 20)
                {System.out.println("Потребуется 1 день доставки ");
                    if (deliveryDistance > 20 && deliveryDistance <= 60)
                    {System.out.println("Потребуется 2 дня доставки ");}}
                else {System.out.println("Потребуется 3 дня доставки ");}

                // Задание 6.5

        int  monthNumber = 13;
        switch (monthNumber) {
            case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                System.out.println("Весна");
                break;
            case 6:
                case 7:
                case 8:
                System.out.println("Лето");
                break;
            case 9:
                case 10:
                case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
               default:
               System.out.println("Такого месяца нет");
        }



    }}

