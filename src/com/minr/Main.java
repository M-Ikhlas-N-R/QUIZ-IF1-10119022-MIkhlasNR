package com.minr;

import java.util.Scanner;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Quis Program Kasir Rock n Roll Haircut
 *
 */
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Scanner userInput = new Scanner(System.in);


        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        customer1.setName(userInput.nextLine());

        System.out.print("Customer Email : ");
        customer1.setEmail(userInput.nextLine());

        customer1.displaySercive();
        customer1.setPriceService(customer1.getPrice(userInput.nextInt()));

        System.out.print("Are you Member (yes/no) : ");
        customer1.setMember(customer1.checkMemberStatus(userInput.next()));
        customer1.setDiscount(customer1.getSale(customer1.isMember(), customer1.getPriceService()));

        System.out.println();
        System.out.println("#***********************#");
        System.out.println("#CUSTOMER INVOICE#");
        System.out.println("Date Transaction : ");
        System.out.printf("Service Price : %.1f ", customer1.getPriceService());
        System.out.printf("\nDiscount : %.1f", customer1.getDiscount());
        System.out.printf("\nTotal Pay : %.1f", customer1.getTotalPay(customer1.getPriceService(), customer1.getDiscount()));
    }
}
