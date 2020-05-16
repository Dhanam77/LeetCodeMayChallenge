package Week2;



//Implement a trie with insert, search, and startsWith methods.



class Trie {

  HashMap<String, Boolean> map;
  
  /** Initialize your data structure here. */
  public Trie() {
      map = new HashMap<>();
  }
  
  /** Inserts a word into the trie. */
  public void insert(String word) {
      map.put(word, true);
  }
  
  /** Returns if the word is in the trie. */
  public boolean search(String word) {
      if(map.containsKey(word))
      {
          return map.get(word);
      }
      return false;
  }
  
  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
      
      for(Map.Entry<String, Boolean> entry : map.entrySet())
      {
          if(entry.getKey().startsWith(prefix))
          {
              return true;
          }
      }
      
      return false;
  }
}

/**
* Your Trie object will be instantiated and called as such:
* Trie obj = new Trie();
* obj.insert(word);
* boolean param_2 = obj.search(word);
* boolean param_3 = obj.startsWith(prefix);
*/