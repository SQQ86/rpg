class Warrior extends Hero {

    public Warrior () {
        this.hp = 500;
        this.mana=10;
        this.s=100;
        this.a=50;
        this.i=1;
        this.exp=0;
        this.damage=150;



        //базовые значение
    }
   @Override public void attack(Enemy enemy) {
if (enemy.hp >=0) {
        enemy.hp = enemy.hp - this.damage;
    }
    if (enemy.hp<=0)  {
    this.exp = this.exp + enemy.exp;
    int lvl = this.exp / 500;
    this.i += (10 * lvl);
    this.damage += (20 * lvl);
    this.mana += (10 * lvl);
    this.s += (10 * lvl);
    this.a += (10 * lvl);
    this.hp += (200 * lvl);
    this.exp = this.exp%500;

            }




    }
    @Override public void defense (Enemy enemy){

        if (enemy.hp > 0){
            this.hp=this.hp - enemy.damage;
        }


        if (this.hp <=0){
            System.out.println("Ваш герой был убит");
        }








    }

    @Override
    public void openItem(Item item) {
        if (0+(Math.random()*100)>=50){
            this.items.add(item);// метод должен добавлять предмет в список с вероятностью 50 %
        }
        for (Item i : this.items){
            if (i.type==1){
                this.damage+=100;
            }
            break;

        }
    }//MYCODE!
    /*
класс должен обладать всеми свойствами героя при создании воин должен обладать следующими характеристиками:
 здоровье - 500, мана - 10, сила - 100, ловкость - 50, интеллект - 1, опыт 0, урон - 150. При атаке герой наносит цели урон и получает урон в ответ от цели, действия повторяются пока кто то не победит.
 В случае победы герой получает опыт цели, каждые 500 единиц опыта герой получает новый уровень. Новый уровень дает +10 ко всем характеристикам, +200 здоровья и +20 урона.
 Если воин имеет предмет 1 типа, к его урону добавляется 100.
            Уже мертвая цель - урона герою не наносит!!!
            */
}//MYCODE!

