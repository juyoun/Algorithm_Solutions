#include <stdio.h>

int main(void){
    int N;
    scanf("%d", &N);
    int num[3] = {0, 0, 0};
    int cnt = 0;
    
    for(int i=1; i<=N; i++){
        num[0] = i / 100;
        num[1] = (i % 100) / 10;
        num[2] = i % 10;
            
        if(num[0] != 0){ // 세 자리 수
            if((num[0] - num[1]) == (num[1] - num[2]))
                cnt++;
        }
        else{ // 한 자리 수 & 두 자리 수
            cnt++;
        }
    }
    
    printf("%d", cnt);
    return 0;
    
}