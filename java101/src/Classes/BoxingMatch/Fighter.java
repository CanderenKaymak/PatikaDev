package Classes.BoxingMatch;

public class Fighter {
    String name;
    int damage;
    int weight;
    int hp;
    double dodge;

    public Fighter(String name, int damage, int weight, int hp, double dodge) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.hp = hp;
        this.dodge = dodge;
    }

    public int hit(Fighter enemy){
        System.out.println("-------------");
        System.out.println(this.name + " => " + enemy.name + " " + this.damage + " hasar vurdu!");

        if (enemy.isDodge()){
            System.out.println(enemy.name + " gelen hasarı savuşturdu.");
            return enemy.hp;
        }

        if (enemy.hp - this.damage < 0)
            return 0;
        return enemy.hp - this.damage;
    }

    public boolean isDodge(){
        double rndmVal = Math.random() * 100;
        return rndmVal <= this.dodge;
    }
}
