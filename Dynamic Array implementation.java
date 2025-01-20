class Array{
    private int arr[];
    private int count;
    //define to the constructor
    
    public Array(int size){
        arr = new int[size];
        count =0; //initiliaize to the count
    }
    
    public void printArray(){
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
        
    }
    public void insertArray(int ele){
        
        if(arr.length == count){
            
            int newArr[] = new int[2*count];
            
            for(int i=0;i<count;i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++]=ele;
    }
}
public class Main
{
	public static void main(String[] args) {
	System.out.println("Array elements are : ");
	Array num = new Array(3);
	num.insertArray(3);
	num.insertArray(40);
	num.insertArray(57);
	num.insertArray(67);
	num.insertArray(77);
	num.insertArray(97);
	num.printArray();
	
	}
}
