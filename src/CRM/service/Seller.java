package CRM.service;

import CRM.markets.Market;

import static CRM.helper.config.scanner;

public class Seller {

    private Market market;

    public Seller(Market market) {
        this.market = market;
    }

    public void start(){
        int action;

        do{
            System.out.println("Menyuni tanlang: " +
                    "\n0.Dasturni tugatish" +
                    "\n1.Mahsulot qo'shish " +
                    "\n2.Mahsulotlarni chiqarish " +
                    "\n3.Market malumotlari " +
                    "\n4.product o'lchamli mahsulotlar"+
                    "\n5.Market malumotlarini o'zgartirish");
            action = scanner.nextInt();
            switch (action){
                case 0:
                    System.exit(0);
                case 1:
                    market.addProduct();
                    break;
                case 2:
                    market.printProduct();
                    break;
                case 3:
                    System.out.println(market);
                    break;
                case 4:
                    System.out.println("O'lchamni kiriting : ");
                    int size = scanner.nextInt();
                    market.printProduct(size);
                case 5:
                    changeMarketInfo();
                    break;
            }
        }while (true);
    }

    public void changeMarketInfo(){
       sikl:
        while (true){
            System.out.println(market.toStringWithNumber());
            System.out.println("Qaysi ma'lumotni o'zgartirmoqchisiz?");
            int result = scanner.nextInt();
            scanner.nextLine();
            switch (result){
                case 1:
                    System.out.print("Market nomini qayta kiriting: ");
                    String name = scanner.nextLine();
                    market.setName(name);
                    break;
                case 2:
                    System.out.println("Market manzilini qayta kiriting: ");
                    String address = scanner.nextLine();
                    market.setAddress(address);
                    break;
                case 3:
                    System.out.println("Market hajmini qaytadan kiriting: ");
                    Double square = scanner.nextDouble();
                    market.setSquare(square);
                    break;
                case 4:
                    System.out.println("Marketning ishboshlash vaqtini kiriting: ");
                    String startTime = scanner.nextLine();
                    market.setStartTime(startTime);
                    break;
                case 5:
                    System.out.println("Marketning ish tugatish vaqtini kiriting: ");
                    String endTime = scanner.nextLine();
                    market.setEndTime(endTime);
                    break;
                case 0:
                    break sikl;
            }
        }
    }
}
