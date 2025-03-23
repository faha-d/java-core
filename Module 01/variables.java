class Variables {

    public static void main(String arg[]) {

        // A variable is a container which provides us a temporary storage to store our values. It can store any type of values

        // If we want to find sum of two values we do right now like:

        // System.out.println(5 + 5);

        // Now we can store these values in a variable and then print that variable to get output.

        int num = 69;
        int num2 = 10;
        int result = num + num2;

        System.out.println(result);

        // We have multiple types of DataTypes to store multiple types of values such as an integer num, decimal num, character, boolean (Primitive). 

        // 1. int number = 45; (There are subtypes of integer use to allocate less memory)
        // 2. byte by = 127
        // 3. short sh = 558
        // 4. long lg = 5845l (Need to add l in the end to specify)

        // We have many types of variables to store specific values in the appropriate variable 

        float marks = 6.6f; // We need to add f in the end to specify if it's a short decimal number.
        System.out.println(marks);

        double total = 59.99; // To store large decimal values.
        System.out.println(total);

        // We can store characters in a variable name 'char'. We can't store character values in int and float. We can only store in single characters.

        char star = '*';
        System.out.println(star);

        // To store values based on user choice we can store them in a boolean, meaning we can store true if condition met, and false if condition dont met. 
        // like in most programming languages we can't use 0 or 1 instead of true and false in java. 😥
        boolean flag = true;
        System.out.println(flag);


    }
}