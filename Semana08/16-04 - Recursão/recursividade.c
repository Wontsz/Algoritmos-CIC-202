#include <stdio.h>

// fatorial recursivo
float fat(int n){
    // Caso Base
    if(n<=1) return 1;
    // Recursão
    return n * fat(n-1);
}

int fib(int n){
    // Caso Base
    if(n <= 1) return 1;
    return fib(n-1) + fib(n-2);
}

int soma_vet(int v[], int i, int tamanho){
    if(i < tamanho){
        // Recursao
        return v[i] + soma_vet(v, i+1, tamanho);
    }
    // Caso Base
    return 0;
}

int main()
{
    for(int i=0; i<15; i++){
        printf("fatorial de %d: %.0f\n", i, fat(i));
    }
    
    for(int i=0; i<20; i++){
        printf("fibonacci em %d: %d\n", i, fib(i));
    }
    
    int v[5];
    int s = 0;
    for(int i=0; i<5; i++){
        v[i] = i+1;
        s += v[i]; // s = s + v[i]
    }
    printf("%d\n", s);
    printf("%d\n", soma_vet(v,0,5));
    
    return 0;
}
