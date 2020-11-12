package com.company;

public class Node {
    Monster monster;
    Node next;

    /**
     * Question 4.a
     *
     * @param pMonster
     * @param pNext
     * @return
     */
    public static Node create(Monster pMonster, Node pNext)
    {
        Node node = new Node();

        node.monster = pMonster;
        node.next = pNext;

        return node;
    }
}
