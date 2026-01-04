// 904. Fruit Into Baskets

class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0;
        int j = 0;
        int max = 0;
        Map<Integer,Integer> mp = new HashMap<>();

        for(i=0; i<fruits.length; i++){
            mp.put(fruits[i], mp.getOrDefault(fruits[i], 0) + 1);

            while(mp.size()>2){
                mp.put(fruits[j], mp.get(fruits[j]) - 1);
                if(mp.get(fruits[j])==0) mp.remove(fruits[j]);
                j++;
            }
            if(mp.size()<=2){
                max = Math.max(max,i-j+1);
            }
        }
        return max;
    }
}
