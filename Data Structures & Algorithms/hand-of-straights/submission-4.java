 class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) return false;

        Arrays.sort(hand);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        while (map.size() > 0) {

            // START GROUP
            if (list.isEmpty()) {
                for (int i = 0; i < hand.length; i++) {
                    int val = hand[i];
                    if (map.containsKey(val)) {
                        list.add(val);
                        map.put(val, map.get(val) - 1);
                        if (map.get(val) == 0) {
                            map.remove(val);
                        }
                        break;
                    }
                }
            }
             
            else {
                int last = list.get(list.size() - 1);
                int next = last + 1;

                if (!map.containsKey(next)) return false;

                list.add(next);
                map.put(next, map.get(next) - 1);
                if (map.get(next) == 0) {
                    map.remove(next);
                }
            }

            
            if (list.size() == groupSize) {
                list.clear();
            }
        }

        return true;
    }
}
