public class subString {
    public static void main(String[] args) {
        String s = "welcometojava";
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
        if(s.length() >= i+3)
        arrayList.add(s.substring(i,i+3));
        }
        String smallest = arrayList.get(0), largest = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
        if(arrayList.get(i).compareTo(largest) > 0)
        {
        largest = arrayList.get(i);
        }
        if(arrayList.get(i).compareTo(smallest) < 0)
        {
        smallest = arrayList.get(i);
        }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
