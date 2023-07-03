/* Hashmap */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
public class MoreRewards {
    public static void rewards() {
        RewardsHashMap();
    }

    private static void RewardsHashMap() {
        LinkedList cards = new LinkedList();

        cards.add("Bronze");
        cards.add("Silver");
        cards.add("Gold");
        cards.add("Diamond");
        System.out.println("Card Types = " + cards +"\n");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("\nBronze Card", "\nEarn 5% cash back on everyday purchases at different places each quarter");
        map.put("\nSilver Card", "\nEarn 4% cashback on gas stations and restaurants on up to $500");
        map.put("\nGold Card", "\n1.5x Miles for every dollar you spend with the card");
        map.put("\nDiamond Card", "\nEarn $400 after you spend $1000 on purchases in the first 3 months");
        System.out.println("=====================");
        System.out.println("Additional Card Rewards:");
        System.out.println("====================="+ "\n");
        System.out.println(map.entrySet());

    }
}
