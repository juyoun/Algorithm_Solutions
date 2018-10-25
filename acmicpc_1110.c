https://www.acmicpc.net/problem/1110

#include <stdio.h>
int main(){
    int N;
    int counter = 0;
    
    scanf("%d", &N);
    
    int num[2] = {0, 0}; // 한 자리 수 대비 초기화
    num[0] = N / 10;
    num[1] = N % 10;
    
    do{
        counter++;
        int temp = num[1];
        num[1] = (num[0] + num[1]) % 10;
        num[0] = temp;
    } while(10 * num[0] + num[1] != N);
    
    printf("%d\n", counter);
    return 0;
}
