Нужно было дополнить код, часть которого уже написана,
а именно реализовать классы Warrior,Magician,Archer с 0.

Почти РПГ
Герой игры обладает никнеймом, силой, ловкостью и интеллектом, помимо этого у него есть здоровье, мана и опыт и позиция на карте в координатах х, у. Любой герой может переместиться за курсором, атаковать, защищаться, выполнить действие. Герой может принадлежать любому из 3 классов - маг, воин, лучник.

При создании персонажа у пользователя есть выбор класса.

Помимо базовых характеристик героя, у классов есть свои особенности:

Маг имеет больший запас маны при создании и способен атаковать на расстоянии. Маг имеет возможность произносить заклинания из списка. Маг имеет возможность изучать заклинания в случае нахождения свитка соответствующего заклинания.

Воин имеет больший запас здоровья при создании, больший урон с руки, возможность атаковать при помощи предмета.

Лучник - имеет лук при создании и способен атаковать на расстоянии. Лучник имеет возможность избежать урон при атаке и умеет открывать любые замки.

Необходимо описать недостающие методы и добавить часть кода для того, чтобы программа заработала.

Механика метода attack - герой всегда наносит удар первым, потом ждет удара от цели и так до гибели кого либо из атакующих. В случае убийства цели (здоровье цели упало до 0 или ниже) - цель удар не наносит. В этом случае герой приобретает опыт цели. Каждые 500 единиц опыта герой получает новый уровень и это влияет на его характеристике в соответствии с описанием ниже. Если цель убивает героя необходимо вывести в консоль "Ваш герой был убит".

Ссылка https://stepik.org/lesson/90695/step/10?unit=66923