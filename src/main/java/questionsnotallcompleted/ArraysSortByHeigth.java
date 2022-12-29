package questionsnotallcompleted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysSortByHeigth {
    int[] solution(int[] a) {
        int x=0;
        List<Integer> list=new ArrayList<>();
        for(int w:a){
            if(w!=-1){
                list.add(w);
            }}
        Collections.sort(list);
        int[] arr=a.clone();
        for(int i=0;i<a.length;i++){
            if(arr[i]!=-1){
                arr[i]=list.get(x);
                x++;
            }
        }
        return arr;
    }
}
