package CRM;
import CRM.helper.config;
import CRM.markets.Market;
import CRM.products.Product;
import CRM.service.Service;

import static CRM.helper.config.*;

public class Main {
    public static void main(String[] args) {
        Market market1 = new Market("hoo",
                "Olmazor tumani",
                200D,
                "08:00",
                "23:59",
                1);


        Service service = new Service(market1);
        service.start();

    }
}
