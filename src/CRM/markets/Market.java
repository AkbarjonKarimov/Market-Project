package CRM.markets;

import CRM.personnel.Employee;
import CRM.products.Product;

import java.util.Scanner;

import static CRM.helper.config.scanner;

public class Market {
    private String name;
    private String address;
    private Product[] products;
    private Employee[] employees;
    private Double square;
    private String startTime;
    private String endTime;
    // index pf new inserted product
    private int index;

    public Market() {
        products = new Product[10];
    }

    public Market(String name, String address, Double square,int productCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        products = new Product[productCount];
    }

    public Market(String name, String address, Double square, String startTime,String endTime,int productCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        this.startTime = startTime;
        this.endTime = endTime;
        products = new Product[productCount];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=5){
            this.name = name;
        }
        else {
            System.out.printf("%s uzunligi yetarli emas\n",name);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length()>=0){
            this.address = address;
        }else {
            System.out.printf("%s uzunligi yetarli emas\n",name);

        }
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
        index = products.length+1;
        resizeArray();
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void addProduct(){
        String name,type,unit;
        Double price,amount;

        System.out.print("Name = ");
        name = scanner.nextLine();
        System.out.print("Type = ");
        type = scanner.nextLine();
        System.out.print("unit = ");
        unit = scanner.nextLine();
        System.out.print("Amount ");
        amount = scanner.nextDouble();
        System.out.print("Price = ");
        price = scanner.nextDouble();

        Product product= new Product(name,price,type,amount,unit);

        if (index == products.length){
            resizeArray();
        }

        products[index++] = product;
    }

    public void removeProduct(int index){

    }

    public void resizeArray(){
        Product[] temp = new Product[products.length*2];

        for (int i=0;i<products.length;i++){
            temp[i] = products[i];
        }

        products = temp;
    }

    public void printProduct(){
        for (int i =0;i<index;i++){
            System.out.println(i+1+"."+products[i]);
        }
    }

    public void printProduct(int size){
        for(int i=0;i<size;i++){
            System.out.println(i+1+"."+products[i]);
        }
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", square=" + square +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public String toStringWithNumber(){
        return String.format("1.Nomi: %s "+
                "\n2.Manzil: %s"+
                "\n3.Hajmi: %f"+
                "\n4.Ish boshlash vaqti: %s"+
                "\n5.Ish tugash vaqti: %s",
                name,
                address,
                square,
                startTime,
                endTime);
    }

}
