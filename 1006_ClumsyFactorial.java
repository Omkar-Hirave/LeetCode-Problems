class Solution{
public int clumsy(int N) {
    int tempResult = N ; 
    int total = 0 ;
    char op = '*';
    while(N > 1){
        switch(op){
            case '*':
            N--;
            tempResult *= N;
            op = '/';
            break;

            case '/':
            N--;
            tempResult /= N ;
            op = '+';
            break;

            case '+':
            N--;
            tempResult += N;
            op = '-';
            break;
            
            case '-':
            N--;
            total += tempResult;
            tempResult = (-1) * N;
            op = '*';
            break;
        }
    }
    return tempResult + total;
}
}
