package br.com.lendarioneo.jdbc.model.entities;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.0, department);
        System.out.println(seller);
    }
}
