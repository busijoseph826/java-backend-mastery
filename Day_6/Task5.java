/*
Practical Exercise 5
Anonymous Class → Lambda Conversion

This is a very common interview topic.
*/

/*
Example 1
Anonymous Class
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running");
    }
};
Lambda
Runnable r =
        () -> System.out.println("Running");
Example 2
Anonymous Class
Comparator<Integer> comp =
        new Comparator<Integer>() {

    @Override
    public int compare(Integer a,
                       Integer b) {
        return a - b;
    }
};
Lambda
Comparator<Integer> comp =
        (a,b) -> a - b;
Example 3
Anonymous Class
Predicate<String> p =
        new Predicate<String>() {

    @Override
    public boolean test(String s) {
        return s.isEmpty();
    }
};
Lambda
Predicate<String> p =
        s -> s.isEmpty();
Example 4
Anonymous Class
Consumer<String> c =
        new Consumer<String>() {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
};
Lambda
Consumer<String> c =
        s -> System.out.println(s);
Example 5
Anonymous Class
Supplier<Double> supplier =
        new Supplier<Double>() {

    @Override
    public Double get() {
        return Math.random();
    }
};
Lambda
Supplier<Double> supplier =
        () -> Math.random();
*/