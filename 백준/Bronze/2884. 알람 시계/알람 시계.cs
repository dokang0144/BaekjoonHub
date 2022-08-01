using System;

namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
        	String[] i = Console.ReadLine().Split(' ');
            int H = int.Parse(i[0]);
            int M = int.Parse(i[1]);

            if (H < 0 || H > 24 || M < 0 || M > 59) return;

            if(M<45)
            {
                H--;
                M += 15;
                if(H < 0)
                {
                    H = 23;
                }
            }
            else
            {
                M -= 45;
            }
            Console.WriteLine(H+" "+M);
        }
    }
}