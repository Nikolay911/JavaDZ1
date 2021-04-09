package com.DZ1chast2.math;

public class MyPolynomial {
    public double[] coeffs;

    public MyPolynomial(double[] a) {
        coeffs = new double[a.length];
        for (int i = 0; i < a.length; i++)
            coeffs[i] = a[i];
    }

    public int getDegree() {
        return coeffs.length-1;
    }

    public String toString(){
        String str = "";
        for(int i=0;i<coeffs.length;i++){
            if(i==coeffs.length-1)
                str = str + coeffs[i] + "x^" + i;
            else
                str = str + coeffs[i] + "x^" + i + "+";
        }
        return str;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public MyPolynomial add(MyPolynomial right){
        double[] polyLength = new double[Math.max(coeffs.length, right.getCoeffs().length)];
        MyPolynomial myPolynomial = new MyPolynomial(polyLength);

        for(int i=0;i<polyLength.length;i++){

            myPolynomial.getCoeffs()[i] = coeffs[i] + right.getCoeffs()[i];
        }
        return myPolynomial;
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] polyLength = new double[(coeffs.length + right.getCoeffs().length-1)];
        MyPolynomial myPolynomial = new MyPolynomial(polyLength);
        for(int i = 0; i < coeffs.length; i++){
            for (int j = 0; j < right.getCoeffs().length; j++){

                myPolynomial.getCoeffs()[i+j] += coeffs[i] * right.getCoeffs()[j];
            }
        }
        return myPolynomial;
    }
    public double evaluate(double x){
        double a=0;
        for(int i=0;i<coeffs.length; i++){
            a += coeffs[i] * Math.pow(x, i);
        }
        return a;
    }
}

