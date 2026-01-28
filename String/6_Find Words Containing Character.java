// LC 2942. Find Words Containing Character

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(x) != -1){
                result.add(i);
            } 
        }
        return result;
        // List<Integer> result = new ArrayList<>();
        // String s = String.valueOf(x);

        // for(int i=0; i<words.length; i++){
        //     if(words[i].contains(s)){
        //         result.add(i);
        //     } 
        // }
        // return result;
    }
}
