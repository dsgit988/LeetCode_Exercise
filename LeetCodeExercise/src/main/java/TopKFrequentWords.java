import java.util.*;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++){
            int value = map.getOrDefault(words[i], 0) + 1;
            String key = words[i];
            map.put(key, value);
        }

        List<String> list = new ArrayList<>();
        Map<String, Integer> newMap = sortedHashMapByValues(map);

        int j = 0;
        for (Map.Entry<String,Integer> entry: newMap.entrySet()){

                list.add(entry.getKey());
                j++;
                if (j == k){
                    break;
                }


        }
        System.out.println(list);


        return list;
    }

    private TreeMap<String, Integer> sortedHashMapByValues(TreeMap map) {
        // Insert all key-value pairs into TreeMap using a custom comparator.
        TreeMap<String, Integer> treeMap = new TreeMap<>((o1, o2) -> {
            if ( map.get(o1) != map.get(o2) )
                return Integer.compare((Integer) map.get(o2), (Integer) map.get(o1));

            return o1.compareTo(o2);
        });

        treeMap.putAll(map);
        return treeMap;
    }
}

