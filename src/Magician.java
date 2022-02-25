import java.util.ArrayList;

class Magician extends Hero {
    public Magician() {
        this.hp = 100;
        this.mana = 5000;
        this.s = 5;
        this.a = 30;
        this.i = 300;
        this.exp = 0;
        this.damage = 40;


        ;// MYCODE! базовые значение

    }


    private ArrayList<Item> casts = new ArrayList<>();

    @Override
    public void attack(Enemy enemy) {
        if (enemy.hp>0) {
            if (this.mana >= 100 && enemy.hp >= this.damage) {
                makeCast(enemy);
                }
                else {
                enemy.hp = enemy.hp - this.damage;
            }
        }
        if (enemy.hp <= 0) {
            this.exp = this.exp + enemy.exp;

            int lvl = this.exp / 500;
            this.i += (10 * lvl);
            this.damage += (10 * lvl);
            this.mana += (1000 * lvl);
            this.s += (10 * lvl);
            this.a += (10 * lvl);
            this.hp += (30 * lvl);
            this.exp = this.exp % 500;

        }


    } //MYCODE!

    @Override
    public void defense(Enemy enemy) {
        if (enemy.hp > 0) {
            if (this.mana >= enemy.damage) {
                this.mana = this.mana - enemy.damage;
            } else {
                this.mana = this.mana - enemy.damage;
                this.hp = this.hp + this.mana;
                this.mana = 0;

            }
            if (this.hp <= 0) {
                System.out.println("Ваш герой был убит");
            }
        }




    } //MYCODE!
    /*
        класс должен обладать всеми свойствами героя при создании маг должен обладать следующими характеристиками: здоровье - 100, мана - 5000, сила - 5, ловкость - 30, интеллект - 300, опыт 0, урон - 40.
    атака по аналогии с воином
    помимо обычной атаки, маг имеет возможность бить заклинанием в процессе атаки
    защита мага осуществляется магическим щитом, который полгащает весь урон, но вместо здоровья тратит ману. Новый уровень дает +10 ко всем характеристикам, +30 здоровья, 1000 маны и +10 урона.
    В случае возможности убить врага с руки - маг бьет с руки!!! в Первую очередь
    */
    public void makeCast(Enemy enemy){
        if (!casts.isEmpty()){
            this.mana = this.mana-100;
            enemy.hp = enemy.hp - 1000;
            // MYCODE! если в списке есть заклятия можно его произнести потратив 100 маны и нанеся 1000 урона цели.
        }
        // после произнесения предмет из списка пропадает
    }
@Override
public void openItem (Item item) {
    if (0+(Math.random()*100)>=50){
        items.add(item);
        eduCast(item);// MYCODE! метод должен добавлять предмет в список с вероятностью 50 %
    }

    }
    public void eduCast(Item item){

            if (item.type == 2) {
                casts.add(item);

            }
        } //MYCODE!
                /*
                если предмет или предметы из списка имеют тип 2, это заклинания и их нужно добавить в список
заклинаний мага
                */


}//MYCODE
