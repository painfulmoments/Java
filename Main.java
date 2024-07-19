import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;



public class Main {
//    public static void main(String[] args){
//        Student student = new Student("dez",20);
//        student.introduce();
//        Cat cat= new Cat();
//        cat.makesound();
//        Dog doggy = new Dog();
//        doggy.makesound();
//
//    }
//    public static void main(String[] args){
//        List<String> list = new ArrayList<>();
//        list.add("wcx");
//        list.add("lbw");
//        list.add("lc");
//        list.add("wzx");
//        for(String spide : list){
//            System.out.println(spide);
//        }
//    }
//    public static void main(String[] args){
//        Set<String> set = new HashSet<>();
//        set.add("wpw");
//        set.add("dln");
//        set.add("lbw");
//        set.add("bobo");
//        set.add("Au");
//        for(String fzt : set){
//            System.out.println(fzt);
//        }
//
//    }
//    public static void main(String[] args){
//        Map<String,Integer> map = new HashMap<>();
//        map.put("Wz",1);
//        map.put("Db",2);
//        map.put("Bw",3);
//        map.put("tyb",4);
//        map.put("jlc",5);
//        for(Map.Entry<String,Integer> FZT : map.entrySet()){
//            System.out.println(FZT.getKey()+":"+FZT.getValue());
//        }
//    }
    public static void main(String[] args) {
        try {
            int result = divide(2,
                    );
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
