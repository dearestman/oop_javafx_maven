package com.example.demo.domain.validator;

import com.example.demo.domain.Order;

public class OrderValidator {
//    public static void main(String[] args) {
//        Locality locality = new Locality(1,"Russia","Arkhangelskaya oblast","Arkhangelsk");
//        Address address = new Address(1,locality,"Svobodi","33", "1","37");
//        Hotel hotel = new Hotel(1,"hotel29rus", address);
//        HotelRoom hotelRoom = new HotelRoom(1,"402",5,hotel,"vegan");
//        List<HotelRoom> hotelRoomList = new ArrayList<>();
//        hotelRoomList.add(hotelRoom);
//        Tour tour = new Tour(1,"to Arkhangelsk by Arhangelsk",hotelRoomList);
//        Price price = new Price(1,tour, LocalDate.of(2021,9, 17),12);
//        Passport document = new Passport(1,LocalDate.of(2017,7, 17),
//                "ОУФМС","1117", "353717",address);
//        CertificateOfBirth document2 = new CertificateOfBirth(1,LocalDate.of(2017,7, 17),
//                "ОУФМС","1117", "353717");
//        Client client1 = new Adult(1,"Dmitriy", "Stupakov","Leonidovich",
//                LocalDate.of(1997,06,17), "Stupakova", "1Qaz2Wsx",
//                3,address,"89911140456", "Stupakov.dmitriy1997@gmail.com",
//                document);
//        Client client2 = new Child(1,"Olga", "Stupakova","Leonidovna",
//                LocalDate.of(2007,06,17), "Stupakova", "1Qaz2Wsx",
//                3,address,"89911140456", "Stupakov.dmitriy1997@gmail.com",
//                document2);
//        for (User user: Arrays.asList(client1,client2)
//             ) {
//            System.out.println(user.getFirstName() + " " + user.getLastName() + " дата рождения: "+user.getBirthday());
//            user.checkUserDocument();
//        }
//
//        Order order = new Order(1,"N1",client1,price,LocalDate.now());
//        checkOrder(order);
//    }
    public static void checkOrder(Order order){
        System.out.println("Проверка заявки");
        checkClient();
        System.out.println("Заявка заполнена правильно");
    }

    private static void checkClient() {
        System.out.println("Проверка клиента");

    }
}
