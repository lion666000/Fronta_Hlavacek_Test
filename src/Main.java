Scanner sc = new Scanner(System.in);
void main() {
    System.out.println("Registrační systém");

    Fronta fronta = new Fronta();

    //přednastavení hráči
    fronta.add(new Hrac("Jan", "Tank", 10));
    fronta.add(new Hrac("Pavel", "Light", 2));
    fronta.add(new Hrac("Orel", "Mage", 67));


    while (true) {
        System.out.println("\n1 -> Vložit do fronty");
        System.out.println("2 -> Odebrat z fronty");
        System.out.println("3 -> Vypsat frontu");
        System.out.println("4 -> Další na řadě");
        System.out.println("5 -> Všichni nad MMR");
        System.out.println("6 -> Vyhledání hráče");
        System.out.println("7 -> Konec");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                System.out.println("\nVložení do fronty");

                System.out.println("\nZadej přezdívku hráče:");
                String name = sc.nextLine();
                if (name.isBlank()) {
                    while (name.isBlank()) {
                        System.out.println("\nZadej platnou přezdívku:");
                        name = sc.nextLine();
                    }
                }

                System.out.println("\nZadej oblíbenou herní třídu hráče:");
                String classy = sc.nextLine();
                if (classy.isBlank()) {
                    while (classy.isBlank()) {
                        System.out.println("\nZadej platnou třídu:");
                        classy = sc.nextLine();
                    }
                }

                System.out.println("\nZadej MMR hráče");
                int mmr = sc.nextInt();
                if (mmr < 0) {
                    mmr = 0;
                }
                sc.nextLine();

                fronta.add(new Hrac(name, classy, mmr));

                break;
            case 2:
                System.out.println("\nOdebrání z fronty");

                fronta.removeNext();

                break;
            case 3:
                System.out.println("\nVýpis všech ve frontě:\n");

                fronta.printAll();

                break;
            case 4:
                System.out.println("\nVýpis dalšího na řadě:\n");

                fronta.printNext();

                break;
            case 5:
                System.out.println("\nVýpis filtrovaný podle MMR");

                System.out.println("\nZadej MMR:");
                int mmr2 = sc.nextInt();
                sc.nextLine();
                if (mmr2 < 0) {
                    mmr2 = 0;
                }

                fronta.printAboveMMR(mmr2);

                break;
            case 6:
                System.out.println("\nVýpis hráče se zadanou přezdívkou");

                System.out.println("\nZadej přezdívku:");
                String name2 = sc.nextLine();
                if (name2.isBlank()) {
                    while (name2.isBlank()) {
                        System.out.println("\nZadej platnou přezdívku:");
                        name2 = sc.nextLine();
                    }
                }

                fronta.printByName(name2);

                break;
            case 7:
                System.out.println("\nZavření registračního systému");

                System.exit(0);

                break;
        }
    }
}
