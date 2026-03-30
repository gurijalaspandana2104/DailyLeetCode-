 class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) return false;

        Arrays.sort(hand);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        for (int card : hand) {
            if (!map.containsKey(card)) continue;

            int count = map.get(card);

            // try to build count groups starting from card
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < groupSize; j++) {
                    int need = card + j;

                    if (!map.containsKey(need)) return false;

                    map.put(need, map.get(need) - 1);
                    if (map.get(need) == 0) {
                        map.remove(need);
                    }
                }
            }
        }

        return true;
    }
}
