package com.company;

import java.util.ArrayList;
import java.util.List;

public class WebSite {
    private List<Subscriber> subs=new ArrayList<>();

    public void subscribeWebsite(Subscriber subscriber){
        subs.add(subscriber);
    }

    public void unSubscribeWebsite(Subscriber subscriber){
        subs.remove(subscriber);
    }

    public void sendNotificationsToSubscribers(Food food){
        for (Subscriber sub : subs) {
            sub.update(food);
        }
    }

}
