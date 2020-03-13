public class Test {
    public static void main(String[] args){

        Cat barsik = new Cat("Barsik", 10, 2);
        barsik.swim(4);
        barsik.run(4);
        System.out.println(barsik.getAmount());
        Cat mursik = new Cat("Mursik", 7, 1);
        mursik.jump(2);
        System.out.println(barsik.getAmount());


        Dog sharik = new Dog("Sharik", 30, 10, 1);
        sharik.jump(23);
        sharik.run(25);

        Animal elephant1 = new Animal("Elephant Bob", 100, 2, 0);
        elephant1.run(99);
        System.out.println(elephant1.getAmount());
        System.out.println(barsik.getAmount());
    }
}
