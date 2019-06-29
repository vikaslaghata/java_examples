from math import sqrt # load math module

num1 = 10
str1 = "Hello world"
print(str1.upper()+" \n\nfrom python " + str(num1 + len(str1))) # upper, new line, length, convert number to string

print(str(str1.index("wor"))) # index

print(str1.replace("Hello", "Hi")) # replace
print(str1) # no change even after replace

#number = input("Enter any number for square root: ")

#print("Square root of 16 is "+str(sqrt(float(number))))  # convert number to float, sqrt and then convert into string

list_of_friends = ["f1", "f2", "f3"]
print(list_of_friends)  # print complete list
print("Your second friend is: "+list_of_friends[1])
print(list_of_friends[1:3])  # print list from index 1 to 3(3 is not included)
print(list_of_friends[2:])  # print all elements from index 2
print(list_of_friends.index("f3"))  # check if f3 present in the list

list_of_friends.append("f4")
list_of_friends.insert(2, "f_in_between")
list_of_friends.remove("f3")
print(list_of_friends)

list_of_friends.sort()
print(list_of_friends)

list_of_friends.reverse()
print(list_of_friends)

coordinate = (4, 5)  # Tuple, you can't change the value once initialized, check the difference with list
print(coordinate[1])

# //// Functions
def say_hello(user_name, age):  # Functions defination
    print("Hello "+user_name+" your age: "+str(age))
    return True


if say_hello("Vikas", 35):  # call to function and if condition
    print("Function worked perfectly")
elif not(True):             # else if ; not()
    print("I am in else if")
else:
    print("I am in final else")

# //// Dictionary, just like HashMap in java
monthConversion = {
    "Jan": "January",
    "Feb": "February"
}

print(monthConversion)  # print all
print(monthConversion["Feb"])  # print value for "Feb" key
print(monthConversion.get("Feb"))  # print value for "Feb" key
print(monthConversion.get("Dec", "Key is not present"))  # get key with default value

# //// while loop
i = 1
while i <= 3:
    print(i)
    i += 1
    # break      # it will break the loop
print("Loop done")

# For loop
for friend in list_of_friends:
    print(friend)

for index in range(5):
    print(index)   # Print 0,1,2,3,4

#  If with "in" option
letter = "A"
if letter.upper() in "AEIOU":
    print("letter is a vowel")

#  Exception Handling
divider = 0
try:
    result = 5/divider
    print(result)
except ZeroDivisionError as err:
    print("very bad to divide by 0: "+str(err))
except:
    print("Generic exception got")

#  Inheritance
from python.com.core import base_for_inheritance   # This also can be at top of this file.
#  100s of ready made modules are availble in python, we can check details on
#  https://docs.python.org/3/py-modindex.html and import as per requirment
base_for_inheritance.do_something()

# new external module can install by pip, it's a package managment system to install or uninstall a module


