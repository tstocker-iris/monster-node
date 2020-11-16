package com.company;

public class Army {
    /**
     * Question 4.b
     */
    Node first;

    public static void delMonster(Army pArmy, Monster pMonsterToDelete) {
        // Si l'armée n'a pas de node, il n'y a rien a faire
        if (pArmy.first != null) {
            // Si le monstre à supprimer est le premier dans la liste
            if (pArmy.first.monster == pMonsterToDelete) {
                // On affecte la référence au premier node à celui suivant le premier
                pArmy.first = pArmy.first.next;
            } else {
                // Sinon on parcours les autres nodes
                // Le premier devant le précédent
                Node pred = pArmy.first;
                // Le courant devient le suivant
                Node current = pred.next;

                // Tant que le courant n'est pas nul, on boucle
                while (current != null) {
                    // Si le monstre stocké dans le courant est la référence du monstre à supprimer
                    if (current.monster == pMonsterToDelete) {
                        // On affecte le node suivant du node précédent au node suivant le node courant
                        pred.next = current.next;
                    }
                    // Puis pour continuer notre boucle,
                    // Le précédent devient le courant
                    pred = current;
                    // Le courant devient le suivant
                    current = current.next;
                }
            }
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
