package com.TcaNqit.Coding;
//Find the 15th term of the series
//0,0,7,6,14,12,21,18,28
/*
__1___2___3___4____5____6____7____8___9____10___11___12___13___14___15____
| 0 | 0 | 7 | 6 | 14 | 12 | 21 | 18 | 28 | 24 | 35 | 30 | 42 | 36 | 49 |
--0---1---2---3----4----5----6----7----8----9---10---11---12---13---14----
 */
public class Question13 {
    public static void main(String[] args) {
        int[] series=new int[20];
        int num=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<2;j++){
                if((i+1)%2==0)
                    series[num]=i*7;
                else
                    series[num]=i*6;
                num++;
            }
        }
        System.out.println("The Fifteenth Term in this series: "+series[14]);
    }
}
/*
The Fifteenth Term in this series: 49
 */