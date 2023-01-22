public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8};

        int a_length=a.length;
        int b_length=b.length;
        int c_length=a_length+b_length;

        int[] c= new int[c_length];
        for(int i=0; i<a_length; i++){
           c[i]=a[i]; 
        }
        for(int i=0; i<b.length; i++){
            c[a.length+i]=b[i];
        }
        for(int i=0; i<c_length; i++){
            System.out.print(c[i]+" ");
        }

   }
}
