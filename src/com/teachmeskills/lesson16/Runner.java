package com.teachmeskills.lesson16;

import com.teachmeskills.lesson16.client.Client;
import com.teachmeskills.lesson16.description.Description;

import java.util.*;

/**
 * Задача 5
 * Создать класс для описания клиента.
 * Поместить в класс поля для описания клиента (дата регистрации, имя, возраст и другие поля по усмотрению).
 * Класс клиента должен содержеть поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
 * Класс заказа должен создежать поля для описания заказ (цена, описание и возможны другие поля).
 * Создать нескольких клиентов.
 * Для каждого клиента создать несколько заказов и поместить их в поле-коллекцию для заказов.
 * Создать коллекцию типа Мар и заполнить ее парами "номер паспорта клиента" -> "объект класса клиент".
 * Номера паспортов можно хранить как константы в созданном для этого интерфейсе.
 * Пройти циклом по коллекции и вывести на экран:
 * 	- все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet()
 * 	- все пары ключ-значение, использую итератор
 * 	- все ключи, используя map.keySet()
 * 	- все значения, используя map.values()
 */

public class Runner {

    public static void main(String[] args) {

        Map<String, Client> mapClient = new HashMap<>();

        Client client1 = new Client("Alex", "02.02.2011", 20, new ArrayList<>());
        Client client2 = new Client("Bob", "11.06.2012", 21, new ArrayList<>());
        Client client3 = new Client("Jon", "14.10.2013", 22, new ArrayList<>());

        mapClient.put(Client.PASSPORT_NUMBER1, client1);
        mapClient.put(Client.PASSPORT_NUMBER2, client2);
        mapClient.put(Client.PASSPORT_NUMBER3, client3);

        Description orderDes1 = new Description(200, "jeans");
        Description orderDes2 = new Description(300, "sneakers");
        Description orderDes3 = new Description(100, "hat");

        client1.getOrder().add(orderDes1);
        client1.getOrder().add(orderDes2);
        client2.getOrder().add(orderDes1);
        client2.getOrder().add(orderDes3);
        client3.getOrder().add(orderDes3);
        client3.getOrder().add(orderDes2);

        System.out.println("Output via Map.Entry");

        for (Map.Entry<String, Client> client : mapClient.entrySet()){
            System.out.println("Key " + client.getKey() + " " + client.getValue().toString());
        }

        System.out.println("Output via iterator");

        Iterator<Map.Entry<String, Client>> iterator = mapClient.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Client> clientMap = iterator.next();
            System.out.println("Key " + clientMap.getKey() + " " + clientMap.getValue().toString());
        }

        System.out.println("Output of all keys");

        for (Map.Entry<String, Client> client : mapClient.entrySet()){
            System.out.println("Key " + client.getKey());
        }

        System.out.println("Output all values");

        for (Map.Entry<String, Client> client : mapClient.entrySet()){
            System.out.println("Value " + client.getValue());
        }

    }

}
