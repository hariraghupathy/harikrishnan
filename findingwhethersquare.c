#include<stdio.h>
#include<math.h>
int main()
{
    int x1,y1,x2,y2,x3,y3,x4,y4;
    scanf("%d %d",&x1,&y1);
    scanf("%d %d",&x2,&y2);
    scanf("%d %d",&x3,&y3);
    scanf("%d %d",&x4,&y4);
    int d1,d2;
    int a,b,c,d;
    a=x1-x3;
    b=y1-y3;
    c=x2-x4;
    d=y2-y4;
    d1=sqrt((a*a)+(b*b));
    d2=sqrt((c*c)+(d*d));
    if(d1==d2)
        printf("It is a square");
    else
        printf("It is not a square");
    return 0;
}
