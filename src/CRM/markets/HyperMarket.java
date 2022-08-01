package CRM.markets;

import CRM.parts.Parking;
import CRM.parts.Storage;
import CRM.personnel.Department;
import CRM.personnel.User;

public class HyperMarket extends SuperMarket{
    Parking parking;
    Department[] departments;
    Storage[] storages;
    User[] users;
}
