/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetematematico;
import matematico.*;
/**
 *
 * @author will
 */
public class PaqueteMatematico {

    /**s
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TEST DE OPERACIONES");
        //Declarando y escribiendo point3
        Point3 p3 = new Point3(3,4,0);
        System.out.println("point3:");
        writePoint(p3);
        
        //decalrar y mostrar matrix3x3
        double[][] aux = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix3x3 m3 = new Matrix3x3(aux);
        System.out.println("Matrix3x3:");
        writeMatrix(m3);
        
        //Realizar operaciones y mostrar resultado
        System.out.println("despues de la operacion matrix3x3 por un Point3:");
        Point3 r1 = new Point3(Matrix3x3.times(m3,p3));
        writePoint(r1);
        
        //Declarando y escribiedo un point4
        Point4 p4 = new Point4(3,4,3,0);
        System.out.println("point4:");
        writePoint(p4);
        
        //decalrar y mostrar matrix3x3
        double[][] aux2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Matrix4x4 m4 = new Matrix4x4(aux2);
        System.out.println("Matrix4x4:");
        writeMatrix(m4);
        
        //Realizar operaciones y mostrar resultado
        System.out.println("despues de la operacion matrix4x4 por un Point4:");
        Point4 r2 = new Point4(Matrix4x4.times(m4,p4));
        writePoint(r2);
        
        //matrix por matrix
        System.out.println("despues de la operacion matrix3x3 por Matrix4x4:");
        Matrix3x3 r3 = new Matrix3x3(Matrix3x3.times(m3,m3));
        writeMatrix(r3);
        
        //matrix por matrix
        System.out.println("despues de la operacion matrix4x4 por Matrix4x4:");
        Matrix4x4 r4 = new Matrix4x4(Matrix4x4.times(m4,m4));
        writeMatrix(r4);
    }
    
    static void writePoint(Point3 p){
         System.out.println("["+p.x+","+p.y+","+p.w+"]");
    }
    
    static void writePoint(Point4 p){
        System.out.println("["+p.x+","+p.y+","+p.z+","+p.w+"]");
    }
    
    static void writeVector(Vector4 p){
        System.out.println("["+p.x+","+p.y+","+p.z+"]");
    }
    
    static void writeMatrix (Matrix3x3 m){
        System.out.print("[");
        for (int i = 0; i < m.matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m.matrix.length; j++) {
                System.out.print(m.matrix[i][j]);
                String msg = j+1 < m.matrix.length ? "," : "";
                System.out.print(msg);
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
    
    static void writeMatrix (Matrix4x4 m){
        System.out.print("[");
        for (int i = 0; i < m.matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m.matrix.length; j++) {
                System.out.print(m.matrix[i][j]);
                String msg = j < m.matrix.length ? "," : "]";
                System.out.print(msg);
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
}
