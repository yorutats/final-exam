package test70;

import java.util.LinkedHashSet;
import java.util.Set;

public class test49 {
    public static void main(String[] args) {
        Set<String> student = new LinkedHashSet <>();
        Set<String> englidh = new LinkedHashSet <>();
        Set<String> math = new LinkedHashSet <>();
        Set<String> result = new LinkedHashSet <>();
        String[] name={"John","Mary","Tina","Fiona","Claire","Eva","Ben","Bill","Bert"};
        String[] en={"John","Mary","Fiona","Claire","Ben","Bill"};
        String[] ma={"Mary","Fiona","Claire","Eva","Ben"};
        for (int i = 0; i < name.length; i++) {
            student.add(name[i]);
        }
        for (int i = 0; i < en.length; i++) {
            englidh.add(en[i]);
        }
        for (int i = 0; i < ma.length; i++) {
            math.add(ma[i]);
        }
        
        result.clear();
        result.addAll(englidh);
        result.retainAll(math);
        System.out.println("英文與數學都及格"+result);

        result.clear();
        result.addAll(student);
        result.removeAll(math);
        System.out.println("數學不及格"+result);

        result.clear();
        result.addAll(englidh);
        result.removeAll(math);
        System.out.println("英文及格且數學不及格"+result);
    }
}
