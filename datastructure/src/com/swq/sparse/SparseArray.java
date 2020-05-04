package com.swq.sparse;

import javax.swing.*;
import javax.xml.bind.Element;

public class SparseArray {
    public static void main(String[] args) {

        int [][] a=new int[11][11];
        //System.out.println(a.length);
        a[1][2]=1;
        a[2][3]=2;

        for(int row[] :a){
            for (int element:row){
                System.out.printf("%d\t", element);
            }
            System.out.println();
        }
            int sum=0;
        for(int row[] :a){
            for (int element:row){
               if (element!=0){
                   sum++;
               }

            }
        }
int [][] parse=new int[sum+1][3];
        parse[0][0]=a.length;
        parse[0][1]=a.length;
        parse[0][2]=sum;
int rowNo=1;
        for (int i=0;i<a.length;i++){
           for (int j=0;j<a.length;j++){
if (a[i][j]!=0){
    parse[rowNo][0]=i;
    parse[rowNo][1]=j;
    parse[rowNo][2]=a[i][j];
    rowNo++;
}

              }
        }

        for (int row[]:parse)
        {
         for (int element:row){
             System.out.printf("%d\t",element);
         }
            System.out.println();


        }

int[][] reverse=new int[parse[0][0]][parse[0][1]];
     for (int i=1;i<sum+1;i++){
         reverse[parse[i][0]][parse[i][1]]=parse[i][2];
     }

        for (int row[]:reverse)
        {
            for (int element:row){
                System.out.printf("%d\t",element);
            }
            System.out.println();


        }


    }
}
