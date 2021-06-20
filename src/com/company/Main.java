package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		WebSite webSite=new WebSite();
		int answer;
		do{
			Scanner myObj1 = new Scanner(System.in);
			System.out.println("********Select Item*******");
			System.out.println("1: Add food");
			System.out.println("2: Subscribe");
			System.out.println("3: Exit");
			answer = myObj1.nextInt();
			Food food;


			if(answer==1){
				Scanner myObj2 = new Scanner(System.in);
				System.out.println("****Add food*****");
				System.out.println("Food Name: ");
				String name = myObj2.nextLine();
				System.out.println("Description: ");
				String description = myObj2.nextLine();
				System.out.println("Price: ");
				double price = myObj2.nextDouble();

				food=new Food(name,price,description);
				System.out.println("****New Food created!****");
				webSite.sendNotificationsToSubscribers(food);

			}
			if(answer==2){
				Scanner myObj2 = new Scanner(System.in);
				System.out.println("****Subscribe*****");
				System.out.println("Your name: ");
				String name = myObj2.nextLine();
				System.out.println("Your email: ");
				String email = myObj2.nextLine();

				Subscriber subscriber=new Subscriber(name,email);
				webSite.subscribeWebsite(subscriber);
				System.out.println("Successfully subscribed!");
			}

		}
		while (answer!=3);



    }
}
