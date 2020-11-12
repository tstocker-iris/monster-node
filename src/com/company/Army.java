package com.company;

public class Army {
    /**
     * Question 4.b
     */
    Node first;

    public static void delMonster(Army pArmy, Monster pMonsterToDelete) {
        if (pArmy.first != null) {
            /*Node cur = pArmy.first;

            if (cur.monster == pMonsterToDelete) {
                pArmy.first = cur.next;
            }*/

        }
    }

    public static void displayArmy(Army army) {
        Node cur = army.first;
        while (cur != null) {
            Monster.displayMonster(cur.monster);
            cur = cur.next;
        }
    }

    public static void addMonster(Army army, Monster monster)
    {
        Node newNode = Node.create(monster, army.first);
        army.first = newNode;
    }

    public static Army createArmy() {
        // Création de l'objet Army
        Army army = new Army();

        /**
         * Question 4.b
         */
        army.first = null;

        return army;
    }
}
