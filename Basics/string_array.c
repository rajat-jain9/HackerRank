#include<stdio.h>
//c string array
int main() {
  int a = 12;
  int i=0;
  int arr[5] = {1,2,3,4,5};
  char c ='c';
  char str[10] = "Rajat jain";
   char ch_arr[3][10] = {
                             "spike jj",
                             "tom",
                             "jerry"
                         };
     char *sports[] = {
                         "golf jjj",
                         "hockey",
                         "football",
                         "cricket",
                         "shooting"
                     };

  printf("integer= %d",a);

  printf("\n");
  printf("char= %c",c);

  printf("\n");
  printf("string= %s",str);
  printf("\n");
  printf("\n");

  for(i=0;i<5;i++) {
      printf("value[%d]= %d\n ",i,arr[i]);
  }

  printf("\n");
  printf("\n");
  for(i = 0; i < 3; i++)
    {
        printf("string = %s\n", ch_arr[i]);
    }

    printf("\n");

    for(i = 0; i < 5; i++)
    {
        printf("String = %s\n", sports[i]);
    }
  return 0;
}
