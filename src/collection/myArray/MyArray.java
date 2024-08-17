package collection.myArray;

public class MyArray {
    String[] arr = new String[4];

    public void add(int index, String data){
        arr[index] = data;
    }

    //3추가하고싶다면

    public void addFirst(String data){
        for(int i= arr.length-1; i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]= data;
    }

    //중간 원하는 위치에 추가 하고 싶으면
    public void addAtIndex(int index, String data){
        for(int i= arr.length-1; i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]= data;
    }

    public void addLast(String data){
        arr[arr.length-1]=data;
    }


}
