import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(5);

        int i = 0;
        int a[] = {1,2,3,4,5};

        List<String> batsMan = new ArrayList<String>();
        batsMan.add("sachin");
        batsMan.add("virat");
        batsMan.add("dhoni");
        batsMan.add("pandya");
        batsMan.add("karthik");
        batsMan.add(0,"malinga");
        batsMan.add(1,"ponting");

        System.out.println(batsMan.size());
        System.out.println(batsMan.contains("dravid"));

        Iterator<String> arrayListOperator = batsMan.iterator();
        while (arrayListOperator.hasNext()){
            String str = arrayListOperator.next();
            System.out.println(str);}

        System.out.println(batsMan.indexOf("pandya"));
        System.out.println(batsMan.indexOf("bradman"));

        batsMan.remove("dravid");
        batsMan.remove(1);

        //Sorting Collection
        List<String> listOfString = new ArrayList<String>();
        listOfString.add("z");
        listOfString.add("a");
        listOfString.add("f");
        listOfString.add("t");
        listOfString.add("b");

        Collections.sort(listOfString);
        System.out.println(listOfString);

        List<Cricketers> cricketersList = new ArrayList<Cricketers>();
        cricketersList.add(new Cricketers("z",1));
        cricketersList.add(new Cricketers("b",3));
        cricketersList.add(new Cricketers("c",2));
        cricketersList.add(new Cricketers("y",5));
        cricketersList.add(new Cricketers("a",4));

        Collections.sort(cricketersList,Cricketers.StuNameComparator);

        System.out.println(cricketersList);

        //Sets
        //Sets do not alllow duplicates
        //Hashset does not support any ordering
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("a1");
        hashSet.add("a2");
        hashSet.add("a1");

        System.out.println(hashSet);

        //TreeSet
        //TreeSet do not allow duplicates
        //Treeset support ordering
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("a1");
        treeSet.add("c2");
        treeSet.add("d3");
        treeSet.add("b1");
        treeSet.add("d3");

        System.out.println(treeSet);

        Map<String,Cricketers> hashMap = new HashMap<String, Cricketers>();
        hashMap.put("achin",new Cricketers("Sachin",1));
        hashMap.put("bchin",new Cricketers("et",2));
        hashMap.put("cachin",new Cricketers("hj",3));
        hashMap.put("dachin",new Cricketers("yu",4));

        System.out.println(hashMap);
        System.out.println(hashMap.get("achin"));
        System.out.println(hashMap.get("yyy"));

        Map<String,Cricketers> treeMap = new TreeMap<String, Cricketers>();
        treeMap.put("achin",new Cricketers("Sachin",1));
        treeMap.put("zbchin",new Cricketers("et",2));
        treeMap.put("ycachin",new Cricketers("hj",3));
        treeMap.put("dachin",new Cricketers("yu",4));

        System.out.println(treeMap);

        //Treeset
        TreeSet<Integer> numberTreeSet = new TreeSet<Integer>();
        numberTreeSet.add(10);
        numberTreeSet.add(5);
        numberTreeSet.add(1);
        numberTreeSet.add(23);
        numberTreeSet.add(56);

        System.out.println(numberTreeSet);

        //highest number lower than 25
        System.out.println(numberTreeSet.lower(25));

        //highest number lower or equal to 25
        System.out.println(numberTreeSet.floor(25));

        //lowest number higher than to 25
        System.out.println(numberTreeSet.higher(25));

        //lowest number higher than or equal to 25
        System.out.println(numberTreeSet.ceiling(25));

        TreeMap<Integer,Cricketers> listOfCricketers = new TreeMap<Integer, Cricketers>();
        listOfCricketers.put(1,new Cricketers("Sachin",1));
        listOfCricketers.put(2,new Cricketers("Sachin",2));
        listOfCricketers.put(4,new Cricketers("Sachin",3));
        listOfCricketers.put(3,new Cricketers("Sachin",4));
        listOfCricketers.put(6,new Cricketers("Sachin",5));
        listOfCricketers.put(8,new Cricketers("Sachin",6));

        System.out.println(listOfCricketers);

        //greatest key less than the specified key - TreeSet.java
        System.out.println(listOfCricketers.lowerKey(4));

        //least key greater than the specified * key
        System.out.println(listOfCricketers.higherKey(4));

        //Gets the entry corresponding to the specified key; if no such entry
        //exists, returns the entry for the greatest key less than the specified
        //key
        System.out.println(listOfCricketers.floorKey(4));

        //Gets the entry corresponding to the specified key; if no such entry
        //exists, returns the entry for the least key greater than the specified
        //key
        System.out.println(listOfCricketers.ceilingKey(7));

        //Priority Queue
        //Using default constructor - uses natural ordering of numbers
        //smaller numbers have higher priority
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        //adding element to priority queue
        priorityQueue.offer(24);
        priorityQueue.offer(23);
        priorityQueue.offer(7);
        priorityQueue.offer(9);

        System.out.println(priorityQueue);

        //peek method gets the highest pripority element
        System.out.println(priorityQueue.peek());
        //peek doesnt change the queue
        System.out.println(priorityQueue);

        //poll method gets the highest pripority element
        System.out.println(priorityQueue.poll());
        //poll change the queue
        System.out.println(priorityQueue);

        //add comparator to change the natural order
        Comparator reverComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer param1, Integer param2) {
                return param2 - param1;
            }
        };

        PriorityQueue<Integer> descPriorityQueue = new PriorityQueue<Integer>(20,reverComparator);
        descPriorityQueue.offer(11);
        descPriorityQueue.offer(16);
        descPriorityQueue.offer(78);
        descPriorityQueue.offer(90);
        descPriorityQueue.offer(56);

        System.out.println(descPriorityQueue.peek());
        System.out.println(descPriorityQueue);
        System.out.println(descPriorityQueue.poll());
        System.out.println(descPriorityQueue);
    }
}
