#include <stdio.h>
#include <string.h>


int main(int argc, char const *argv[])
{
	
	int a,b;
	int num;
	int mod_num;
	char str_1[60];
	char str_2[60];

	printf("enter two numbers to get Greatest Common Divisor(GCD)\n");
	printf("Enter the first number:\n");
	fgets(str_1,60, stdin);
	a = atoi(str_1);
	//printf("the first number is : %d \n", a );
	printf("Enter the second number :\n");
	fgets(str_2,60,stdin);
	b = atoi(str_2);
	//printf("the second number is: %d \n", b);

	printf("GCD(%d, %d)\n", a,b);
   
	while(b != 0){
	
		if(a>b){

			num = a/b;
			mod_num = a%b;
			a = b;
			b = mod_num;
		}
		//printf("=GCD(%d , %d) \n",a,b );

		if(b>a){

			num = b/a;
			mod_num = b%a;
			a = a;
			b = mod_num; 
		}

		printf("=GCD(%d , %d) \n",a,b );




	}



	/* code */
	return 0;
}