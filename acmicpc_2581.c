#include <stdio.h>

int main(void){
    int M;
    int N;
    int sum = 0;
    int counter = 0; // 발견한 소수의 개수
    int min = 0;
    
    scanf("%d", &M);
    scanf("%d", &N);
    
    for(int i=M; i<=N; i++){
        int num = 0; // 1을 제외한 약수의 개수
        for(int j=2; j<i; j++){
            if(i % j == 0){
                num++;
            }
        }
        if(num == 0 && i != 1){
            if(counter == 0){
                min = i;
            }
            counter++;
            sum += i;
        }
    }
    
    if(counter == 0){ // 소수가 0개일 때
        printf("%d\n", -1);
    }
    else{ // 소수가 1개 이상일 때
        printf("%d\n", sum);
        printf("%d\n", min);
    }
    
    
    return 0;
}

