package com.example.demo;

import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Functions {

    private static final RandomGenerator rng = new Well19937c();

    private Functions() {
    }



    public static double[] softmax(double[] raw) {
        return softmax(raw, 1.0);
    }


    public static double[] ln(double[] ps) {
        return Arrays.stream(ps).map(Math::log).toArray();
    }

    public static double[] softmax(double[] raw, double temperature) {
        if (temperature == 0) {
            return softmax0(raw);
        }
        double max = Arrays.stream(raw).max().getAsDouble();
        raw = Arrays.stream(raw).map(x -> (x - max) / temperature).toArray();
        double[] vs = Arrays.stream(raw).map(Math::exp).toArray();
        double sum = Arrays.stream(vs).sum();
        return Arrays.stream(vs).map(v -> v / sum).toArray();
    }

    private static double[] softmax0(double[] raw) {
        double[] result = new double[raw.length];
        int maxi = 0;
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < raw.length; i++) {
            if (raw[i] > max) {
                maxi = i;
                max = raw[i];
            }
        }
        result[maxi] = 1.0;
        return result;
    }

    public static double[] f2d(float[] ps) {
        return IntStream.range(0, ps.length).mapToDouble(i -> ps[i]).toArray();
    }
    public static float[] d2f(double[] ps) {
        float[] result = new float[ps.length];
        for (int i = 0; i < ps.length; i++) {
            result[i] = (float) ps[i];
        }
        return result;
    }

    public static float[] b2f(boolean[] ps) {
        float[] result = new float[ps.length];
          for (int i = 0; i < ps.length; i++) {
                result[i] = ps[i] ? 1f : 0f;
          }

        return result;
    }
    public static double entropy(double[] ps) {
        return Arrays.stream(ps).reduce(0d, (e, p) -> e + singleEntropySummand(p));
    }

    public static double entropy(List<Float> ps) {
        return ps.stream().reduce(0f, (e, p) -> e + (float) singleEntropySummand(p));
    }

    public static double singleEntropySummand(double p) {
        if (p == 0 || p == 1) {
            return 0;
        }
        return -p * Math.log(p);
    }



    public static int draw(double[] ps) {
        double rand = ThreadLocalRandom.current().nextDouble();
        double s = 0d;
        for (int i = 0; i < ps.length; i++) {
            s += ps[i];
            if (s >= rand) {
                return i;
            }
        }
        throw new MuZeroException("problem in drawing from discrete probability distribution");
    }

    public static boolean draw(double p) {
        double rand = ThreadLocalRandom.current().nextDouble();
        return rand < p;
    }


    public static double[] add(double[] a, double[] b) {
        if (a.length != b.length) {
            throw new MuZeroException("vectors in add operation should have the same length");
        }
        return IntStream.range(0, a.length).mapToDouble(
            i -> a[i] + b[i]
        ).toArray();
    }
}
