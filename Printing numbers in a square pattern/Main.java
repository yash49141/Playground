#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  int num=1;
  for(int i=1; i<=n;i++)
  {
    for(int j=1; j<=n; j++)
    {
      printf("%d",num);
    }
  
    num=num+1;
    printf("\n");
  }
  	return 0;
}