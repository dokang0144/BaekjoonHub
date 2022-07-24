using System;
using System.Text;

namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
        	int N = int.Parse(Console.ReadLine());

            int[] arr = new int[N];

            for(int i=0; i<N; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }

            Array.Sort(arr);

            StringBuilder sb = new StringBuilder(string.Join("\n", arr));

            Console.WriteLine(sb);
        }
    }
}