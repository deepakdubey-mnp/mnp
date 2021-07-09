package io.mnp.sorter;

import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

//Given an array, find the average of all contiguous subarrays of size ‘K’ in it
public class AverageSubArray {

    public static double[] averageBrute(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        for (int i = 0; i < arr.length - k; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            result[i] = sum / k;
        }
        return result;

    }

    public static double[] averageSubArraySliding(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        int windowSum = 0;
        int start = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                result[start] = windowSum / k;
                windowSum -= arr[start];
                start++;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[1000000000];
        IntStream.range(0, 1000000000).forEach(value -> arr[value] = random.nextInt());
        Instant start = Instant.now();
        double[] result = averageSubArraySliding(arr, 100);
        System.out.println(Duration.between(Instant.now(), start));
    }
}
