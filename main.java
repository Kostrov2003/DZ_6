public class Main
{
	public static void main(String[] args) {
		Dog Sharik = new Dog("Шарик");
		Sharik.run(150);
		Sharik.swim(150);
		Sharik.jump(150);
		Cat Barsik = new Cat("Барсик");
		Barsik.run(150);
		Barsik.swim(150);
		Barsik.jump(150);
	}
}
class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void run(int length){
        boolean a = length < 500;
        System.out.println ("run:" + a);
    }
    public void swim(int length){
        boolean a = length < 10;
        System.out.println("swim:" + a);
    }
    public void jump(int height){
        boolean a = height < 0.5;
        System.out.println("jump:" + a);
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void run(int length){
        boolean a = length < 200;
        System.out.println ("run:" + a);
    }
    public void swim(int length){
        System.out.println("swim:" + false);
    }
    public void jump(int height){
        boolean a = height < 2;
        System.out.println("jump:" + a);
    }
}
