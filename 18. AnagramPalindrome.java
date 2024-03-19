class Sol {
    int isPossible(String S) {
        
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : S.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        int oddCount = 0;
        for (int count : frequencyMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1 ? 1 : 0;
    }
}
