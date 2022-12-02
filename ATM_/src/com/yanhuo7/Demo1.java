package com.yanhuo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static List<Card> cards = new ArrayList<>();
    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠","♥","♣","♦"};
        int i = 0;
        for (String size : sizes) {
            for (String color : colors) {
                Card c = new Card(size,color,i++);
                cards.add(c);
            }
        }
        cards.add(new Card("", "小🃏",++i));
        cards.add(new Card("", "大🃏",++i));
        System.out.println("新牌" + cards);
    }
    public static void main(String[] args) {
        Collections.shuffle(cards);
        System.out.println("洗后" + cards);
        List<Card> one = new ArrayList<>();
        List<Card> two = new ArrayList<>();
        List<Card> three = new ArrayList<>();
        for (int i = 0; i < cards.size()-3; i++) {
            Card c = cards.get(i);
            if (i % 3 == 0){
                one.add(c);
            } else if (i % 3 == 1  ) {
                two.add(c);
            } else if (i % 3 == 2) {
                three.add(c);
            }
        }
        List<Card> x = cards.subList(cards.size()-3, cards.size());
        SortCard(one);
        SortCard(two);
        SortCard(three);


        System.out.println("one:" +one);
        System.out.println("two:" +two);
        System.out.println("three:" +three);
        System.out.println("底牌:" +x);
    }

    private static void SortCard(List<Card> cards) {
        Collections.sort(cards, ( o1,  o2)-> o2.getIndex() - o1.getIndex());
    }

}
