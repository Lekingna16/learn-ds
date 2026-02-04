import java.util.Arrays;

public class MergeSort {
    // thuat toan merge sort la thuat toan chia de tri, sap xep 1 mang bang cach chia no thanh
    // cac mang nho hon, sau do ghep no lai voi nhau theo dung thu tu mang duoc sap xep
    // chia: thuat toan bat dau bang viec chia mang thanh cac phan nho hon va nho hon cho den
    // khi moi mang con chi con 1 phan tu
    // thuat toan nay hop nhat cac phan tu nho cua mnag lai voi nhau bang cach dat cac gia tri
    // nho nhat len truoc tao ra 1 mang da duoc sap xep
    // viec phan tach va gop mang duoc thuc hien theo cach de quy
    // cach thuc hoat dong:
    // 1. chia mang duoc sap xep thanh 2 mang con, co kich thuoc bang mot nua mang ban dau
    // 2. tiep tuc chia 2 mang con mien la phan hien tai cua mang nhieu hon 1 phan tu
    // 3. ghep 2 mang con lai voi nhau bang cach luon dat gia tri thap nhat len truoc
    // 4. tiep tuc ghep khi khong con mang con nao nua
    // trien khai thuat toan:
    // 1. mot mang chua cac gia tri can sap xep
    // 2. mot ham nhan vao mot mang , chia thanh 2 phan, va goi lai chinh no de chia cac mang con
    // cho den khi mang con chi con 1 phan tu duy nhat
    // 3. mot ham khac hop nhat cac mang con lai voi nhau theo thu tu da sap xep


    // su dung cach de quy
    private static int[] mergeSort (int[] arr){
        if (arr.length <= 1)
            return arr;
        int mid = arr.length / 2;
        int [] leftHalf = new int[mid];
        int [] rightHalf = new int [arr.length - mid];

        for (int i = 0; i < mid; i++){
            leftHalf[i] = arr[i];
        }

        int j = 0;
        for (int i = mid; i < arr.length; i++){
            rightHalf[j++] = arr[i];
        }

        int [] softedLeft = mergeSort(leftHalf);
        int [] softedRight = mergeSort(rightHalf);

        return merge (softedLeft, softedRight);
    }



    private static int[] merge(int[] softedLeft, int[] softedRight) {
        int [] result = new int [softedRight.length + softedLeft.length];
        int i = 0, j = 0, k = 0;

        while (i < softedLeft.length && j < softedRight.length){
            if (softedLeft[i] < softedRight[j]){
                result[k++] = softedLeft[i++];
            }
            else result[k++] = softedRight[j++];

        }
        while (i < softedLeft.length){
            result[k++] = softedLeft[i++];
        }

        while (j < softedRight.length){
            result[k++] = softedRight[j++];
        }

        return result;
    }






    public static void main(String[] args) {
        int [] arr = {3, 5, 2, 4, 1, 4, 8, 2, 3, 9};
        int [] newArray = mergeSort(arr);
        for (int x : newArray){
           System.out.print(x + " ");
       }


    }

}
