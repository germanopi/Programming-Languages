# Variables 
a,b,c=10,"text",None,True,False
array = [1,True,"hi"]
len(array) # Lenght
name=str(input("What's your name?"))  # Print question and keep answer
print("This is your name: "+ name) 
///////////////////////////////////////////////////////
# Types
int,float,complex,True,False,None,unicode,str 
print(type(a))
///////////////////////////////////////////////////////
# operadores
+,-,*,%,>,<,>=,<=,==,!=,not,and,or,,&,|
/  # double division
// # int division
** # potency 
+= # union
~ # negation
in # inside
///////////////////////////////////////////////////////
# Conditional
a = 10
if(a > 10):
    print("1")
elif(a == 10):
    print("2") 
else:
    print("3")
///////////////////////////////////////////////////////
# Repetition
for num in range(10, 20): #10,11,12,13,14,15,16,17,18,19,final
    print(str(num)) 
else:
    print("final") 

a = 0 
b=[1,2,3]
while a is not 5: # Print [1,2,3] 5 times
    print(b)
    a+=1

while True:
    print(True)
    break   #stop while
///////////////////////////////////////////////////////
# Function
def is2(num):
    if(num==2):
        print("it's 2")
    else:
        print("it's not 2")
is2(num=3)
///////////////////////////////////////////////////////
# List 
a=[0]
a.extend([1,2,3]) # [0,1,2,3]
a.append([4,5,6]) # [0,1,2,3,[4,5,6]]
///////////////////////////////////////////////////////
# Dictionary
dictionary = {1:"1", 2:"two", 3:True} 
print(dictionary.keys()) #[1,2,3]
print(dictionary.values()) #[1,two,True]
print(dictionary[2]) # two
dictionary.setdefault(4,None) # {1:"1", 2:"two", 3:True, 4:None} 
///////////////////////////////////////////////////////
# Sets, Order and No repetition
conjunto=set([1,2,3])
conjunto.add(4)
num=3
conjunto.add(num)
print(conjunto) #{1,2,3,4}
///////////////////////////////////////////////////////
# Imports
import json
from os import path
import sys as system
from math import *
///////////////////////////////////////////////////////
# Files
file=open('C:/Users/Germano/Desktop/Nova pasta/teste.txt','r')
lines=arquivo.readlines()
print(lines)
