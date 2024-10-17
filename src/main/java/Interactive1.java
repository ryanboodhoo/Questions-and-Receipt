import java.util.*;


public class Interactive1 {
    public static void main(String[] args) {


        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Go");
        System.out.println(languages.size());

        for (String language : languages)
            System.out.println(language);

        System.out.println(languages.indexOf(("Python")));
        System.out.println(languages.get(2));

        Object[] langsArray = languages.toArray();

        String[] langArray = languages.toArray(new String[0]);

        List<String> someLangs =languages.subList(0,3);//from index is inclusive //to index is exclusive



ArrayList<String>people = new ArrayList<>();

        people.add ("Ryan");
        people.add ("Shawn");
        people.add ("Jane");

        people.remove("Ryan");
        people.remove(0);

        if (people.contains("Ryan")){
            System.out.println("Ryan is in the list");
        }

        if (people.isEmpty()){
            System.out.println("The list is empty");
        }

        people.clear();

        LinkedList<Integer> list = new LinkedList<>();

list.add(1);
list.add(2);
list.add(3);
list.remove(0);
list.remove(Integer.valueOf(3));
list.clear();

list.offer(1);
list.offer(2);
list.offer(3);
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        list.push(1);
        list.push(2);
        list.push(3);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        PriorityQueue <Integer>queue = new PriorityQueue<>();
        queue.offer(4);
        queue.offer(5);
        queue.offer(1);
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        HashMap <String, Integer> populationByCity = new HashMap<>();
        populationByCity.put("New York",230021);
        populationByCity.put("Las Vegas",112234);
        populationByCity.put("San Francisco", 113561);

        Integer population = populationByCity.get("New York");


        if (populationByCity.containsKey("New York")){
            System.out.println("New York's Population");
        }
        populationByCity.keySet();
        populationByCity.values();
        populationByCity.entrySet();

        LinkedHashMap<String,Integer> orderedMap = new LinkedHashMap<>();

TreeMap<String,Integer>sortedMap = new TreeMap();

        sortedMap.put("Key1",10);
        sortedMap.put("Key5",20);
        sortedMap.put("Key2",30);
        sortedMap.put("Key3",40);

sortedMap.entrySet().forEach(System.out::println);

        System.out.println(sortedMap.higherEntry("Key2"));
        System.out.println(sortedMap.lowerEntry("Key2"));


        Set<Integer>set =new HashSet();

        set.add(3);
        set.add(4);
        set.add(3);// can't have duplicates in sets
        System.out.println(set);

        List<Integer>list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(3);

        System.out.println("Unsorted -> " + list1);

        Collections.sort(list1);

        System.out.println("Sorted -> " + list1);;

        System.out.println("Binary Search result -> " + Collections.binarySearch(list1,4));
        System.out.println("Binary Search result -> " + Collections.binarySearch(list1,7));

        System.out.println("Frequency of " + Collections.frequency(list1,3));

        System.out.println("Max element in the list " + Collections.max(list1));
        System.out.println("Min element in the list " + Collections.min(list1));

        Collections.shuffle(list1);
        System.out.println("Shuffled list " + list1);

        Collections.swap(list1,0,1);
        System.out.println("First 2 elements swapped " + list1);

        Collections.fill(list1,3);
        System.out.println("List filled with 3: " + list1);





    }
            }



