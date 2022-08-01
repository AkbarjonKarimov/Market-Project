package CRM.service;

import CRM.markets.Market;
import CRM.personnel.User;

import static CRM.helper.config.scanner;

public class Buyer {
    private Market market;
    private User user;

    public Buyer(Market market){
        this.market = market;
    }

    public void start(){
        initUser();
        /** User menyulari
         * 1.Shaxsiy ma'lumotlar
         * 2.Market ma'lumotlari
         * 3.Mahsulotlar ro'yxati
         * 4.Sotib olish
         * 0.Chiqish
         */
        sikl:
        while (true){
            System.out.println("Menyuni tanlang: "+
                    "\n1.Shaxsiy ma'lumotlar"+
                    "\n2.Shaxsiy ma'lumotlarni o'zgartish"+
                    "\n3.Mahsulotlar ro'yxati"+
                    "\n4.Market malumotlari"+
                    "\n5.Sotib olish"+
                    "\n6.Hisobni to'ldirish"+
                    "\n0.Chiqish");
            int result = scanner.nextInt();
            switch (result){
                case 0:
                    break sikl;
                case 1:
                    System.out.println(user);
                    break;
                case 2:
                    changeUserInfo();
                    break;
                case 3:
                    market.printProduct();
                    break;
                case 4:
                    System.out.println(market);
                    break;
                case 5:


            }
        }
    }

    public void changeUserInfo(){
        System.out.println(user);
        System.out.println("Qaysi ma'lumotni o'zgartirasiz?");
        int result = scanner.nextInt();

        sikl:
        while (true){
            switch (result){
                case 0:
                    break sikl;
                case 1:
                    System.out.print("Ismni qayta kiriting");
                    String firstName = scanner.nextLine();
                    user.setFirstName(firstName);
                    break;
                case 2:
                    System.out.print("Familyani qayta kiriting: ");
                    String lastName = scanner.nextLine();
                    user.setLastName(lastName);
                    break;
                case 3:
                    System.out.print("Hisob raqamidagi pulini qayta kiriting: ");
                    Double account = scanner.nextDouble();
                    user.setAccount(account);
                    break;
                case 4:

                default:
                    System.out.println("Noto'g'ri amal tanlandi");
                    break;

            }
        }
    }

    public void initUser(){
        System.out.print("Ismingizni kiriting: ");
        scanner.nextLine();
        String firstName = scanner.nextLine();
        System.out.print("Familyangizni kiriting: ");
        String lastName = scanner.nextLine();
        System.out.print("Qancha pulingiz bor: ");
        Double account = scanner.nextDouble();

        this.user= new User(firstName,lastName,account);
    }


}
