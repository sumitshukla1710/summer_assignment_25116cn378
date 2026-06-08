# include <stdio.h>
int main() {

int base,power;
int result=1;
printf("enter the base:\n");
scanf("%d",&base);
printf("enter the power:\n");
scanf("%d",&power);
for( int i=1;i<=power;i++){

    result=result*base;
}
printf(" the result of %d^%d is %d ", base,power,result);



    return 0;
}