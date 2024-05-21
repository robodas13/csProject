package com.csase;

public class GPACALC {
    char lettergrade1;
    char lettergrade2;
    char lettergrade3;
    char lettergrade4;
    char lettergrade5;
    char lettergrade6;
    char lettergrade7;
    double deciGrade1;
    double deciGrade2;
    double deciGrade3;
    double deciGrade4;
    double deciGrade5;
    double deciGrade6;
    double deciGrade7;
    private GPACALC(char A, char B, char C, char D, char E, char F, char G){
        this.lettergrade1=A;
        this.lettergrade2=B;
        this.lettergrade3=C;
        this.lettergrade4=D;
        this.lettergrade5=E;
        this.lettergrade6=F;
        this.lettergrade7=G;  
    }
    private GPACALC(double a, double b, double c, double d, double e, double f, double g){
        this.deciGrade1=a;
        this.deciGrade2=b;
        this.deciGrade3=c;
        this.deciGrade4=d;
        this.deciGrade5=e;
        this.deciGrade6=f;
        this.deciGrade7=g;  
    }
    private double switchToDecimal(char grade){
        if (grade=='A'){
            return 4.0;
        }
        else if (grade=='B'){
            return 3.0;
        }
        return 0;
    }
}
