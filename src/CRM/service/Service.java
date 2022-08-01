package CRM.service;

import CRM.markets.Market;
import CRM.products.Product;

import static CRM.helper.config.*;

public class Service {

    private Market market;

    public Service(Market market){
        this.market = market;
        initProducts();
    }

    public void start(){
        while (true) {
            System.out.println("Qanday foydalanuvchisiz? \n1.Haridor \n2.Sotuvchi");
            int result = scanner.nextInt();
            if (result == 1) {
                Buyer buyer = new Buyer(market);
                buyer.start();
                break;
            } else if (result == 2) {
                Seller seller = new Seller(market);
                seller.start();
                break;
            }
            System.out.println("Noto'g'ri tanlov kiritildi");

        }
    }

    public void initProducts(){

        Product[] products = new Product[]{
                new Product("bug'doy",25443D,"don",20000D,"kg"),
                new Product("guruch",42334D,"don",30000D,"kg"),
                new Product("banan",12333D,"don",40000D,"kg"),
                new Product("kivi",10000D,"don",12000D,"kg"),
                new Product("apelsin",44443D,"don",14400D,"kg"),
                new Product("go'sht",444443D,"don",12300D,"kg"),
                new Product("pishloq",555343D,"don",55000D,"kg"),
                new Product("ko'mir",123333D,"don",4000D,"kg"),
                new Product("shokolad",90003D,"don",43D,"kg"),
                new Product("mohito",60000D,"don",6500D,"kg"),
        };
        market.setProducts(products);


    }
}
