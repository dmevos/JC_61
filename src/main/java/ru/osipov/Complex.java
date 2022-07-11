package ru.osipov;

public class Complex {
    final double re;
    final double im;

    public Complex(double x, double y) {
        this.re = x;
        this.im = y;
    }

    public Complex conj() {
        return new Complex(re, -im);
    }

    public Complex sub(Complex b) {
        return new Complex(re - b.re, im - b.im);
    }

    public Complex add(Complex b) {
        return new Complex(re + b.re, im + b.im);
    }

    public Complex mul(Complex b) {
        return new Complex(re * b.re - im * b.im, re * b.im + im * b.re);
    }

    public Complex div(Complex b) {
        return this.mul(b.conj()).mul(1 / b.len2());
    }

    public Complex mul(double b) {
        return new Complex(re * b, im * b);
    }

    public double len2() {
        return re * re + im * im;
    }

    public double abs() {
        return Math.sqrt(re * re + im * im);
    }

    @Override
    public String toString() {
        return re + "+" + im + "j";
    }
}
