package Classes.BoxingMatch;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        double firstHit = Math.random();
        if (checkWeight()){
            System.out.println("==== New Round ====");
            if (firstHit < 0.5){
                System.out.println(f1.name + " ilk vuruşu yaptı..");
                while(f1.hp > 0 && f2.hp > 0){
                    f2.hp = f1.hit(f2);
                    if (isWin()) break;

                    f1.hp = f2.hit(f1);
                    if (isWin()) break;

                    printScore();
                }
            }
            if (firstHit > 0.5){
                System.out.println(f2.name + " ilk vuruşu yaptı..");
                while(f1.hp > 0 && f2.hp > 0){
                    f1.hp = f2.hit(f1);
                    if (isWin()) break;

                    f2.hp = f1.hit(f2);
                    if (isWin()) break;

                    printScore();
                }
            }
        }else System.out.println("Sporcuların sikletleri uyuşmuyor ..! ");
    }

    public boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin(){
        if (f1.hp == 0){
            System.out.println("Kazanan : " + f2.name);
            return true;
        }else if (f2.hp == 0){
            System.out.println("Kazanan : " + f1.name);
            return true;
        }else
            return false;
    }

    public void printScore(){
        System.out.println("==============");
        System.out.println(f1.name + " Kalan Sağlık: " + f1.hp);
        System.out.println(f2.name + " Kalan Sağlık: " + f2.hp);
    }
}
