// class Solution {
//     public long countCommas(long n) {
//         long count = 0;
//         if(n<1000) return count;
//         if(n>=1000 && n<=999999) count = n-999;
//         if(n>999999){
//             count = n - 999;
//             long num = n - 999999;
//             count += num;
//         }
//         if(n>999999999){
//             count = n - 999;
//             long num = n - 999999;
//             long num2 = n - 999999999;
//             count += num + num2;
//         }
//         if(n > 999999999999L){
//             count = n - 999;
//             long num = n - 999999;
//             long num2 = n - 999999999;
//             long num3 = n - 999999999999L;
//             count += num + num2 + num3;
//         }
//         if(n > 999999999999999L){
//             count = n - 999;
//             long num = n - 999999;
//             long num2 = n - 999999999;
//             long num3 = n - 999999999999L;
//             long num4 = n - 999999999999999L;
//             count += num + num2 + num3;
//         }
//         if(n>=1000000000000000L) count++;
//         return count;
//     }
// }

// class Solution {
//     public long countCommas(long n) {
//         if (n <= 999) {
//             return 0;
//         } else if (n <= 999999) {
//             return n - 999;
//         } else if (n <= 999999999) {
//             return (999999 - 999)
//                     + 2 * (n - 999999);
//         } else if (n <= 999999999999L) {
//             return (999999 - 999)
//                     + 2 * (999999999 - 999999)
//                     + 3 * (n - 999999999);
//         } else if (n <= 999999999999999L) {
//             return (999999 - 999)
//                     + 2 * (999999999 - 999999)
//                     + 3 * (999999999999L - 999999999)
//                     + 4 * (n - 999999999999L);
//         }
//         return (999999 - 999)
//                 + 2 * (999999999 - 999999)
//                 + 3 * (999999999999L - 999999999)
//                 + 4 * (999999999999999L - 999999999999L)
//                 + 5 * (n - 999999999999999L);
//     }
// }

class Solution {
    public long countCommas(long n) {
        if (n <= 999) return 0;

        long totalCommas = 0;
        long start = 1000;

        while (start <= n) {
            totalCommas += n - start + 1;
            start *= 1000;
        }

        return totalCommas;
    }
}