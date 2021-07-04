using System;
using System.Collections.Generic;

namespace FindRoots
{
    class Program
    {
        static void Main(string[] args)
        {
            var calEpsilon = Double.MaxValue;
            var newPoints = new List<double>();

            Console.Write("Please, insert number of expression in equation: ");
            var sizeOfArr = Convert.ToInt32(Console.ReadLine());

            var power = new double[sizeOfArr];
            var factor = new double[sizeOfArr];

            Console.WriteLine("Please, insert power of equation respectively: ");
            for (int i = 0; i < sizeOfArr; i++)
                power[i] = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Please, insert factors of equation respectively: ");
            for (int i = 0; i < sizeOfArr; i++)
                factor[i] = Convert.ToDouble(Console.ReadLine());

            Console.Write("Please, insert point (a): ");
            var a = Convert.ToDouble(Console.ReadLine());

            Console.Write("Please, insert point (b): ");
            var b = Convert.ToDouble(Console.ReadLine());

            Console.Write("Please, insert epsilon value: ");
            var userEpsilon = Convert.ToDouble(Console.ReadLine());


            var fxA = FindRoot.Substitution(a, ref power, ref factor, ref sizeOfArr);
            var fxB = FindRoot.Substitution(b, ref power, ref factor, ref sizeOfArr);

            if ((fxA * fxB) < 0)
                Console.WriteLine("\nThere is some roots for this equation\n");
            else
            {
                Console.WriteLine("\nThis equation has no root\n");
                return;
            }


            for (var index = 0; userEpsilon < calEpsilon; index++)
            {
                newPoints.Add(FindRoot.Mean(ref a, ref b));

                var fx = FindRoot.Substitution(newPoints[index], ref power, ref factor, ref sizeOfArr);
                
                FindRoot.ReplacePoints(ref a, ref b, newPoints[index], ref fx, ref fxA, ref fxB);

                Console.WriteLine("Iteration # {0}\n", index + 1);
                if(index <= 1)
                    Console.WriteLine("a = {0}\nb = {1}\nf(x) = {2}", a, b, fx);
                else
                    Console.WriteLine("a = {0}\nb = {1}\nf(x) = {2} \nRelative Error = {3}", a, b, fx, calEpsilon);
                Console.WriteLine("-----------------------------------------------------------------------\n");

                if (index > 0)
                   calEpsilon = FindRoot.RelativeError(newPoints[index], newPoints[index - 1]);

                if(index == 100)
                    return;
            }
        }
    }
}