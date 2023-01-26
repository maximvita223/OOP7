import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Communication cm = new Communication();
        cm.addAdress("new");
        Counerparty cp = new Counerparty("egor", cm);
        List<Counerparty> lst1 = new ArrayList<>();
        lst1.add(cp);
        ListCounerparty lst = new ListCounerparty(lst1);
        lst.addCounerpaty("igor");
        lst.getList();
        System.out.println(cp.getName()); 
        Scanner sc = new Scanner(System.in);
        // lst.addCommunity("egor");
        // System.out.println(cp.getCommunication());



        while (true) {
            System.out.println("1. Просмотреть список контактов");
            System.out.println("2. Поиск по имени");
            System.out.println("3. Добавить контрагента");
            System.out.println("4. Удалить контрагента");
            System.out.println("5. Добавить новый способ связи");
            System.out.println("6. Удалить способ связи");
            System.out.println();
            switch (sc.nextLine()) {
                case "1":
                    lst.getList();
                    break;
                case "2":
                    System.out.println("Введите имя");
                    System.out.println();
                    lst.find(sc.nextLine());
                    break;
                case "3":
                    System.out.println("Введите имя");
                    System.out.println();
                    lst.addCounerpaty(sc.nextLine());
                    break;
                case "4":
                    System.out.println("Введите номер контрагета");
                    System.out.println();
                    lst.removeCounerparty(sc.nextInt() - 1);
                    break;
                case "5":

                    System.out.println("Введите имя контрагента и номер способа связи");
                    System.out.println("    1. Адресс");
                    System.out.println("    2. Телефон");
                    System.out.println("    3. Email");
                    System.out.println("    4. Ник в телеграмме");
                    System.out.println("    5. Адресс VK");
                    System.out.println();
                    lst.addCommunity(sc.nextLine());
                    break;
                case "6":
                    System.out.println("Введите имя контрагента и номер способа связи");
                    System.out.println("    1. Адресс");
                    System.out.println("    2. Телефон");
                    System.out.println("    3. Email");
                    System.out.println("    4. Ник в телеграмме");
                    System.out.println("    5. Адресс VK");
                    System.out.println();
                    lst.removeCommunity(sc.nextLine());
                    break;
                case "7":
                sc.close();
                return;
            }

        }
        
    }
}