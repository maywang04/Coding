/** 99乘法表
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clark
 */
public class Table99 {

    public static void main(String[] args) {
        for (int i = 1, j = 1; j < 10; i = (i == 9) ? (j++ / j) + 1 : i + 1) {
            System.out.printf("%d*%d=%2d%c", i, j, i * j, (i == 9) ? '\n' : '\t');
        }
    }
}