public class Main
{
	public static void main(String[] args) {
		Dog Kyzia = new Dog("кузьма");
		Kyzia.run(100);
		Kyzia.swim(100);
		Kyzia.jump(100);
		Cat Gridin = new Cat("гридин");
		Gridin.run(150);
		Gridin.swim(150);
		Gridin.jump(150);
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
