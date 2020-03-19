# kg_palak1710_2020

This program determines whether a one-to-one mapping exists between two given strings.

Time complexity - O(n)
Space complexity - O(n)
where n is the length of the string.

A boolean variable flag is used to store whether the mapping is true or false. A hashmap is used to store the one-to-one mapping of each character in the string. If a key is found, the program checks whether it's respective value matches the character in the string, otherwise the flag variable is assigned as false. If the mapping does not already exist, it adds those values to the hashmap. Finally, the flag variable is printed.