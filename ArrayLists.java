import java.util.*;

public class ArrayLists {
    
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<Integer>();

        // adding elements to list
        list.add(1);
        list.add(-10);
        System.out.println(list);

        // adding element at specific index
        list.add(1, 10);
        System.out.println(list);

        System.out.println(list.get(1));

        list.set(2,30);
        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);

        System.out.println(list.size());
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            int e = sc.nextInt();
            list.add(e);
        }

        System.out.println(list);
        
        System.out.println(RemoveEven(list));

    }

    public static ArrayList<Integer> RemoveEven(ArrayList<Integer> arrayList)
    {
        for (int i = arrayList.size()-1; i>=0;i--) {
            System.out.println(arrayList.get(i)%2);
            if(arrayList.get(i)%2 == 0){
                arrayList.remove(i);
            }
        }
        return arrayList;
    }
}
