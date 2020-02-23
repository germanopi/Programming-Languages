#include <stdio.h> // Basic Syntax
#include <stdlib.h> // Basic Syntax

int main() { // Basic Syntax

    // Variables
    char support[256] = "John"; // It's a char list with 256 locations
    char name[256];

    int age;
    int count=0;

    char player1[256];
    char player2[256];

    // Logic
    printf("Hello I'm the support %s and what's your name and age?\n",support); // Show on console, %s will receive a STRING value from support and \n break line
    scanf("%s",&name); // name will receive a STRING value from user
    scanf("%d",&age); // age will receive a DIGIT value from user
    printf("Your name first letter is: %c\n",name[0]); // // Show on console, %c will receive a CHAR value from name and \n break line
    printf("I understood %s you said you have %d years\n",name,age); // Show on console, %s will receive a STRING value from name and %d will receive a DIGIT value from age and \n break line

    if(age >= 18){
         printf("You are an adult\n");
    }else if(age >=10) {
         printf("You a teenager\n");
    }else if(age>=0){
         printf("You are a kid\n");
    }else{
         printf("You can't have this age\n");
    }

    while(count<=age && age>=0){
        printf("You already had: %d years\n",count);
        count++;
        if(count>age){
            printf("Next year you'll have: %d years\n",count);
        }
    }

    // Rock, Paper and Scissor
    printf("Player1, your turn\n");
    scanf("%s",&player1);
    printf("Player2, your turn\n");
    scanf("%s",&player2);


        if(strcmp(player1,"rock")==0){ // Compare strings, they're the same if equal 0
                if(strcmp(player2,"rock")==0){
                        printf("Draw\n");
                }else if(strcmp(player2,"paper")==0){
                        printf("Player2 won\n");
                }else if(strcmp(player2,"scissor")==0){
                        printf("Player1 won\n");
                }else{
                        printf("Player2 this option doesn't exist\n");
                }
        }else if(strcmp(player1,"paper")==0){
                if(strcmp(player2,"rock")==0){
                        printf("Player1 won\n");
                }else if(strcmp(player2,"paper")==0){
                        printf("Draw\n");
                }else if(strcmp(player2,"scissor")==0){
                        printf("Player2 won\n");
                }else{
                        printf("Player2 this option doesn't exist\n");
                }
        }else if(strcmp(player1,"scissor")==0){
                if(strcmp(player2,"rock")==0){
                        printf("Player2 won\n");
                }else if(strcmp(player2,"paper")==0){
                        printf("Player1 won\n");
                }else if(strcmp(player2,"scissor")==0){
                        printf("Draw\n");
                }else{
                        printf("Player2 this option doesn't exist\n");
                }
        }else{
             printf("Player1 this option doesn't exist\n");
        }

    return 0; // Basic Syntax
}
