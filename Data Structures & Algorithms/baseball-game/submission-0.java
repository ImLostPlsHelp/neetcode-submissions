class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> store = new ArrayDeque<>();

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")) {
                int num1 = store.pop();
                int result = num1 + store.peek();
                store.push(num1);
                store.push(result);
            } 
            else if(operations[i].equalsIgnoreCase("D")) {
                store.push(store.peek() * 2);
            }
            else if(operations[i].equalsIgnoreCase("C")) {
                store.pop();
            }
            else {
                store.push(Integer.parseInt(operations[i]));
            }
        }

        int result = 0;
        for(int num : store) {
            result += num;
        }

        return result;
    }
}