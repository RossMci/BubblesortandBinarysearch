/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryserch.and.bubblesort;

import javax.swing.JOptionPane;

/**
 *
 * @author ross1
 */
public class BinaryserchAndBubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int[] mainArray = new int[10];

JOptionPane.showMessageDialog(null, "The following procedure will take place:"
+ "\n1) Fill in data to a x10 grid array"
+ "\n2) Bubble Sort will organise smallest to largest"
+ "\n3) You will be asked to select a value to search for"
+ "\n4) Program will terminate");

for (int i = 0; i < mainArray.length; i++) 
{
mainArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter a value for array cell: "+i));
}

String presortedArrayDisplay = "";
for (int a = 0; a < mainArray.length; a++) 
{
presortedArrayDisplay += mainArray[a]+" ";
}
JOptionPane.showMessageDialog(null, "Un-Sorted Array Format:"
+ "\n"+presortedArrayDisplay);
JOptionPane.showMessageDialog(null, "Commencing bubbleSort method");
bubbleSort(mainArray);

String sortedArrayDisplay = "";
for (int b = 0; b < mainArray.length; b++) 
{
sortedArrayDisplay += mainArray[b]+" ";
}
int search = Integer.parseInt(JOptionPane.showInputDialog("Please select a number from the following array format:"
+ "\n"+sortedArrayDisplay));

binarySearch(search, mainArray);

System.exit(0);
}

public static void bubbleSort(int[] mainArray)
{
int first, mid, end;

first = mainArray[0];
mid = mainArray.length / 2;
end = mainArray.length - 1;

for (int pass = 0; pass < mainArray.length; pass++) 
{
System.out.println("bubbleSort Pass Number: "+(pass+1));
for (int i = 0; i < mainArray.length - 1; i++) 
{
if(mainArray[i] > mainArray[i+1])
{
swap(mainArray, i, i + 1);
}
}
}

}
public static void swap(int[] mainArray, int first, int second)
{
int hold;
hold = mainArray[first];
mainArray[first] = mainArray[second];
mainArray[second] = hold;
}

public static void binarySearch(int search, int mainArray[])
{
int start, mid, end;
start = 0;
end = mainArray.length - 1;

while(start <= end)
{
mid = (start + end) / 2;

if(mainArray[mid] == search)
{
JOptionPane.showMessageDialog(null, "The searched value was found at cell: "+mid);
System.exit(0);
}
else if(mainArray[mid] < search)
{
start = mid + 1;
}
else
{
end = mid - 1;
}
}
               
        
    }
    
}
