class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    // Sum of the last two scores
                    int last = record.get(record.size() - 1);
                    int secondLast = record.get(record.size() - 2);
                    record.add(last + secondLast);
                    break;
                    
                case "D":
                    // Double the last score
                    record.add(record.get(record.size() - 1) * 2);
                    break;
                    
                case "C":
                    // Remove the last score
                    record.remove(record.size() - 1);
                    break;
                    
                default:
                    // Parse and add a normal integer score
                    record.add(Integer.parseInt(op));
                    break;
            }
        }

        // Sum up all valid scores remaining in the list
        int totalSum = 0;
        for (int score : record) {
            totalSum += score;
        }

        return totalSum;
    }
}
