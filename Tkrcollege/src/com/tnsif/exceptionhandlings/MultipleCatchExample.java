package com.tnsif.exceptionhandlings;
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        } 
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
    }
}

