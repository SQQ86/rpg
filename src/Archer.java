class Archer extends Hero {
    public Archer(){
        this.hp = 200;
        this.mana=50;
        this.s = 20;
        this.a = 150;
        this.i = 30;
        this.exp=0;
        this.damage=200;




        //базовые значение
    }

    @Override public void attack(Enemy enemy) {
        if (enemy.hp > 0) {
            enemy.hp = enemy.hp - this.damage;
        }
        if (enemy.hp <= 0) {
            this.exp = this.exp + enemy.exp;

                int lvl = this.exp / 500;
                this.i += (10 * lvl);
                this.damage +=  (50 * lvl);
                this.mana +=  (10 * lvl);
                this.s += (10 * lvl);
                this.a += this.a + (30 * lvl);
                this.hp += this.hp + (50 * lvl);
                this.exp = this.exp%500;



        }
    }





   @Override public void defense (Enemy enemy) {
       if (0 + (Math.random() * 100) > 30) {
           if (enemy.hp > 0) {
               this.hp = this.hp - enemy.damage;
           } else {
               this.hp -= 0;
           }
           if (this.hp <= 0) {
               System.out.println("Ваш герой был убит");
           }


       }
   }
       @Override
       public void openItem (Item item){
           items.add(item);

       }


            /*
                класс должен обладать всеми свойствами героя при создании лучник должен обладать следующими характеристиками: здоровье - 200, мана - 50, сила - 20, ловкость - 150, интеллект - 30, опыт 0, урон - 200.
            атака по аналогии с воином, но в процессе атаки лучник имеет 30% шанс избежать урон
            лучник всегда открывает предмет - 100%
            Новый уровень дает +10 ко всем характеристикам, +50 здоровья и +50 урона и 30 ловкости.
            */
}//MYCODE!
