#include <iostream>
using namespace std;

class Enemy
{
	protected:
	int attackPower;
	public:
	void setAttackPower(int);
};

class Monster:public Enemy
{
	public:
	void attack ();
};

class Ninja:public Enemy
{
	public:
	void attack ();
};

//methods of classes respectively
void Enemy::setAttackPower(int attPwr)
{
	attackPower=attPwr;
}

void Monster::attack()
{
	cout << "Monster = " << attackPower << endl;
}

void Ninja::attack()
{
	cout << "Ninja = " << attackPower << endl;
}

int main ()
{
	Monster m;
	Ninja n;
	Enemy *e1=&m;
	Enemy *e2=&n;
	
	e1->setAttackPower(10);
	e2->setAttackPower(20);
	
	m.attack();
	n.attack();
	return 0;
}