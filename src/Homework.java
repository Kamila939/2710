import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Homework {
    static Scanner Scanner;
    public static void main(String[] args) {
        Scanner  = new Scanner(System.in);
        String command = null;
        Phone phone = null;
        List<Phone> phones = new ArrayList<Phone>();
        while(true){
            command = Scanner.nextLine();
            if(command.equals("Приступить")){
                phone = createPhone();
                phones.add(phone);

            }
            else if(command.equals("Местоположение телефона")){
                Phone phone1 = findCurrentPhone(phones);
                if(phone == null){
                    System.out.println("Повторить еще раз");
                }
                else {
                    System.out.println(phone1.getOrderNumber());
                    System.out.println(phone1.getOwner());
                    System.out.println(phone1.getWeight());
                }
            }
            else if(command.equals("Изменить")){
                changeOrdernumber(phone);
            }
        }
    }

    private static Phone findCurrentPhone(List<Phone> phones) {
        return null;
    }

    private static Phone findCurrentprivatePhone(List<Phone> mails) {
        System.out.println("Имя владельца");
        String string = Scanner.nextLine();
        Phone[] phones = new Phone[0];
        for(Phone phone : phones){
            if(phone.getOwner().equals(string)) {
                return phone;
            }
        }
        return null;
    }

    private static void changeOrdernumber(Phone phone) {
        System.out.println("Введите новое описание");
        String weight = Scanner.nextLine();
        phone.setWeight(Double.parseDouble(weight));
    }
    private static Phone createPhone() {
        System.out.println("Введите номер заказа");
        String ordernumber = Scanner.nextLine();
        System.out.println("Введите имя владельца");
        String owner = Scanner.nextLine();
        Phone phone= new Phone(ordernumber,owner,23, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis() + 843735929));
        return phone;
    }
}