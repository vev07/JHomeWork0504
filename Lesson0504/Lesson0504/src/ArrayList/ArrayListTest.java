package ArrayList;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> family2 = new ArrayList<>();
        ArrayList<String> family3 = new ArrayList<>();
        family.add("Yevhen");
        family.add("Irina");
        family.add("Karyna");
        family.add("Zlata");
        family.add("Withe");
        family2.add("Yevhen");
        family2.add("Irina");
        family2.add("Karyna");
        family2.add("Zlata");
        family2.add("Withe");
        System.out.println(family);
        family.remove("Withe");
        System.out.println(family);
        family.add("Withe");
        System.out.println(family);
//        family.remove(4);
//        System.out.println(family);
        System.out.println(family.equals(family2) + " equals");
        System.out.println(family.hashCode() + " family.hashCode()");
        System.out.println(family2.hashCode() + " family2.hashCode()");
        System.out.println(family.size() + " family.size()");
        family.trimToSize();
        System.out.println(family.size() + " family.size()");
        System.out.println(family.isEmpty() + " family.isEmpty()");
        System.out.println(family.contains(family2) + " family.contains(family2)");
        System.out.println(family.indexOf("Zlata") + " family.indexOf(Zlata)");
        System.out.println(family2.lastIndexOf("Zlata") + " .lastIndexOf");
        family3 = (ArrayList) family.clone();
        System.out.println(family3 + " - (ArrayList) family.clone()");
        String[] str = new String[family.size()];
        str = family.toArray(str);
        System.out.println(Arrays.toString(str) + " family.toArray(str)");//Why does it need?
        System.out.println(family.get(1) + " - family.get(1)");
        family.set(4, "WITHE");
        System.out.println(family + " - family.set(4, WITHE)");
        family.clear();
        System.out.println(family + " - family.clear()");
        family = (ArrayList<String>) family2.clone();
        System.out.println(family);
        family.addAll(family2);
        System.out.println(family + " - family.addAll(family2)");
        //family3.removeRange();
        family.removeAll(family3);
        System.out.println(family);
        family2.retainAll(Collections.singleton("Yevhen"));
        System.out.println(family2);
        ListIterator<String> iterator = family3.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Value is : " + iterator.next());}
            List<String> family5 = family3.subList(0,2);
            System.out.println(family5 + " - family3.subList(0,2)");


    }
}
