import java.util.*;
public class mobile {
    public static void main(String args[])
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"ABC");
        map.put(3,"DEF");
        map.put(4,"GHI");
        map.put(5,"JKL");
        map.put(6,"MNO");
        map.put(7,"PQRS");
        map.put(8,"TUV");
        map.put(9,"WXYZ");
        System.out.println(map.keySet());
        System.out.println(map.get(4).indexOf('G'));
        for(int i=2;i<10;i++)
        {
            for(int j=0;j<map.get(i).length();j++)
            {
                if('Z'==(map.get(i).charAt(j)))
                {
                    for(int k=0;k<=j;k++){
                        System.out.print(i);
                    }
                }
            }
        }
    }
}
