using System;

namespace FindRoots
{
    public class FindRoot
    {
        public static double Mean(ref double a,ref double b)
            => (a + b) / 2;

        public static double RelativeError(double p1, double p2)
            => Math.Abs((p1 - p2)) / Math.Abs(p1);


        public static double Substitution(double x, ref double[] power, ref double[] factor, ref int sizeOfArr)
        {
            double result = 0;

            for (int i = 0; i < sizeOfArr; i++)
                result += factor[i] * (Math.Pow(x, power[i]));
            return result;
        }

        public static void ReplacePoints(ref double a, ref double b, double p,
            ref double fx, ref double fxA, ref double fxB)
        {
            if (fxA < 0 && fx < 0 || fxA > 0 && fx > 0)
                a = p;
            else if (fxB < 0 && fx < 0 || fxB > 0 && fx > 0)
                b = p;
            else
                Console.WriteLine("Some Error Occurred !");
        }
    }
}