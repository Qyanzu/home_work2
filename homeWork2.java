import java.util.Random;
public class homeWork2 {

    public static void main(String[] args) {

        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), 15));
        System.out.println(permission(generateRandomAge(), 11));
        System.out.println(permission(generateRandomAge(), 20));
        System.out.println(permission(generateRandomAge(), -15));
    }


    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(-20,55);
    }


    public static String permission (int  age , int temperature){
        System.out.println("возраст человека " + age + " температура на улице " + temperature);

        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }



}

